package com.nigel;


public class Book {

	private String id;
	private String name;
	private String description;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

	public String getId() {
		return id;
	}

	public Book(String id, String name, String description, String updateFlag) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

}
