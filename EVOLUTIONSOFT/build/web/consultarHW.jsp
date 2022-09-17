
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultas</title>
        
         <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
         
   
        
        
        <script type="text/javascript">
            function buscar() {
                var txttipocartera1 = document.form.txttipocartera.value;


                if (txttipocartera1.length == 0) {
                    alert("Elige el tipo de Cartera por Favor");
                    document.form.txttipocartera.focus();
                    return;
                } else {
                    document.form.action = "<c:url value ="/CarteraServlet"/>";
                    document.form.method = "GET";
                    document.form.opcion.value = "COMBOXBUSCAR";
                    document.form.submit();

                }

            }
            
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
            <input type="hidden"   name="opcion2" >        
            <li><a href="home.jsp">Home</a></li>
           <input type="button"  value="Consulta HW"  onclick="consultar()" >
         <input type="button"  value="Eliminar HW"  onclick="listarParaEliminar()" >
        </form>
        
         <hr style="border-color:black;">
         
        <form name="form" name="opcion">
            <div class="contenedor">
                <h1 style="color:black;font-size:18px;text-align:center;">Criterios de b&uacute;squeda: </h1>
                <div class="form">
                    <label> Nombre: </label>
                    <input name="txtnombre" type="text">
                </div>
                <div class="form">
                <label> Categoria: </label>
                <select name="categoria">
                    <c:forEach var="em" items="${listarcategoria}">
                    <option value="${em.getId_categoria()}">${em.getDescripcionCategoria()}</option>
                    </c:forEach>
                </select></div>
                <div class="form">
                <label> Marca: </label>
                <select name="marca">
                   <c:forEach var="em" items="${listarmarca}">
                    <option value="${em.getId_marca()}">${em.getDescripcionMarca()}</option>
                    </c:forEach>
                </select></div>
                
                <input type="button" value="Buscar" onclick="buscar()">
            </div>
        </form>
    </body>
</html>
