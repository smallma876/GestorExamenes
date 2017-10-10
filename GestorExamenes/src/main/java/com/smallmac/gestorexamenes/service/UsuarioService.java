package com.smallmac.gestorexamenes.service;

import java.util.List;

import com.smallmac.gestorexamenes.domain.Usuario;

public interface UsuarioService {
	public Usuario getUsuarioLogin(Usuario usuario);
	public List<String> getPermisos(int idPerfil);
}
