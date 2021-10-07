package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Personnel;

public interface IPersonnelMetier {

public void saveOrUpdate(Personnel p);

public Personnel get(long id);
	
public Personnel getById(long id);	
	
public List<Personnel> findAll();

public void delete(long id);
}
