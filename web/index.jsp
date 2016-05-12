<%-- 
    Document   : index
    Created on : 12-may-2016, 11:14:44
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="POST" action="auto.do">
            
            <table style="width:100%">
                <tr>
                    <th>Unidad:</th>
                    <td><input type="number" name="unidad" required/> </td>
                </tr>
                <tr>
                    <th>modelo:</th>
                    <td><input type="number" name="modelo" required/> </td>
                </tr>
                <tr>
                    <th>Marca:</th>
                    <td><input type="text" name="marca" required/> </td>
                </tr>
                <tr>
                    <th>Color:</th>
                    <td><input type="text" name="color" required/> </td>
                </tr>
                <tr>
                    <th>Descripci&oacute;n:</th>
                    <td>
                        <textarea name="descripcion" style="width:100;height:100" required></textarea>
                        
                    </td>
                </tr>
                
            </table>
            <div>
                <input type="hidden" name="opcion" value="agr"/>
                <input type="submit" value="Aceptar"/>
            </div>
            <p>
            <jsp:include page="lista.jsp"/>
            </p>
        </form>
        
        
        
        
        
        
        
        
    </body>
</html>
