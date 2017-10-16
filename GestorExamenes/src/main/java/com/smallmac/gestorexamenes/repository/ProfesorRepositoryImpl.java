package com.smallmac.gestorexamenes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smallmac.gestorexamenes.commons.ConnectionJDBC;
import com.smallmac.gestorexamenes.domain.Profesor;

public class ProfesorRepositoryImpl implements ProfesorRepository {

	public List<Profesor> getTodosProfesores() {
		List<Profesor> profesores = new ArrayList<Profesor>();
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			con = ConnectionJDBC.getConnection();
			String sql="select tp.idprofesor,tp.idusuario,tu.nombre,tu.apellido,tp.idcurso,tp.EstudiosSuperiores,tc.descripcion "+
					   "from tdp_profesor tp inner join tdp_usuario tu on tp.idusuario=tu.idusuario inner join tdp_curso tc "+
					   "on tp.idcurso=tc.idcurso";
			pstm = con.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next()){
				Profesor profesor=new Profesor();
				profesor.setIdprofesor(rs.getInt(1));
				profesor.setIdusuario(rs.getInt(2));
				profesor.setNombre(rs.getString(3));
				profesor.setApellido(rs.getString(4));
				profesor.setIdcurso(rs.getInt(5));
				profesor.setEstudiosSuperiores(rs.getString(6));
				profesor.setCurso(rs.getString(7));
				profesores.add(profesor);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return profesores;
	}
	
	public int registrarProfesor() {
		return 0;
	}
	
	

}
