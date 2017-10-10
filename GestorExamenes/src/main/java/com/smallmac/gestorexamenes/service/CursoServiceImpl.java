package com.smallmac.gestorexamenes.service;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Curso;
import com.smallmac.gestorexamenes.repository.CursoRepository;
import com.smallmac.gestorexamenes.repository.CursoRepositoryImpl;

public class CursoServiceImpl implements CursoService {
	CursoRepository cursoRepository=new CursoRepositoryImpl();
	@Override
	public List<Curso> getTodosCursos() {		
		return cursoRepository.getTodosCursos();
	}

}
