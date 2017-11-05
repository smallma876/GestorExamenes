var viewmodelprofesor = function(){
	this.title = "Mantenimiento Profes";
}
var viewmodelprofesor2 = function(){
	this.title = "mant";
}
ko.applyBindings(new viewmodelprofesor(),document.getElementById("profesorTitle"));
ko.applyBindings(new viewmodelprofesor2(),document.getElementById("profesoresBody"));