package address;

/**
 * Створіть клас, використовуючи JAXBParser, де опишіть ієрархію XML файлу.
 * Необхідно, щоб проєкт створював XML-файл і будував дерево (місто, назва вулиці, будинок).
 * У місті використовуйте атрибут (наприклад, <city size=”big>Kiev</city>).
 */

public class Main {
    public static void main(String[] args) {
        final String fileName = "src/address/address.xml";
        Country countryToXml = new Country();
        countryToXml.add(new Region(new City("big", "Kharkiv"), "Valentynivska", 123));
        countryToXml.add(new Region(new City("big", "Mukachevo"), "Dukhnovycha", 11));
        XMLSaveJAXB.convertObjectToXml(countryToXml, fileName);

        Country countryFromXml = XMLSaveJAXB.fromXmlToObject(fileName);
        System.out.println("country to xml: " + countryToXml);
        System.out.println("country from xml: " + countryFromXml);

    }
}
