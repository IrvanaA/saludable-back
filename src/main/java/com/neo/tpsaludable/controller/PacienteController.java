package com.neo.tpsaludable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neo.tpsaludable.model.Paciente;
import com.neo.tpsaludable.service.PacienteService;

@CrossOrigin
@RestController
@RequestMapping(path="/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public ResponseEntity<List<Paciente>> getAllPacientes() {
		return ResponseEntity.ok().body(pacienteService.getAllPacientes());
	}
	
	@RequestMapping(value="/savePaciente", method=RequestMethod.POST)
	public ResponseEntity<Paciente> savePaciente(@RequestBody Paciente p) {
		return ResponseEntity.ok().body(pacienteService.altaPaciente(p));
	}
	
	@RequestMapping(value="/bajaPaciente", method=RequestMethod.POST)
	public ResponseEntity<Paciente> bajaPaciente(@RequestBody Paciente p) {
		pacienteService.bajaPaciente(p);
		return ResponseEntity.ok().body(null);
	}
	
	@RequestMapping(value="/modificarPaciente", method=RequestMethod.POST)
	public ResponseEntity<Paciente> modificarPaciente(@RequestBody Paciente p) {
		return ResponseEntity.ok().body(pacienteService.modificaPaciente(p));
	}
	
	// El login mas inseguro jeje
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<Paciente> login(@RequestBody Paciente p) {
		return ResponseEntity.ok().body(pacienteService.login(p));
	}
	
}
