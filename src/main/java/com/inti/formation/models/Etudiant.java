package com.inti.formation.models;

 

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class Etudiant extends Utilisateur implements Serializable   {
	private static final long serialVersionUID = 1L;
	
	private long  num_code_etudiant;
	@ManyToOne 	
	@JoinColumn(name = "sectionId")
	private Section section;
	public Etudiant(long id, String nom, String prenom, String date_naissance, String cin, String email, String adresse,
			String tel, String password, long num_code_etudiant) {
	//	super(id, nom, prenom, date_naissance, cin, email, adresse, tel, password);
		super();
		this.num_code_etudiant = num_code_etudiant;
	}

	public Etudiant() {
		super();
	}
	
	
}
