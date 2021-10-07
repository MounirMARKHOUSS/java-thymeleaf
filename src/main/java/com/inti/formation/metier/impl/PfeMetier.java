package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IPfeMetier;
import com.inti.formation.models.Pfe;
import com.inti.formation.repositories.IPfeRepository;

@Service
public class PfeMetier implements  IPfeMetier {
@Autowired
	
private IPfeRepository repo;

@Override
public void saveOrUpdate(Pfe p) {
	 repo.save(p);
	
}

@Override
public Pfe get(long id) {
 
	return (Pfe)repo.findById(id).get();  
}

@Override
public Pfe getById(long id) {
 
	return (Pfe)repo.getOne(id);
}

@Override
public List<Pfe> findAll() {
 
	return repo.findAll(); 
}

@Override
public void delete(long id) {
	repo.deleteById(id);
}
	
}
