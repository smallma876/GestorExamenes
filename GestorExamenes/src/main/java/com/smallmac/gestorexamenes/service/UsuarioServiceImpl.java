package com.smallmac.gestorexamenes.service;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Usuario;
import com.smallmac.gestorexamenes.repository.UsuarioRepository;
import com.smallmac.gestorexamenes.repository.UsuarioRepositoryImpl;

public class UsuarioServiceImpl implements UsuarioService {

	UsuarioRepository usuarioRepository = new UsuarioRepositoryImpl();
	
	@Override
	public Usuario getUsuarioLogin(Usuario usuario) {
		// TODO Auto-generated method stub
		usuario = usuarioRepository.getUsuarioLogin(usuario);
		return usuario;
	}

	@Override
	public List<String> getPermisos(int idPerfil) {
		// TODO Auto-generated method stub
		return usuarioRepository.getPermisos(idPerfil);
	}

}
