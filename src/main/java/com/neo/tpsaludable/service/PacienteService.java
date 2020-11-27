package com.neo.tpsaludable.service;

import java.util.List;

import com.neo.tpsaludable.model.Paciente;

public interface PacienteService {
	public Paciente altaPaciente (Paciente paciente);
	public void bajaPaciente (Paciente paciente);
	public Paciente modificaPaciente (Paciente paciente);
	public List<Paciente> getAllPacientes();
	public Paciente loadUserByUsername(String username);
	public Paciente login(Paciente paciente);
}
