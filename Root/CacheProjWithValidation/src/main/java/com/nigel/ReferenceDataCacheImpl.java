package com.nigel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class ReferenceDataCacheImpl implements ReferenceDaaCache {
	/* (non-Javadoc)
	 * @see com.nigel.ReferenceDaaCache#getReferenceData()
	 */
	@Override
	@Cacheable("referenceDataCache")
    public Map<String, List<RefData>> getReferenceData() {
		Map<String, List<RefData>> myMap = null;

		// Get data from somewhere.
		myMap = loadData();

		return myMap;
    }


	private Map<String, List<RefData>> loadData() {
		// this is just hardcoded for now
		Map<String, List<RefData>> myDataMap = new HashMap<String, List<RefData>>();
		List<RefData> oneRefDataList = new ArrayList<RefData>();

		RefData refData1 = new RefData("1", "USA");
		RefData refData2 = new RefData("2", "India");
		oneRefDataList.add(refData1);
		oneRefDataList.add(refData2);
		myDataMap.put("countries", oneRefDataList);

		return myDataMap;
	}

}