package com.smallmac.gestorexamenes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.smallmac.gestorexamenes.domain.Profesor;
import com.smallmac.gestorexamenes.service.ProfesorService;
import com.smallmac.gestorexamenes.service.ProfesorServiceImpl;

/**
 * Servlet implementation class ProfesorServlet
 */
@WebServlet("/profesoresServlet")
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
		String accion = request.getParameter("accion");
		if("fillProfesores".equalsIgnoreCase(accion)){
			listarProfesores(request,response);
		}
		else{
			request.getRequestDispatcher("/paginas/profesores.jsp").forward(request, response);	
		}
	}
	
	public void listarProfesores(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Profesor> profesores = new ArrayList<>();
		profesores = servicioProfesor.getTodosProfesores();
		
		JsonElement json = new Gson().toJsonTree(profesores);
		JsonElement draw = new Gson().toJsonTree("1");
		JsonElement recordsTotal=new Gson().toJsonTree("24");
		JsonElement recordsFiltered=new Gson().toJsonTree("57");
		JsonObject jsonObject = new JsonObject();
		jsonObject.add("draw", draw);
		jsonObject.add("recordsTotal", recordsTotal);
		jsonObject.add("recordsFiltered", recordsFiltered);
		jsonObject.add("data", json);
		
		PrintWriter writer = response.getWriter();
		writer.print(jsonObject);
		writer.flush();
		writer.close();
		
	    System.out.println(jsonObject);
	}

}
