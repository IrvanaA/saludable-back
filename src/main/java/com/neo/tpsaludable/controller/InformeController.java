package com.neo.tpsaludable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neo.tpsaludable.model.Informe;
import com.neo.tpsaludable.model.Paciente;
import com.neo.tpsaludable.service.InformeService;

@CrossOrigin
@RestController
@RequestMapping(path="/informe")
public class InformeController {
	
	@Autowired
	InformeService informeService;
	
	@RequestMapping(value="/saveInforme", method=RequestMethod.POST)
	public ResponseEntity<Informe> saveInforme(@RequestBody Informe i) {
		return ResponseEntity.ok().body(informeService.altaInforme(i));
	}
	
	@RequestMapping(value="/bajaInforme", method=RequestMethod.POST)
	public ResponseEntity<Informe> bajaInforme(@RequestBody Informe i) {
		informeService.bajaInforme(i);
		return ResponseEntity.ok().body(null);
	}
	
	@RequestMapping(value="/modificarInforme", method=RequestMethod.POST)
	public ResponseEntity<Informe> modificarInforme(@RequestBody Informe i) {
		return ResponseEntity.ok().body(informeService.modificacionInforme(i));
	}

}
