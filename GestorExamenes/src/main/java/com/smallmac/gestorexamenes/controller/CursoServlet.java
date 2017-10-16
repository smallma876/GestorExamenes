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
import com.smallmac.gestorexamenes.service.CursoService;
import com.smallmac.gestorexamenes.service.CursoServiceImpl;

/**
 * Servlet implementation class CursoServlet
 */
@WebServlet("/CursoServlet")
public class CursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CursoService servicioCurso = new CursoServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CursoServlet() {
    	super();
    	System.out.println("hola ps!!");
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if("fillCursos".equalsIgnoreCase(request.getParameter("tipo"))){
			List<Curso> cursos = new ArrayList<>();
			cursos = servicioCurso.getTodosCursos();
			String json = new Gson().toJson(cursos);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
			
		}
		
		
	}
	
	
}













