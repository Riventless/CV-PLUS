package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Advisory;
import com.example.entities.ServicioXAdviser;

@Repository
public interface ServicioXAdviserRepository extends JpaRepository<ServicioXAdviser, Long> {

}
