package com.smallmac.gestorexamenes.repository;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Usuario;

public interface UsuarioRepository {

	
	public Usuario getUsuarioLogin(Usuario usuario);
	public List<String> getPermisos(int idPerfil);
}
