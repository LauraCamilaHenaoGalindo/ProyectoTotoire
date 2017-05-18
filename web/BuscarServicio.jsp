<%-- 
    Document   : BuscarServicioNiñera
    Created on : 15-may-2017, 14:46:24
    Author     : CLAUDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Servicio</title>
    </head>
    <body>
    <center>
        <form method="post" action="BuscarServicio">
            <br><br><table style="margin-top: 160px " width="500" height="30">
                <tr>
                    <th><br><br><br><font style="color:#ff0000;">Busco una ayuda de  </font>
                        <select name="texttiposervicio">
                            <option value="0">Seleccione</option>
                    <option value="CuidadoDeNiños">Cuidado de Niños</option>
                    <option value="PersonalAseo">Personal de aseo</option>
                </select>
                     <button>¡Buscar!</button><br><br>
                    </th>
                </tr>                
            </table>           
            <input type="hidden" name="textOpcion" value="1">
        </form>
    </center>
</body>
</html>
