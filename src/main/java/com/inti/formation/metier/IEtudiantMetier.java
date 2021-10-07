package com.inti.formation.metier;

 

import java.util.List;

import com.inti.formation.models.Etudiant;
 

public interface IEtudiantMetier {

	public void saveOrUpdate(Etudiant e);

	public Etudiant get(long id);

	public Etudiant getById(long id);

    public List<Etudiant> findAll();

	public void delete(long id);
 
	 public   boolean  login(String modele,String model1);

	public void setAttribute(String string, long id_pfe);
}
