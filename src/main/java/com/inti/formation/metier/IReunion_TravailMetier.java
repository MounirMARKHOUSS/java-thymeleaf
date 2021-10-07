package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Reunion_Travail;

public interface IReunion_TravailMetier  {

	public void saveOrUpdate(Reunion_Travail r);
	
	public Reunion_Travail  get(long id);
	
	public Reunion_Travail  getById(long id);
	
	public List<Reunion_Travail> findAll();
	
	public void delete(long id);
	
}
