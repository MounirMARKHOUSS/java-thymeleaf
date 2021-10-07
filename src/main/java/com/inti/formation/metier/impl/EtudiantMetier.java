package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IEtudiantMetier;
import com.inti.formation.models.Etudiant;

import com.inti.formation.repositories.IEtudiantRepository;

@Service
public class EtudiantMetier implements IEtudiantMetier {
	@Autowired
	private IEtudiantRepository repo;

	@Override
	public void saveOrUpdate(Etudiant e) {
		repo.save(e);

	}

	@Override
	public Etudiant get(long id) {

		return (Etudiant) repo.findById(id).get();
	}

	@Override
	public Etudiant getById(long id) {

		return (Etudiant) repo.getOne(id);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);

	}

	@Override
	public List<Etudiant> findAll() {

		return repo.findAll();
	}

	@Override
	public boolean login(String email, String password) {

		Etudiant etudiant = repo.check(email, password);

		if (etudiant == null) {

			return false;
		} else
			return true;

	}

	@Override
	public void setAttribute(String string, long id_pfe) {
		// TODO Auto-generated method stub
		
	}

}
