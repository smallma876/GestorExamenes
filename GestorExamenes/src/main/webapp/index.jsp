
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestor de Examenes</title>
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
				<td><input type="password" name="contrasenia" id="contrasenia"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Ingresar"></td>
			</tr>
			
		</table>
	</form>
	<a href="#">Olvide mi Contraseña</a>
	
</body>
</html>