package com.inti.formation.models;

import java.io.Serializable;
import java.time.LocalDate;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Semmaine_Soutenance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long  code_semmaine_soutenance;
	@Column(columnDefinition = "Date") 
	@DateTimeFormat(pattern="dd-MM-yyyy")
    private LocalDate date_debut;
	@Column(columnDefinition = "Date")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	 private LocalDate date_fin;
	@Column(columnDefinition = "Date")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private   LocalDate  date_debut_depot;
	@Column(columnDefinition = "Date")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private  LocalDate date_fin_depot;
	@ManyToOne 	
	@JoinColumn(name ="sectionId")
	private Section section;
}
