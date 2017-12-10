
var listarProfesores = function(){
		
		var table =  $('#idTableProfesores').DataTable( {
				pagingType:'simple',     
	 	        ajax: {
	 	            "url": "/GestorExamenes/ProfesorServlet",
	 	            "type": "POST"
	 	        },
	 	        columns: [
	 	            { "data": "idprofesor" },
	 	            { "data": "nombre" },
	 	            { "data": "apellido" },
	 	            { "data": "curso" },
	 	            { "data": "salario" },
	 	            { "data": "EstudiosSuperiores" },
	 	            { "data": null},
	 	            { "data": null},
	 	            { "data": null}
	 	        ],
	 	        dom:'l<"pag"pi>rt'
	 	    } );
		
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