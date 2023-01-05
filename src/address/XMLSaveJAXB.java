package address;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLSaveJAXB {

    public static Country fromXmlToObject(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Country) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void convertObjectToXml(Country country, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Country.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // флаг для більш читального XML в JAXB
            marshaller.marshal(country, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
