package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inti.formation.models.Etudiant;
 
 

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {

	 
	      @Query(value="select * from Etudiant  where  email=:x AND password=:y",nativeQuery=true)   
     Etudiant check(@Param("x")String  email ,@Param("y")String  password  );
	
}
