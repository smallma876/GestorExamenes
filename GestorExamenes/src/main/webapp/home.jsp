<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestor de Examenes Home</title>
<link rel="stylesheet" href="css/flexboxgrid.min.css">
<link rel="stylesheet" href="css/jquery.dataTables.min.css">
<link rel="stylesheet" href="css/profesorgrid.css">
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

</head>
<body>
	<div class="container">
		<header class="row">
			<div class="col-xs-12">
				<div>
					<h1>Bienvenido al Sistema de Gestion de Examenes Online ${sessionScope.usuario.nombre}</h1>
				</div>				
			</div>
		</header>
		<div class="row">
			<div class="col-xs-2">
				<div >
					<jsp:include page="paginas/menu.jsp"></jsp:include>
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
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/contenidoPrincipal.js"></script>
<script type="text/javascript" src="js/knockout-3.4.2.js"></script>
<script type="text/javascript" src="js/alumnos.js"></script>

<script src="js/jspdf.debug.js"></script>
<script src="js/html2canvas.min.js"></script>
</html>