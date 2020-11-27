package com.neo.tpsaludable.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.tpsaludable.model.Informe;
import com.neo.tpsaludable.repository.InformeRepository;
import com.neo.tpsaludable.service.InformeService;

@Service
public class InformeServiceImpl implements InformeService {

	@Autowired
	InformeRepository informeRepository;
	
	@Override
	public Informe altaInforme(Informe informe) {
		informe.setFecha(new Date(System.currentTimeMillis()));
		return informeRepository.save(informe);
	}

	@Override
	public Informe modificacionInforme(Informe informe) {
		return informeRepository.save(informe);
	}

	@Override
	public void bajaInforme(Informe informe) {
		informeRepository.delete(informe);
	}

}
