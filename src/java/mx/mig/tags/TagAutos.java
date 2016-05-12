/*
 * Autor: Miguel Angel Cedeño Garcidueñas
 * 
 * miguel@siia.umich.mx
 */

package mx.mig.tags;

/**
 *
 * @author miguel
 */

import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import mx.mig.beans.ArchivoXML;
import mx.mig.beans.Auto;

public class TagAutos extends BodyTagSupport {

    @Override
    public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();

        try {
            List<Auto> la = ArchivoXML.cargar();

            if (!la.isEmpty()) {
                out.println("<table style=\"width:100%\">");
                out.println("<tr>");
                out.println("<th>Unidad</th>");
                out.println("<th>Modelo</th>");
                out.println("<th>Marca</th>");
                out.println("<th>Color</th>");
                out.println("<th>Descripci&oacute;n</th>");
                out.println("</tr>");
                
                for (Auto a : la) {
                    out.println("<tr>");
                    out.println("<td>" + a.getUnidad() + "</td>");
                    out.println("<td>" + a.getModelo() + "</td>");
                    out.println("<td>" + a.getMarca() + "</td>");
                    out.println("<td>" + a.getColor() + "</td>");
                    out.println("<td>" + a.getDescripcion() + "</td>");
                    out.println("</tr>");
                }
                
                out.println("</table>");
            }

            
        } catch (Exception e) {
            throw new JspException(e);
        }

        return SKIP_BODY;
    }

}
