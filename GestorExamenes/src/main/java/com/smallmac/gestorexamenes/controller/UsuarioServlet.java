package com.smallmac.gestorexamenes.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallmac.gestorexamenes.domain.Usuario;
import com.smallmac.gestorexamenes.service.UsuarioService;
import com.smallmac.gestorexamenes.service.UsuarioServiceImpl;


@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Usuario oUsuario = new Usuario();
    UsuarioService usuarioService= new UsuarioServiceImpl();
    
    public UsuarioServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if("login".equalsIgnoreCase(request.getParameter("login"))){		
			String response_Captcha=request.getParameter("g-recaptcha-response");
			if(response_Captcha!=null){
				String llave ="6LdOvDUUAAAAAH2H2WslZnIQbtCF0t7eFpwQPd4z";
				String ip=InetAddress.getLocalHost().getHostAddress();
				String validacion_server;
				try {
					validacion_server = getRemoteContents("https://www.google.com/recaptcha/api/siteverify?secret="+llave+"&response="+response_Captcha+"&remoteip="+ip);
					System.out.println(validacion_server);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			System.out.println(response_Captcha);
			oUsuario.setUsuario(request.getParameter("usuario"));
			oUsuario.setContrasenia(request.getParameter("contrasenia"));
			Usuario _usuario= new Usuario();
			_usuario = usuarioService.getUsuarioLogin(oUsuario);
			request.setAttribute("usuario", _usuario);
			request.setAttribute("listaPermisos", usuarioService.getPermisos(_usuario.getIdperfil()));
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}
	public String getRemoteContents(String url) throws Exception {
	    URL urlObject = new URL(url);
	    URLConnection conn = urlObject.openConnection();
	    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    String inputLine, output = "";
	    while ((inputLine = in.readLine()) != null) {
	         output += inputLine;
	    }   
	    in.close();
	        
	    return output;
	}
	
	public Usuario getoUsuario() {
		return oUsuario;
	}

	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
	
}
