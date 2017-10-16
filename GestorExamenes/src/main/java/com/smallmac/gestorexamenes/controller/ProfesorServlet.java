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
import com.smallmac.gestorexamenes.domain.Profesor;
import com.smallmac.gestorexamenes.service.ProfesorService;
import com.smallmac.gestorexamenes.service.ProfesorServiceImpl;

/**
 * Servlet implementation class ProfesorServlet
 */
@WebServlet("/ProfesorServlet")
public class ProfesorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ProfesorService servicioProfesor=new ProfesorServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfesorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if("fillProfesores".equalsIgnoreCase(request.getParameter("tipo"))){
			List<Profesor> profesores = new ArrayList<>();
			profesores = servicioProfesor.getTodosProfesores();
			String json = new Gson().toJson(profesores);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
		}
	}

}
