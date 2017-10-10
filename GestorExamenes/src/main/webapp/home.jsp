<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestor de Examenes Home</title>
<link rel="stylesheet" href="css/flexboxgrid.min.css">

</head>
<body>
	<div class="container">
		<header class="row">
			<div class="col-xs-12">
				<div>
					<h1>Bienvenido al Sistema de Gestion de Examenes Online ${requestScope.usuario.nombre}</h1>
				</div>				
			</div>
		</header>
		<div class="row">
			<div class="col-xs-2">
				<div >
					<jsp:include page="paginas/menu.jsp"></jsp:include>
				</div>
			</div>
			<div class="col-xs-10">
			
				<div id="profesoresPage" style="display:none;">
					<jsp:include page="paginas/profesores.jsp"></jsp:include>				
				</div>
				<div id="alumnosPage" style="display:none;">
					<jsp:include page="paginas/alumnos.jsp"></jsp:include>				
				</div>
				<div id="examenesPage" style="display:none;">
					<jsp:include page="paginas/examenes.jsp"></jsp:include>				
				</div>
				<div id="preguntasPage" style="display:none;">
					<jsp:include page="paginas/preguntas.jsp"></jsp:include>				
				</div>	
				<div id="seccionesPage" style="display:none;">
					<jsp:include page="paginas/secciones.jsp"></jsp:include>				
				</div>
			</div>
		</div>
		<footer class="row">
			<div class="col-xs-12">
					
			</div>
		</footer>
	</div>
</body>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/contenidoPrincipal.js"></script>
<script type="text/javascript">
// 	 if(document.getElementById("idEnlaceprofesores") != null){
// 		 document.getElementById("idEnlaceprofesores").href="/GestorExamenes/CursoServlet";
// 	 }
// 	 if(document.getElementById("idEnlacealumnos") != null ){
// 		 document.getElementById("idEnlacealumnos").href="#";
// 	 }
// 	 if(document.getElementById("idEnlaceexamenes") != null ){
// 		 document.getElementById("idEnlaceexamenes").href="#";
// 	 }
// 	 if(document.getElementById("idEnlacepreguntas") != null ){
// 		 document.getElementById("idEnlacepreguntas").href="#";
// 	 }
// 	 if(document.getElementById("idEnlacesecciones") != null ){
// 		 document.getElementById("idEnlacesecciones").href="#";
// 	 }
	 
	  
</script>
</html>