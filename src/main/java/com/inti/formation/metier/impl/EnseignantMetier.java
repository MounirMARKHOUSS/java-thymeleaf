package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IEnseignantMetier;
 
import com.inti.formation.models.Enseignant;
import com.inti.formation.models.Pfe;

import com.inti.formation.repositories.IEnseignantRepository;
import com.inti.formation.repositories.IPfeRepository;
 
 
 
@Service
public class EnseignantMetier implements IEnseignantMetier {
	@Autowired
	private IEnseignantRepository repo;
 
	@Override
	public void saveOrUpdate(Enseignant e) {
		 repo.save(e);
		
	}

	@Override
	public Enseignant get(long id) {
		 
		return (Enseignant)repo.findById(id).get();
	}

	@Override
	public Enseignant getById(long id) {
 
		return (Enseignant)repo.getOne(id);
	}

	@Override
	public void delete(long id) {
		 repo.deleteById(id);
		
	}

	@Override
	public List<Enseignant> findAll() {
		 
		return repo.findAll();
	}

	@Override
	public boolean login(String email,String  password) {
	  Enseignant enseignant = repo.checke(email, password);
	  
	  if(enseignant==null) {
			
			return false;
		}
		else
			return true;
		 
	}

	 
	 
	
	 

	 
	@Override
	public void saveOrUpdatee(Pfe p) {
		 repo.save(p) ; 
		
	}
 
 } 
