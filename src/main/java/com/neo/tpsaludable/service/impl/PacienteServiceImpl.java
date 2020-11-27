package com.neo.tpsaludable.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import com.neo.tpsaludable.model.Paciente;
import com.neo.tpsaludable.repository.PacienteRepository;
import com.neo.tpsaludable.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
    private PacienteRepository pacienteRepository;

	@Override
	public Paciente altaPaciente(Paciente paciente) {
		Paciente posiblePaciente = loadUserByUsername(paciente.getUsername());
		if (posiblePaciente == null) {
			return pacienteRepository.save(paciente);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ya existe un paciente con ese usuario");
		}
	}

	@Override
	public void bajaPaciente(Paciente paciente) {
		pacienteRepository.delete(paciente);		
	}

	@Override
	public Paciente modificaPaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

	@Override
	public List<Paciente> getAllPacientes() {
		return pacienteRepository.findAll();
	}

	@Override
	public Paciente loadUserByUsername(String username){
		return pacienteRepository.findByUsername(username);
	}

	@Override
	public Paciente login(Paciente paciente) {
		Paciente pacienteALogear = loadUserByUsername(paciente.getUsername());
		if (pacienteALogear == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existe el usuario");
		}
		if (paciente.getPassword().equals(pacienteALogear.getPassword())) {
			return pacienteALogear;
		}
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Contraseña incorrecta");
	}
	
	

}
