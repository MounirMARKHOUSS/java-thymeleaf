package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Pfe;

public interface IPfeMetier {

public void saveOrUpdate(Pfe p);

public  Pfe get(long id);
	
public  Pfe getById(long id);	

public List<Pfe> findAll();

public void delete(long id);
}
