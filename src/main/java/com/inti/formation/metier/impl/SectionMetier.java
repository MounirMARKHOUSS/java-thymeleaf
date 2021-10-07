package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.ISectionMetier;
 
import com.inti.formation.models.Section ;
import com.inti.formation.repositories.ISectionRepository;
@Service
public class SectionMetier implements ISectionMetier {
@Autowired
	
private ISectionRepository repo;	

@Override
public void saveOrUpdate(Section s) {
	 repo.save(s);
	
}
@Override
 
public Section get(long id) {
	
	return(Section)repo.findById(id).get();
	
}
@Override
public Section getById(long id) {
	return(Section) repo.getOne(id);
	
}

@Override
public void delete (long id) {
	repo.deleteById(id);
	
}
@Override
public List<Section> findAll(){
	
	return repo.findAll();
}


}
