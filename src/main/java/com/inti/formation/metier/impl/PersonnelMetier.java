package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IPersonnelMetier;
import com.inti.formation.models.Personnel;
import com.inti.formation.repositories.IPersonnelRepository;
@Service
public class PersonnelMetier implements IPersonnelMetier {
	@Autowired
	private IPersonnelRepository repo;
	
	@Override
	public void saveOrUpdate(Personnel p) {
		 
		repo.save(p);
	}

	@Override
	public Personnel get(long id) {
		 
		return (Personnel) repo.findById(id).get();
	}

	@Override
	public Personnel getById(long id) {
		 
		return (Personnel)repo.getOne(id) ;
	}

	@Override
	public List<Personnel> findAll() {
	 
		return  repo.findAll();
	}

	@Override
	public void delete(long id) {
	 repo.deleteById(id);
		
	}

}
