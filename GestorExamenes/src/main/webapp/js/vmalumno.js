var alumnoModel;
var alumnoViewModel = function (items){
		var self=this;
		self.alumnos= ko.observableArray(items);
		
		
		self.replaceAlumnos = function (data){
			
			self.alumnos(data);
		}
}

$(document).ready(function(){
	
	$("#alertaId").click(function(){
		alert("hola Mundo");
	});
	
	var data = [{firstName: 'Sergio', lastName: 'Mallma' },{ firstName: 'Chavez', lastName: 'Egusquiza' }];
	alumnoModel = new alumnoViewModel(data);
	ko.applyBindings(alumnoModel,document.getElementById("divListaAlumnosId"));	
});

function listarDataUno(){
	
	var data = [{firstName: 'Bert', lastName: 'Bertington' },{ firstName: 'Charles', lastName: 'Charlesforth' }];
	alumnoModel.replaceAlumnos(data);
}

function listarDataDos(){
	var data = [{firstName: 'Luis', lastName: 'Cheniston' },{ firstName: 'Maria', lastName: 'Dolores' }];
	alumnoModel.replaceAlumnos(data);
}
