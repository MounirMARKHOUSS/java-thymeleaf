package com.inti.formation.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Personnel implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_personnel;
	private String  nom;
	private String  prenom;
	private String  adresse;
	private String poste;
	private String  mail;
	private String  telephone;
	@ManyToOne 	
	@JoinColumn(name ="organigrameId")
	private Organigrame organigrame;
	
}
