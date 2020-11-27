package com.neo.tpsaludable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.tpsaludable.model.Paciente;

@Repository 
public interface PacienteRepository extends JpaRepository<Paciente,Long> {
	
	public Paciente findByUsername(String username);
}
