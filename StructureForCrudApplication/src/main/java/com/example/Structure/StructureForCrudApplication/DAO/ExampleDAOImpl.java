package com.example.Structure.StructureForCrudApplication.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Structure.StructureForCrudApplication.Entity.ExampleEntity;

@Repository
public class ExampleDAOImpl implements ExampleDAO {
		
	    //Inject Entity Manager
	private EntityManager entityManager;
	
	//create constructor for DAOJpaImpl using Entity Manager used @AutoWired annotation
	@Autowired
	public ExampleDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	//Create method for FindAll()
	@Override
	public List<ExampleEntity> findAll() {
		//Query for display records using TypeQuery 
		//List All records using getResultList()
		return null;
	}

	//Create method for FindByID()
	@Override
	public ExampleEntity findById(int id) {
		//find methods using entityManger
		return null;
	}

	//Create method for Save()
	@Transactional
	@Override
	public ExampleEntity save(ExampleEntity theEntity) {
		//merge methods using entityManger
		return null;
	}

	//Create method for DeleteByID()
	@Transactional
	@Override
	public void deleteByID(int id) {
		//find methods for specific id using entityManger
		//used remove method for delete Employee  using entityManger
	}
}
