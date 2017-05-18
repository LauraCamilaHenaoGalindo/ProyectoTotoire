<%-- 
    Document   : newjspRegistrarSolicitudNiñeras
    Created on : 16-may-2017, 10:38:49
    Author     : CLAUDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud Niñeras</title>
    </head>
    <body>
    <center>
        <h2>Personal Cuidado</h2>
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
                        <option value="Mediodia">Mediodia</option>
                        <option value="Tarde">Tarde</option>
                        <option value="TardeNoche">Tarde-Noche</option>
                        <option value="Noche">Noche</option>
                        </select><br><br>
                        <font style="color:#ff0000 ;">Número de Hijos:</font> <br>
                        <input type="text" name="textnumeroHijos" ><br><br>
                        <font style="color:#ff0000 ;">Fecha de nacimiento último hijo:</font> <br>
                        <input type="text" name="textfechaNacUltimoHijo" ><br><br>
                        <font style="color:#ff0000 ;">Descripción: </font> <br>
                        <textarea width="300" height="80" name="textdescripcion" placeholder="El(Los) niño(s) requiere(n) algún cuidado especial"></textarea>     
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