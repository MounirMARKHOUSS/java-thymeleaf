package com.inti.formation.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.ISpetialiteMetier;

import com.inti.formation.models.Spetialite;

import com.inti.formation.repositories.ISpetialiteRepository;

@Service
public class SpetialiteMetier implements ISpetialiteMetier {

	@Autowired
	private ISpetialiteRepository repo;

	@Override
	public void saveOrUpdate(Spetialite sp) {
		repo.save(sp);

	}

	@Override
	public Spetialite get(long id) {

		return (Spetialite) repo.findById(id).get();
	}

	@Override
	public Spetialite getById(long id) {

		return (Spetialite) repo.getOne(id);
	}

	@Override
	public List<Spetialite> findAll() {

		return repo.findAll();
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);

	}

}
