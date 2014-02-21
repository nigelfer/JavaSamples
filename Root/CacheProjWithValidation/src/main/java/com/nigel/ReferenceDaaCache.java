package com.nigel;

import java.util.List;
import java.util.Map;

public interface ReferenceDaaCache {

	public abstract Map<String, List<RefData>> getReferenceData();

}