<div id="profesorTitle">
	<h1 data-bind="text: title"></h1>
</div>


<div id="profesoresBody">
	<div style="display:none;" id="idDivFormRegistrarUsuario">
	<form action="" autocomplete="off" >
	<table>
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
				<select id="idTurno">
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
