package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.models.Personnel;

public interface IPersonnelRepository extends JpaRepository <Personnel,Long> {

}
