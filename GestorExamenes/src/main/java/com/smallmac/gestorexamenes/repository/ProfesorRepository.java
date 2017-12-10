package com.smallmac.gestorexamenes.repository;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Profesor;
import com.smallmac.gestorexamenes.domain.Usuario;

public interface ProfesorRepository {

	public List<Profesor> getTodosProfesores();
	public int registrarProfesor(Profesor profesor,Usuario usuario);
}
