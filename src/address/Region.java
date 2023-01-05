package address;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder = {"city", "street", "house"},name = "region")
public class Region {
    private City city;
    private String street;
    private int house;

    public Region() {
    }

    public Region(City city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }
    @XmlElement(name = "city")
    public void setCity(City city) {
        this.city = city;
    }
    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }
    @XmlElement(name = "house")
    public void setHouse(int house) {
        this.house = house;
    }

    public City getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Region{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
