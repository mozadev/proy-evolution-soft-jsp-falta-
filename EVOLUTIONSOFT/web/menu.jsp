<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <script>
            function listarParaEliminar() {
                document.form2.action = "<%=request.getContextPath()%>/ServletMantenimientoHW";
                document.form2.method = "GET";
                document.form2.opcion2.value = "LISTAR";
                document.form2.submit();

            }
            function consultar() {
                document.form2.action = "<%=request.getContextPath()%>/ServletConsultaHW";
                document.form2.method = "GET";
                document.form2.opcion2.value = "CONSULTAR";
                document.form2.submit();

            }

        </script>
                
    </head>
    <body>
        <form name="form2">
           
            <input type= "hidden"   name="opcion2" >        
            <li><a href="home.jsp">Home</a></li>
           <input type="button"  value="Consulta HW"  onclick="consultar()" >
         <input type="button"  value="Eliminar HW"  onclick="listarParaEliminar()" >
        </form>
    </body>
</html>
