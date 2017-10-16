package com.smallmac.gestorexamenes.service;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Profesor;
import com.smallmac.gestorexamenes.repository.ProfesorRepository;
import com.smallmac.gestorexamenes.repository.ProfesorRepositoryImpl;

public class ProfesorServiceImpl implements ProfesorService {
	ProfesorRepository profesorRepository= new ProfesorRepositoryImpl();
	@Override
	public List<Profesor> getTodosProfesores() {
		// TODO Auto-generated method stub
		return profesorRepository.getTodosProfesores();
	}

}
