package com.neo.tpsaludable.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import com.neo.tpsaludable.Utils.ComidaDiaria;

@Entity
@Table(name="informe")
public class Informe {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
	private ComidaDiaria comidaDiaria;
	private String comidaPrincipal;
	private String comidaSecundaria;
	private String bebida;
	private String postre;
	private boolean ingerioPostre;
	private boolean tentacion;
	private String tentacionAlimento;
	private boolean hambre;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ComidaDiaria getComidaDiaria() {
		return comidaDiaria;
	}

	public void setComidaDiaria(ComidaDiaria comidaDiaria) {
		this.comidaDiaria = comidaDiaria;
	}

	public String getComidaPrincipal() {
		return comidaPrincipal;
	}

	public void setComidaPrincipal(String comidaPrincipal) {
		this.comidaPrincipal = comidaPrincipal;
	}

	public String getComidaSecundaria() {
		return comidaSecundaria;
	}

	public void setComidaSecundaria(String comidaSecundaria) {
		this.comidaSecundaria = comidaSecundaria;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

	public boolean isIngerioPostre() {
		return ingerioPostre;
	}

	public void setIngerioPostre(boolean ingerioPostre) {
		this.ingerioPostre = ingerioPostre;
	}

	public boolean isTentacion() {
		return tentacion;
	}

	public void setTentacion(boolean tentacion) {
		this.tentacion = tentacion;
	}

	public String getTentacionAlimento() {
		return tentacionAlimento;
	}

	public void setTentacionAlimento(String tentacionAlimento) {
		this.tentacionAlimento = tentacionAlimento;
	}

	public boolean isHambre() {
		return hambre;
	}

	public void setHambre(boolean hambre) {
		this.hambre = hambre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Paciente getPaciente() {
		paciente.setInformes(null);
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
}

