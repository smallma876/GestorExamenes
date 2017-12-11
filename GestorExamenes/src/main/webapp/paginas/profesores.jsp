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
					<h1>Mantenimiento Profesores  :::: usuario: ${sessionScope.usuario.nombre}</h1>
				</div>				
			</div>
		</header>
		<div class="row">
			<div class="col-xs-2">
				<div >
					<jsp:include page="menu.jsp"></jsp:include>
				</div>
			</div>
			<div class="col-xs-10">
				<div id="profesoresBody">
					<div style="display:none;" id="idDivFormRegistrarUsuario">
					<form action="/GestorExamenes/profesoresServlet" autocomplete="off" >
					<table>
						<tr>
							<td><input type="hidden" name="accion" value="registrarProfesor"></td>
						</tr>
						<tr>
							<td>Nombres : </td>
							<td><input type="text" id="nombre" name="nombre"></td>
						</tr>
						<tr>
							<td>Apellidos : </td>
							<td><input type="text" id="apellido" name="apellido"></td>
						</tr>
						<tr>
							<td>Usuario : </td>
							<td><input type="text" id="usuario" name="usuario"></td>
						</tr>
						<tr>
							<td>Contraseñia : </td>
							<td><input type="password" id="contrasenia" name="contrasenia"></td>
						</tr>
						<tr>
							<td>Perfil : </td>
							<td>
								<select id="idPerfil">
								</select> 
							
							</td>
						</tr>
						<tr>
							<td>Estudios Superiores : </td>
							<td><input type="text" id="estudiosSuperiores" name="estudiosSuperiores"></td>
						</tr>
						<tr>
							<td>Curso : </td>
							<td>
								<select id="idCurso">
								</select> 
							
							</td>
						</tr>
						<tr>
							<td>Fecha Ingreso : </td>
							<td><input type="text" id="fechaing" name="fechaing"></td>
						</tr>
						<tr>
							<td>Salario : </td>
							<td><input type="text" id="salario" name="salario"></td>
						</tr>
						<tr>
							<td>Turno : </td>
							<td>
								<select id="idTurno" name="turno">
										<option value="0">Mañana</option>
										<option value="1">Tarde</option>
								</select> 
							</td>
							
						</tr>
						<tr>
							<td>Estado : </td>
							<td>
								<label>Activo</label>
								<input type="radio" id="idEstadoOn" name="estado" value="1">
								<label>Receso</label>
								<input type="radio" id="idEstadoOff" name="estado" value="0">
							</td>	
						</tr>
							
						<tr>
							<td>Foto : </td>
							<td> <input type="file" name="pic" id="pic"></td>
						</tr>
						<tr>
							<td>
								<input type="submit" value="REGISTRAR"/>
					 		</td>
						</tr>
					</table>
					</form>
					
				</div>
				<div id="divIdProfesores">
					<a href="#" onclick="registrarUsuario();">Nuevo</a>
					<table id="idTableProfesores" class="display" cellspacing="0" width="100%">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nombre</th>
								<th>Apellido</th>
								<th>Curso</th>
								<th>Salario</th>
								<th>Estudios</th>
								<th>Foto</th>
								<th>Editar</th>
								<th>Eliminar</th>
							</tr>
						</thead>
						
					</table>
				</div>
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
<script type="text/javascript" src="js/profesores.js"></script>

<script src="js/jspdf.debug.js"></script>
<script src="js/html2canvas.min.js"></script>
</html>