/*
 * Autor: Miguel Angel Cedeño Garcidueñas
 * 
 * miguel@siia.umich.mx
 */
package mx.mig.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.mig.beans.Auto;


/**
 *
 * @author miguel
 */
@WebServlet(name = "ServAutos", urlPatterns = {"/auto.do"})
public class ServAutos extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("opcion") != null && request.getParameter("opcion").equals("agr")) {

            Integer unidad = Integer.valueOf(request.getParameter("unidad"));
            Integer modelo = Integer.valueOf(request.getParameter("modelo"));
            String marca = request.getParameter("marca");
            String color = request.getParameter("color");
            String descrip = request.getParameter("descripcion");

            Auto auto = new Auto();
            auto.setUnidad(unidad);
            auto.setColor(color);
            auto.setDescripcion(descrip);
            auto.setMarca(marca);
            auto.setModelo(modelo);
            
            String msg = null;
            try {
                auto.agrAuto(auto);
            } catch (Exception e) {
                msg = e.getMessage();
            }

            if (msg == null) {
                response.sendRedirect("/mautos/index.jsp");
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
                request.getSession().setAttribute("msg", "ERROR: "+msg);
                response.sendRedirect("/mautos/error.jsp");
            }

        } else {
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
            request.getSession().setAttribute("msg", "ERROR: No existe la opci&oacute;n.... ");
            response.sendRedirect("/mautos/error.jsp");
        }
    }

}
