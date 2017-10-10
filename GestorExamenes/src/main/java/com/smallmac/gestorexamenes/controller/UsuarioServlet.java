package com.smallmac.gestorexamenes.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallmac.gestorexamenes.domain.Usuario;
import com.smallmac.gestorexamenes.service.UsuarioService;
import com.smallmac.gestorexamenes.service.UsuarioServiceImpl;


@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Usuario oUsuario = new Usuario();
    UsuarioService usuarioService= new UsuarioServiceImpl();
    
    public UsuarioServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if("login".equalsIgnoreCase(request.getParameter("login"))){
			oUsuario.setUsuario(request.getParameter("usuario"));
			oUsuario.setContrasenia(request.getParameter("contrasenia"));
			Usuario _usuario= new Usuario();
			_usuario = usuarioService.getUsuarioLogin(oUsuario);
			request.setAttribute("usuario", _usuario);
			request.setAttribute("listaPermisos", usuarioService.getPermisos(_usuario.getIdperfil()));
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}
	
	
	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
	
}
