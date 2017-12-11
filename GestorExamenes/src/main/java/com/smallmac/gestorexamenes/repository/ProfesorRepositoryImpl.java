package com.smallmac.gestorexamenes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		PreparedStatement pstmProfesor=null;
		PreparedStatement pstmUsuario=null;
		try {
			
			con = ConnectionJDBC.getConnection();
			con.setAutoCommit(false);
			String sqlInsertUsuario="insert into cbc_gestorexamenes.tdp_usuario (nombre,apellido,usuario,contrasenia,idperfil,fechaIngreso,estado) values (?,?,?,?,?,?,?)";
			pstmUsuario = con.prepareStatement(sqlInsertUsuario, Statement.RETURN_GENERATED_KEYS);
			System.out.println(usuario.getFechaIngreso());
			pstmUsuario.setString(1, usuario.getNombre());
			pstmUsuario.setString(2, usuario.getApellido());
			pstmUsuario.setString(3, usuario.getUsuario());
			pstmUsuario.setString(4, usuario.getContrasenia());
			pstmUsuario.setInt(5, usuario.getIdperfil());
			pstmUsuario.setString(6, usuario.getFechaIngreso().toString());
			pstmUsuario.setInt(7, usuario.getEstado());
			
			int idUsuarioGenerado = pstmUsuario.executeUpdate();
			int idss=pstmUsuario.RETURN_GENERATED_KEYS;
			String sqlInsertProfesor= "insert into cbc_gestorexamenes.tdp_profesor (EstudiosSuperiores,salario,turno,idcurso,idusuario) values (?,?,?,?,?)";
			pstmProfesor = con.prepareStatement(sqlInsertProfesor);
			pstmProfesor.setString(1, profesor.getEstudiosSuperiores());
			pstmProfesor.setDouble(2, profesor.getSalario());
			pstmProfesor.setString(3, profesor.getTurno());
			pstmProfesor.setInt(4, profesor.getIdcurso());
			pstmProfesor.setInt(5,idUsuarioGenerado);
			
			int idProfesorGenerado = pstmProfesor.executeUpdate();
			con.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			
				try {
					if(con != null)con.close();
					if(pstmProfesor != null)pstmProfesor.close();
					if(pstmUsuario != null)pstmUsuario.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return 0;
	}
	
	

}
