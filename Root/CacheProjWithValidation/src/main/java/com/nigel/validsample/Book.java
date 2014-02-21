package com.nigel.validsample;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {

	@NotNull
	private String id; // cannot be NULL
	@Size(max = 50)
	private String name; // max length 50 chars.
	private String description;
	@Pattern(regexp = "[IUD]")
	private String updateFlag; // only I-insert, U-update, D-delete allowed

	public String getId() {
		return id;
	}


	public Book(String id, String name, String description, String updateFlag) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.updateFlag = updateFlag;
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
