package com.inti.formation.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Section implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_section;
	private String nom_section;
	private String duree_pfe;
	private String duree_soutnance;
	@OneToMany(mappedBy ="section")
	private List<Etudiant> etudiants;
	@OneToMany(mappedBy ="section")
	private  List<Semmaine_Soutenance> semmaine_Soutenances;
	
}
