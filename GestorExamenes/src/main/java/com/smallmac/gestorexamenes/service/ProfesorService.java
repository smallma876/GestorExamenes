package com.smallmac.gestorexamenes.service;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Profesor;
import com.smallmac.gestorexamenes.domain.Usuario;

public interface ProfesorService {
	public List<Profesor> getTodosProfesores();
	public int insertarProfesor(Profesor profesor,Usuario usuario);
}
