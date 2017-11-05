<h1>Mantenimiento Alumnos</h1>
<div id="divListaAlumnosId">
<table>
	<thead>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
	</thead>
	<tbody data-bind="foreach: alumnos">
		<tr>
			<td data-bind="text: firstName"></td>
			<td data-bind="text: lastName"></td>
		</tr>
	</tbody>
</table>
<div>
<input type="button" value="Reemplazar1" onclick="listarDataUno();">
<input type="button" value="Reemplazar2" onclick="listarDataDos();">
<input type="button" value="Alerta" id="alertaId">
</div>

</div>
