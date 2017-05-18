<%-- 
    Document   : RegistrarPersonal
    Created on : 08-may-2017, 13:47:44
    Author     : CLAUDIA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Aspirante</title>
    </head>
    <body>
    <center>
        <h2>Registrar Aspirante</h2>
        <form method="post" action="ServletPersonal">
            <table width="500" height="80">
                <tr>
                    <th><font style="color:#ff0000 ;">Rol:</font> <br>
                        <input type="text" name="textRol" ><br><br>
                        <font style="color:#ff0000 ;">Usuario:</font> <br>
                        <input type="text" name="textUsuario" ><br><br>
                        <font style="color:#ff0000 ;">Contraseña:</font> <br>
                        <input type="text" name="textContraseña" ><br><br>                
                        <font style="color:#ff0000 ;">IdUsuario:</font> <br> 
                        <input type="text" name="textUsuarios_idUsuarios" ><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Nombre:</font> <br>
                        <input type="text" name="textNombres" ><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Primer Apellido:</font> <br>
                        <input type="text" name="textPrimerApellido" ><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Segundo Apellido:</font> <br>
                        <input type="text" name="textSegundoApellido" ><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Tipo Documento:</font> <br>
                        <input type="text" name="textTipoDoc"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Documento:</font> <br>
                        <input type="text" name="textDoc"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Dirección:</font> <br>
                        <input type="text" name="textDireccion"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Tipo Personal:</font> <br>
                        <input type="text" name="textTipoPersonal"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Celular:</font> <br>
                        <input type="text" name="textCelular"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Email:</font> <br>
                        <input type="text" name="textEmail"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Barrio:</font> <br>
                        <input type="text" name="textBarrio"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Fecha de Nacimiento:</font> <br>
                        <input type="date" name="textFechaNac"><br><br>
                        <font style="color:#ff0000 ;">Ingrese su Genero:</font> <br>
                        <input type="text" name="textGenero"><br><br>                                               
                    </th>
                </tr>                
            </table>
            <button>Registrar</button><br><br>
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