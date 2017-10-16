package com.smallmac.gestorexamenes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smallmac.gestorexamenes.commons.ConnectionJDBC;
import com.smallmac.gestorexamenes.domain.Perfil;

public class PerfilRepositoryImpl implements PerfilRepository {

	@Override
	public List<Perfil> listaPerfiles() {
		// TODO Auto-generated method stub
		List<Perfil> perfiles = new ArrayList<>();
		Perfil perfil = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = ConnectionJDBC.getConnection();
			String sql="select * from tdp_perfil";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				perfil = new Perfil();
				perfil.setIdperfil(rs.getInt(1));
				perfil.setDescripcion(rs.getString(2));
				perfiles.add(perfil);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return perfiles;
	}

}
