package com.smallmac.gestorexamenes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smallmac.gestorexamenes.commons.ConnectionJDBC;
import com.smallmac.gestorexamenes.domain.Profesor;
import com.smallmac.gestorexamenes.domain.Usuario;

public class ProfesorRepositoryImpl implements ProfesorRepository {

	public List<Profesor> getTodosProfesores() {
		List<Profesor> profesores = new ArrayList<Profesor>();
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			con = ConnectionJDBC.getConnection();
			String sql="select tp.idprofesor,tp.idusuario,tu.nombre,tu.apellido,tp.idcurso,tp.EstudiosSuperiores,tc.descripcion,tp.salario "+
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
				profesor.setSalario(rs.getDouble(8));
				profesores.add(profesor);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return profesores;
	}
	
	public int registrarProfesor(Profesor profesor, Usuario usuario) {
		
		Connection con=null;
		PreparedStatement pstm=null;
	
		try {
			con = ConnectionJDBC.getConnection();
			String sql="insert into cbc_gestorexamenes.tdp_usuario (nombre,apellido,usuario,contrasenia,idperfil,fechaIngreso,estado)values (nombre,apellido,usuario, contrasenia,idperfil,fechaIngreso,estado);";
			pstm = con.prepareStatement(sql);
			pstm.setString(0, usuario.getNombre());
			pstm.setString(1, usuario.getApellido());
			pstm.setString(2, usuario.getUsuario());
			pstm.setString(3, usuario.getContrasenia());
			pstm.setInt(4, usuario.getIdperfil());
			pstm.setDate(5, usuario.getFechaIngreso());
			pstm.setInt(6, usuario.getEstado());
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return 0;
	}
	
	

}
