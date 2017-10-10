package com.smallmac.gestorexamenes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smallmac.gestorexamenes.commons.ConnectionJDBC;
import com.smallmac.gestorexamenes.domain.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepository {

	@Override
	public Usuario getUsuarioLogin(Usuario usuario) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Usuario oUsuario=null;
		try {
			
			con = ConnectionJDBC.getConnection();
			pstm = con.prepareStatement("select * from tdp_usuario where usuario=? and contrasenia=?");
			pstm.setString(1, usuario.getUsuario());
			pstm.setString(2, usuario.getContrasenia());
			
			rs = pstm.executeQuery();
			if(rs.next()){
				oUsuario = new Usuario();
				oUsuario.setIdUsuario(rs.getInt(1));
				oUsuario.setNombre(rs.getString(2));
				oUsuario.setApellido(rs.getString(3));
				oUsuario.setUsuario(rs.getString(4));
				oUsuario.setContrasenia(rs.getString(5));
				oUsuario.setIdperfil(rs.getInt(6));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return oUsuario;
	}

	@Override
	public List<String> getPermisos(int idPerfil) {
		// TODO Auto-generated method stub
		List<String> permisos = new ArrayList<>();
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			
			con = ConnectionJDBC.getConnection();
			pstm = con.prepareStatement("select url from tdp_permiso tp inner join perfilespaginas pp on "+ 
				"tp.idpermiso = pp.idpermiso where pp.idperfil=?");
			pstm.setInt(1, idPerfil);		
			rs = pstm.executeQuery();
			while(rs.next()){	
				permisos.add(rs.getString(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return permisos;
	}

}
