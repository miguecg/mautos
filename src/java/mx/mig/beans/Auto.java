/*
 * Autor: Miguel Angel Cedeño Garcidueñas
 * 
 * miguel@siia.umich.mx
 */
package mx.mig.beans;

/**
 *
 * @author miguel
 */
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

@XmlRootElement(name="auto")
public class Auto implements Serializable {
    
    private Integer unidad;
    private Integer modelo;
    private String marca;
    private String color;
    private String descripcion;

    public Auto() {
    }
    
    @XmlAttribute(name="unidad")
    public Integer getUnidad() {
        return unidad;
    }

    @XmlAttribute(name="color")
    public String getColor() {
        return color;
    }

    @XmlAttribute(name="marca")
    public String getMarca() {
        return marca;
    }

    @XmlAttribute(name="modelo")
    public Integer getModelo() {
        return modelo;
    }
    
    @XmlElement(name="descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
    
    
    public void agrAuto(Auto auto) throws Exception {     
        
        List<Auto> la = ArchivoXML.cargar();
        la.add(auto);
        ArchivoXML.guardar(la);        
    }
    
    
    public void borAuto(Auto auto) throws Exception {    
        List<Auto> la = ArchivoXML.cargar();
        la.remove(auto);
        ArchivoXML.guardar(la);         
    }
    
    
}
