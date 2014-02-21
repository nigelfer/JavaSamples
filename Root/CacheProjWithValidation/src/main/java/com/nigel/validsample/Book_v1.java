package com.nigel.validsample;


public class Book_v1 {

	private String id; // cannot be NULL
	private String name; // max length 50 chars.
	private String description;
	private String updateFlag; // only I-insert, U-update, D-delete allowed

	public Book_v1() {
		super();
	}

	public Book_v1(String id, String name, String description, String updateFlag)
			throws DataValidationException {
		super();

		if (id == null) {
			throw new DataValidationException("Book id cannot be Null");
		} else {
			this.id = id;
		}

		if ((name != null) && (name.length() > 50)) {
			throw new DataValidationException(
					"Book name cannot be greater than 50 chars");
		} else {
			this.name = name;
		}

		this.description = description;

		// similarly check that updateFlag can only be I/U/D , else throw
		// exception
		this.updateFlag = updateFlag;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}

}
