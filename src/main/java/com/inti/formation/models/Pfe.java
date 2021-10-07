package com.inti.formation.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pfe implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id_pfe;
	public String titre;
	public String description;
	public String rapport;
	@Column(columnDefinition = "Date") 
	@DateTimeFormat(pattern="dd-MM-yyyy")
	public LocalDate date_soutenance;
	public String heure_soutenance;
	public String salle;
	public int note;
	public String mention;
	public String etat;
	@Column(columnDefinition = "Date") 
	@DateTimeFormat(pattern="dd-MM-yyyy")
	public LocalDate date_depot;
	
	//imported
	
	
	public long getId_pfe() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTitre() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}
	public void setTitre(Object titre2) {
		// TODO Auto-generated method stub
		
	}
}
