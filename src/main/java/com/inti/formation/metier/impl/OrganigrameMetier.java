package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IOrganigrameMetier;
import com.inti.formation.models.Organigrame;
 
import com.inti.formation.repositories.IOrganigrameRepository;

@Service
public class OrganigrameMetier implements IOrganigrameMetier {
@Autowired
private IOrganigrameRepository  repo;
@Override
public void saveOrUpdate(Organigrame o) {
	
	 repo.save(o);
}
@Override
public Organigrame  get(long id) {
	
	return(Organigrame) repo.findById(id).get();
}
@Override
public Organigrame getById(long id) {
	return(Organigrame)repo.getOne(id);
	
}
@Override
public void delete (long id) {
	repo.deleteById(id);
	
}
@Override
public List<Organigrame>findAll(){
	return repo.findAll();
	
}

}
