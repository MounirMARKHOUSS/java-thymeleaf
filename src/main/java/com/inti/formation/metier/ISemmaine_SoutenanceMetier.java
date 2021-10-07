package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Semmaine_Soutenance;

public interface ISemmaine_SoutenanceMetier {
	public void saveOrUpdate(Semmaine_Soutenance ss);

	public Semmaine_Soutenance get(long id);

	public Semmaine_Soutenance getById(long id);

	public List<Semmaine_Soutenance> findAll();

	public void delete(long id);

}
