<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<ul>
	<c:forEach begin="0" end="${fn:length(requestScope.listaPermisos)-1}" var="i">
	<li>
		<a href="#" onclick="mostrarMantenimiento(this.id);" id="idEnlace${requestScope.listaPermisos[i]}">
			<c:out value="${requestScope.listaPermisos[i]}" />		
		</a>	
	</li>
	</c:forEach>
</ul>
