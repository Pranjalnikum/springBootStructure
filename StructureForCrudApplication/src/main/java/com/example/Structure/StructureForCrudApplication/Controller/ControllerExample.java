package com.example.Structure.StructureForCrudApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Structure.StructureForCrudApplication.DAO.ExampleDAO;
import com.example.Structure.StructureForCrudApplication.Entity.ExampleEntity;

@RestController
@RequestMapping("name")
public class ControllerExample {

    //Inject DAO file
	private ExampleDAO exampleDAO;
	
	//create constructor for DAOJpaImpl using Entity Manager used @AutoWired annotation
	@Autowired
	public ControllerExample(ExampleDAO theExampleDAO) {
		exampleDAO = theExampleDAO;
	}
	
	//mapped all http method like get,post,put,delete
	
	//GetMapping used for display all records
	@GetMapping
	public List<ExampleEntity>findAll(){
		//return findAll method from DOA File
		return exampleDAO.findAll();
	}
	
	//GetMapping used for find by id
	@GetMapping("/id")
	public ExampleEntity getRecords(@PathVariable int id) {
		//return findByID method from DOA File
		return null;
	}
	
	//PostMapping used for add new records 
	@PostMapping
	public ExampleEntity addRecords(@RequestBody ExampleEntity theExampleEntity) {
		//setID(0) used for create new records
		//return save method from DOA File
		return null;
	}
	
	//PutMapping used for update records
	@PutMapping
	public ExampleEntity update(@RequestBody ExampleEntity theExampleEntity) {
		//return save method from DOA File
		return null;
	}
	
	//DeleteMapping used for delete records by id
	@DeleteMapping
	public String deleteRecords(@PathVariable int id) {
		//return findByID method from DOA File
		//return delete method from DOA File
		return null;
	}
}
