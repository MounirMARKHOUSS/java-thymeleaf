package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IReunion_TravailMetier;
import com.inti.formation.models.Reunion_Travail;
import com.inti.formation.repositories.IReunion_TravailRepository;
 

 

@Service
public class Reunion_travailMetier implements IReunion_TravailMetier  {
	@Autowired
	private IReunion_TravailRepository 	repo;
	@Override
	public void saveOrUpdate(Reunion_Travail  r) {
		repo.save(r);
		
	}

	@Override
	public Reunion_Travail get(long id) {
	 
		return (Reunion_Travail )  repo.findById(id).get()  ;
	}

	@Override
	public Reunion_Travail  getById(long id) {
	 
		return (Reunion_Travail )  repo.getOne(id) ;
	}

	@Override
	public List<Reunion_Travail> findAll() {
	 
		return repo.findAll();
	}

	@Override
	public void delete(long id) {
	repo.deleteById(id);
		
	}
  
	 
	 

}
