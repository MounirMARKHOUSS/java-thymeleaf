package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inti.formation.models.Enseignant;
import com.inti.formation.models.Pfe;
 

public interface IEnseignantRepository extends JpaRepository <Enseignant , Long> {

	@Query(value="select * from Enseignant where  email=:M AND password=:N",nativeQuery=true )
	Enseignant checke(@Param("M")String  email ,@Param("N")String  password );

	void save(Pfe p);
 
 
 
}
