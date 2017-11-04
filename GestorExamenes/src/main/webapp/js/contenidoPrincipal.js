function mostrarMantenimiento(clicked_id){
		  	
	  	if(clicked_id.trim() == "idEnlaceprofesores"){
 	  	    document.getElementById("profesoresPage").style.display="block";
 	  	 	document.getElementById("alumnosPage").style.display="none";
 	  	    document.getElementById("examenesPage").style.display="none";
 	  	    document.getElementById("preguntasPage").style.display="none";
 	  	    document.getElementById("seccionesPage").style.display="none";
 	  	    var fillProfesores = "fillProfesores";
	 	  	 $.ajax({
	 	 		type:'POST',
	 	 		data:{tipo: fillProfesores},
	 	 		url: '/GestorExamenes/ProfesorServlet',
	 	 		success: function(responseJson){
	 	 			var tableProfesores=document.getElementById("idTableProfesores");
	 	 			var valor = responseJson;
	 	 		
	 	 			$.each(valor, function(k, v){
	 	 				//$("<option>").val(v.idcurso).text(v.descripcion).appendTo(selectCurso);
	 	 				$("<tr>").appendTo(tableProfesores)
	 	 						.append($("<td>").text(v.idprofesor))
	 	 						.append($("<td>").text(v.nombre))
	 	 						.append($("<td>").text(v.apellido))
	 	 						.append($("<td>").text(v.curso))
	 	 						.append($("<td>").text(v.salario))
	 	 						.append($("<td>").text(v.EstudiosSuperiores))
	 	 						
	 	 			});
	 	 		
	 	 		}
	 	 	});
 	  	    	  	   
 	  	}
	  	if(clicked_id.trim() == "idEnlacealumnos"){
	  		document.getElementById("alumnosPage").style.display="block";
	  		document.getElementById("profesoresPage").style.display="none";
	  		document.getElementById("examenesPage").style.display="none";
 	  	    document.getElementById("preguntasPage").style.display="none";
 	  	    document.getElementById("seccionesPage").style.display="none";
	  	}
	  	if(clicked_id.trim() == "idEnlaceexamenes"){
	  		document.getElementById("alumnosPage").style.display="none";
	  		document.getElementById("profesoresPage").style.display="none";
	  		document.getElementById("examenesPage").style.display="block";
 	  	    document.getElementById("preguntasPage").style.display="none";
 	  	    document.getElementById("seccionesPage").style.display="none";
	  	}
	  	if(clicked_id.trim() == "idEnlacepreguntas"){
	  		document.getElementById("alumnosPage").style.display="none";
	  		document.getElementById("profesoresPage").style.display="none";
	  		document.getElementById("examenesPage").style.display="none";
 	  	    document.getElementById("preguntasPage").style.display="block";
 	  	    document.getElementById("seccionesPage").style.display="none";
	  	}
	  	if(clicked_id.trim() == "idEnlacesecciones"){
	  		document.getElementById("alumnosPage").style.display="none";
	  		document.getElementById("profesoresPage").style.display="none";
	  		document.getElementById("examenesPage").style.display="none";
 	  	    document.getElementById("preguntasPage").style.display="none";
 	  	    document.getElementById("seccionesPage").style.display="block";
	  	}
	 		
 }

 function registrarUsuario(){
	 	var fillCursos = "fillCursos";
	 	$.ajax({
	 		type:'POST',
	 		data:{tipo: fillCursos},
	 		url: '/GestorExamenes/CursoServlet',
	 		success: function(responseJson){
	 			var selectCurso=document.getElementById("idCurso");
	 			var valor = responseJson;
	 			$.each(valor, function(k, v){
	 				$("<option>").val(v.idcurso).text(v.descripcion).appendTo(selectCurso);
	 			});
	 		
	 		}
	 	});
	 	var fillPerfiles = "fillPerfiles";
	 	$.ajax({
	 		type:'POST',
	 		data:{tipo: fillPerfiles},
	 		url: '/GestorExamenes/PerfilServlet',
	 		success: function(responseJson){
	 			var selectPerfil=document.getElementById("idPerfil");
	 			var valor = responseJson;
	 			$.each(valor, function(k, v){
	 				$("<option>").val(v.idperfil).text(v.descripcion).appendTo(selectPerfil);
	 			});	 		
	 		}
	 	});
		document.getElementById("idDivFormRegistrarUsuario").style.display="block";
		document.getElementById("divIdProfesores").style.display="none";
};