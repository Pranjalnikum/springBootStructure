package com.example.Structure.StructureForCrudApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class ExampleEntity {
	
	@Id
	@Column(name="")
	//create variable for Column names
	private String columnname1;

	//create default constructor
	public ExampleEntity() {
	}

	//create constructor with parameters
	public ExampleEntity(String paramater1) {
		super();
		columnname1 = paramater1;
	}

	//create toString Method
	@Override
	public String toString() {
		return null;
	}

	//create getter methods
	public String getLastName() {
		return null;
	}
	//create setter methods
	public void setLastName() {
		
	}


}
