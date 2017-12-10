var CambiarURL= function(){
	processAjaxData();
};
function processAjaxData(){
	var stateObj = { foo: "bar" };
	window.history.pushState(stateObj, "Title", "GestorExamenes/");
}
function crearPdf(){
	var doc = new jsPDF();
	doc.text('Hello world',10,10);
	doc.save('a4.pdf');
}

//var imgData = 'data:image/jpeg;base64,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';
//doc.addImage(imgData, 'JPEG', 0, 20, 50, 50);
//doc.save('a4.pdf');
var screenshoot=function(){
	var doc = new jsPDF();
	html2canvas(document.getElementById("divListaAlumnosId"), {
		onrendered: function(canvas) {
			var image = new Image();
			image.src = canvas.toDataURL("image/png");
			doc.addImage(image, 'png',10,20,180,20);
			doc.save('a4.pdf');
		}
	});
};

$("#btnTexto").click(function(){
	var str = $("#textoId").text();
	alert(str);
});




















