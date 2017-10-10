package com.smallmac.gestorexamenes.domain;

public class Seccion {
	public int idseccion;
	public String descripcion;
	public int aula;
	public String anio;
	public String gradoAcademico;
	
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getGradoAcademico() {
		return gradoAcademico;
	}
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
	public int getIdseccion() {
		return idseccion;
	}
	public void setIdseccion(int idseccion) {
		this.idseccion = idseccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	
	
}
