package com.smallmac.gestorexamenes.service;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Perfil;
import com.smallmac.gestorexamenes.repository.PerfilRepository;
import com.smallmac.gestorexamenes.repository.PerfilRepositoryImpl;

public class PerfilServiceImpl implements PerfilService{
	PerfilRepository perfilRepository=new PerfilRepositoryImpl();
	public List<Perfil> listaPerfiles(){
		return perfilRepository.listaPerfiles();
	}
}
