package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.ISemmaine_SoutenanceMetier;
import com.inti.formation.models.Semmaine_Soutenance;
import com.inti.formation.repositories.ISemmaine_SoutenanceRepository;

@Service
public class Semmaine_SoutenanceMetier implements ISemmaine_SoutenanceMetier {
	@Autowired
	
	private ISemmaine_SoutenanceRepository repo;
	
	@Override
	public void saveOrUpdate(Semmaine_Soutenance ss) {
		 
		 repo.save(ss);
	}

	@Override
	public Semmaine_Soutenance get(long id) {
	 
		return(Semmaine_Soutenance)repo.findById(id).get();
	}

	@Override
	public Semmaine_Soutenance getById(long id) {
	 
		return (Semmaine_Soutenance)repo.getOne(id) ;
	}

	@Override
	public List<Semmaine_Soutenance> findAll() {
		 
		return repo.findAll(); 
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
		
	}

}
