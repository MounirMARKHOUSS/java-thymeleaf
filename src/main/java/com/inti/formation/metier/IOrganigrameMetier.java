package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Organigrame;

public interface IOrganigrameMetier {
	public void saveOrUpdate(Organigrame o);
	
	public Organigrame  get(long id);
	
	public Organigrame getById(long id);
	
	public List<Organigrame> findAll();
	
	public void delete(long id);
	
	
}
