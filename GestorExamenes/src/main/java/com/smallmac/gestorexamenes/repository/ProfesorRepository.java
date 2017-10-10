package com.smallmac.gestorexamenes.repository;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Profesor;

public interface ProfesorRepository {

	public List<Profesor> getTodosProfesores();
	public int registrarProfesor();
}
