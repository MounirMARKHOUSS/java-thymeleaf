package com.inti.formation.models;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
public class Enseignant extends Utilisateur implements Serializable   {
	private static final long serialVersionUID = 1L;
	
	private long matricule_grade;

	public Enseignant(long id, String nom, String prenom, String date_naissance, String cin, String email,
			String adresse, String tel, String password, long matricule_grade) {
//		super(id, nom, prenom, date_naissance, cin, email, adresse, tel, password);
		super();
		this.matricule_grade = matricule_grade;
	}

	public Enseignant() {
		super();
	}
	
	
}
