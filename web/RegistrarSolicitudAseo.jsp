<%-- 
    Document   : RegistrarSolicitudAseo
    Created on : 16-may-2017, 10:38:23
    Author     : CLAUDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud Aseo</title>
    </head>
    <body>
    <center>
        <h2>Personal Aseo</h2>
        <form method="post" action="ServletSolicitud">
            <table width="500" height="80">
                <tr>
                    <th>
                        <font style="color:#ff0000 ;">Fecha Servicio:</font> <br>
                        <input type="date" name="textfechaServicio" ><br><br>
                        <font style="color:#ff0000 ;">Jornada:</font> <br>
                        <select name="textjornada">
                            <option value="0">Seleccione</option>
                        <option value="Mañana">Mañana</option>
                        <option value="Tarde">Tarde</option>
                        </select><br><br>
                        <font style="color:#ff0000 ;">Observaciones </font> <br>
                        <textarea name="textobservaciones"></textarea>
                    </th>
                </tr>                
            </table>
            <button>Siguiente</button><br><br>
            <input type="hidden" name="textOpcion" value="1">
            <br><a href="index.jsp"><input type="button" value="Volver"></a>
        </form>
        <%if(request.getAttribute("error")!= null){%>
            ${error}
            <%}else{%>
            ${exito}
            <%}%>
    </center>
</body>
</html>
