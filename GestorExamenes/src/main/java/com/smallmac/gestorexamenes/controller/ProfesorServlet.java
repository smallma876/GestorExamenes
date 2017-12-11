package com.smallmac.gestorexamenes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import com.smallmac.gestorexamenes.domain.Usuario;
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
		else if("registrarProfesor".equalsIgnoreCase(accion)){
			try {
				registrarProfesor(request,response);
				request.getRequestDispatcher("/paginas/profesores.jsp").forward(request, response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}else{
			request.getRequestDispatcher("/paginas/profesores.jsp").forward(request, response);
		}
	}
	public void registrarProfesor(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String name = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("contrasenia");
		int perfil = 1;
		String estudiosSuperiores = request.getParameter("estudiosSuperiores");
		int curso = 1;
		Date fechaIngreso = formatearFecha(request.getParameter("fechaing"));
		double salario = Double.parseDouble(request.getParameter("salario"));
		String turno = request.getParameter("turno");
		int estado = Integer.parseInt(request.getParameter("estado"));
		
		Usuario usuarioInsertado = new Usuario();
		usuarioInsertado.setNombre(name);
		usuarioInsertado.setApellido(apellido);
		usuarioInsertado.setUsuario(usuario);
		usuarioInsertado.setContrasenia(contrasenia);
		usuarioInsertado.setIdperfil(perfil);
		usuarioInsertado.setFechaIngreso(fechaIngreso);
		usuarioInsertado.setEstado(estado);
		Profesor profesor= new Profesor();
		profesor.setEstudiosSuperiores(estudiosSuperiores);
		profesor.setSalario(salario);
		profesor.setTurno(turno);
		profesor.setIdcurso(curso);
		
		
		servicioProfesor.insertarProfesor(profesor, usuarioInsertado);
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
	
	public Date formatearFecha(String fecha) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date parsed = format.parse(fecha);
		Date fechaSql = new Date(parsed.getTime());
		return fechaSql;
		
	}

}
















