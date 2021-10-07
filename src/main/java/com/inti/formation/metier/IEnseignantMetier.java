package com.inti.formation.metier;

import java.util.List;

import com.inti.formation.models.Enseignant;
import com.inti.formation.models.Pfe;
 
 
public interface IEnseignantMetier {
 
    public void saveOrUpdatee(Pfe p);
	
	public void saveOrUpdate(Enseignant e);

	public Enseignant get(long id);

	public Enseignant getById(long id);

	public List<Enseignant > findAll();

	public void delete(long id);
	 public   boolean  login(String modele,String model1);

 
	 
	 
}
