package com.smallmac.gestorexamenes.domain;

public class Profesor {
		
	public int idprofesor;
	public String EstudiosSuperiores;
	public double salario;
	public String turno;
	public int idusuario;
	public int idcurso;
	
	//atributos de usuario
	public String nombre;
	public String apellido;
	public String curso;
	
	public int getIdprofesor() {
		return idprofesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}
	
	public String getEstudiosSuperiores() {
		return EstudiosSuperiores;
	}
	public void setEstudiosSuperiores(String estudiosSuperiores) {
		EstudiosSuperiores = estudiosSuperiores;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	
	
	
}
