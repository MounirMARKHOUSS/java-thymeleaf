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
public class Organigrame implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id_Organigrame;
	private String nom_organigrame;
	private String adresse ;
	private String email;
	private String tel;
	@OneToMany(mappedBy ="organigrame")
	private List <Personnel> personnel;
}
