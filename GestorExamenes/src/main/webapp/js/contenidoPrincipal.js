function mostrarMantenimiento(clicked_id){
		  	
	  	if(clicked_id.trim() == "idEnlaceprofesores"){
 	  	    document.getElementById("profesoresPage").style.display="block";
 	  	 	document.getElementById("alumnosPage").style.display="none";
 	  	    document.getElementById("examenesPage").style.display="none";
 	  	    document.getElementById("preguntasPage").style.display="none";
 	  	    document.getElementById("seccionesPage").style.display="none";
 	  	    	  	   
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
	 		
 };

 function registrarUsuario(){
//		document.getElementById("idDivFormRegistrarUsuario").style.display="block";
//		document.getElementById("divIdListaUsuarios").style.display="none";
		alert("Hola Mundo");
};