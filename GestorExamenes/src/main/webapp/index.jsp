
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestor de Examenes</title>
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>
	<h1>Gestor de Examenes en Linea</h1>
	
	<form action="/GestorExamenes/UsuarioServlet" method="POST">
		<input type="hidden" name="login" value="login">
		<table>
			<tr>
				<td><h2>Ingrese sus datos</h2></td>
			</tr>
			<tr>
				<td>Usuario : </td>
				<td><input type="text" name="usuario" id="usuario"></td>
			</tr>
			<tr>
				<td>Contrasenia : </td>
				<td><input type="password" name="contrasenia" id="contrasenia" onfocus="MayusAct(event)"></td>
			</tr>
			<tr>
				<td><div id="divMensajeBloqMayus">Bloq Mayus activated</div></td>
			</tr>
			<tr>
				<td><input type="submit" value="Ingresar"></td>
			</tr>
			
		</table>
		<div class="g-recaptcha" data-sitekey="6LdOvDUUAAAAAHzTWML0L5vHe4Fk0YYOC4GvoCU_"></div>
	</form>
	<a href="#">Olvide mi Contraseña</a>
	
</body>
<script type="text/javascript" src="js/login.js"></script>

</html>