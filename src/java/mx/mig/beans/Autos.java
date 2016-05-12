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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="autos")
public class Autos implements Serializable {
    
    @XmlElement(name="auto")
    private List<Auto> autos = new ArrayList();

    public Autos() {
    }

    public Autos(List<Auto> autos) {
        this.autos = autos;
    } 
    
    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
    
    
   
    
    
}
