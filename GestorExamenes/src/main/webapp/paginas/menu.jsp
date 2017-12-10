<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<ul>
	<c:forEach begin="0" end="${fn:length(sessionScope.listaPermisos)-1}" var="i">
	<li>
		<a href="/GestorExamenes/${sessionScope.listaPermisos[i]}Servlet" id="idEnlace${sessionScope.listaPermisos[i]}">
			<c:out value="${sessionScope.listaPermisos[i]}" />		
		</a>	
	</li>
	</c:forEach>
</ul>
