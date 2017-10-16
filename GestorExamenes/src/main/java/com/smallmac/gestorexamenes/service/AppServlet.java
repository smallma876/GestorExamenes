package com.smallmac.gestorexamenes.service;

import com.smallmac.gestorexamenes.domain.Usuario;
import com.smallmac.gestorexamenes.repository.ProfesorRepository;
import com.smallmac.gestorexamenes.repository.ProfesorRepositoryImpl;

public class AppServlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfesorService profesorService= new ProfesorServiceImpl();
//		UsuarioService servicioUsuario = new UsuarioServiceImpl();
		CursoService servicioCurso = new CursoServiceImpl();
//		Usuario oUsuario = new Usuario();
//		oUsuario.setUsuario("smallmac");
//		oUsuario.setContrasenia("1234");
//		System.out.println(servicioUsuario.getUsuarioLogin(oUsuario).getNombre());
	
		//System.out.println(servicio.getPermisos(1).size());
		//System.out.println(servicioCurso.getTodosCursos().size());
		System.out.println(profesorService.getTodosProfesores().size());
	}

}
