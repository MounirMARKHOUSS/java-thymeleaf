package com.inti.formation.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Utilisateur implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
private long id;
private String nom;
private String prenom; 
private String date_naissance;
private String cin;
private String email;
private String adresse;
private String tel;
private String password;


	
	
}
