package com.neo.tpsaludable.service;

import com.neo.tpsaludable.model.Informe;

public interface InformeService {
	public Informe altaInforme(Informe informe);
	public Informe modificacionInforme(Informe informe);
	public void bajaInforme(Informe informe);
}
