package com.smallmac.gestorexamenes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smallmac.gestorexamenes.commons.ConnectionJDBC;
import com.smallmac.gestorexamenes.domain.Curso;

public class CursoRepositoryImpl implements CursoRepository{

	@Override
	public List<Curso> getTodosCursos() {
		// TODO Auto-generated method stub
		List<Curso> cursos = new ArrayList<>();
		Curso curso = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = ConnectionJDBC.getConnection();
			String sql="select * from tdp_curso";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				curso = new Curso();
				curso.setIdcurso(rs.getInt(1));
				curso.setDescripcion(rs.getString(2));
				cursos.add(curso);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cursos;
	}

}
