package com.smallmac.gestorexamenes.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.smallmac.gestorexamenes.domain.Curso;
import com.smallmac.gestorexamenes.domain.Perfil;
import com.smallmac.gestorexamenes.service.PerfilService;
import com.smallmac.gestorexamenes.service.PerfilServiceImpl;

/**
 * Servlet implementation class PerfilServlet
 */
@WebServlet("/PerfilServlet")
public class PerfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PerfilService servicioPerfil = new PerfilServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerfilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if("fillPerfiles".equalsIgnoreCase(request.getParameter("tipo"))){
			List<Perfil> perfiles = new ArrayList<>();
			perfiles = servicioPerfil.listaPerfiles();
			String json = new Gson().toJson(perfiles);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
			
		}
		
	}

}
