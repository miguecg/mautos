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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ArchivoXML {

    private final static String archivo = "/Users/miguel/mis_autos.xml";

    public static void guardar(List<Auto> auto) throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(archivo));
        context = JAXBContext.newInstance(Autos.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(new Autos(auto), writer);
        writer.close();
    }

    public static List<Auto> cargar() throws JAXBException {
        Autos autos = new Autos();

        File f = new File(archivo);

        if (f.exists()) {
            JAXBContext context = JAXBContext.newInstance(Autos.class);
            Unmarshaller um = context.createUnmarshaller();
            autos = (Autos) um.unmarshal(new File(archivo));
        }
        return autos.getAutos();
    }

}
