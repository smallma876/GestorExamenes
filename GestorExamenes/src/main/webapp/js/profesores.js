$(document).ready(function(){
	listarProfesores();
});

var listarProfesores = function(){
	console.log("entro");
	var table =  $('#idTableProfesores').DataTable( {
			
			pagingType:'simple',     
 	        ajax: {
 	            "url": "/GestorExamenes/profesoresServlet",
 	            "type": "POST",
 	            	"data": {
 	      	          "accion": "fillProfesores"
 	      	     	},
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
