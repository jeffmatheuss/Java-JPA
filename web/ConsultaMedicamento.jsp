<%-- 
    Document   : ConsultaUsuario
    Created on : 06/05/2018, 20:46:33
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><h1>Consulta Medicamento</h1></title>
    </head>
    <body>
        <h1>Medicamento:</h1>
        <form method="get" action="<%= request.getContextPath()%>/UsuarioServlet">
            <div>
                <label for="idMedicamento">Medicamento:</label>
                <input id="idMedicamento" nome="idMedicamento" type="text" placeholder="Id medicamento">
            </div>
            <div>
                <input type="submit" value="Consultar">
            </div>
            <br>
            <table border="2">
                <c:forEach items="${medicamentos}" var="usu">
                    <tr>
                        <td>
                            <c:out value="${medicamentos.idMedicamento}"></c:out>
                        </td>
                    </tr>
                </c:forEach>
        </form>

    </body>
</html>
