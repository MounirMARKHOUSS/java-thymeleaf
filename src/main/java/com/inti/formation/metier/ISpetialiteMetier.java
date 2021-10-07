package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Spetialite;

 

public interface ISpetialiteMetier {

	public void saveOrUpdate(Spetialite sp);
	
	public  Spetialite get(long id);
	
	public Spetialite getById(long id);
	
	public List<Spetialite> findAll(); 
	 
	public void delete (long id);
}
