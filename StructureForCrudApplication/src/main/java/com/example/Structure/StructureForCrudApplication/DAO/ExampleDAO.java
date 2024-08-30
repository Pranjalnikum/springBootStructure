package com.example.Structure.StructureForCrudApplication.DAO;

import java.util.List;

import com.example.Structure.StructureForCrudApplication.Entity.ExampleEntity;

public interface ExampleDAO {
	
	// Defined Methods 
	
	// findAll ()
	List<ExampleEntity>findAll();
	
	//findById()
	ExampleEntity findById(int id);
	
	//save()
	ExampleEntity save(ExampleEntity theEntity);
	
	//deleteByID()
	void deleteByID(int id);
}
