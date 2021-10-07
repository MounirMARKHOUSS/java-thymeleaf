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
public class Reunion_Travail implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
 
	@Column(columnDefinition = "Date")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate date_reunion;

	private String travail_effetuer;
	private String objectif;
	
	
	
}
