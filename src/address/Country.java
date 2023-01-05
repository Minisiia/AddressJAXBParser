package address;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "country")
public class Country {
    @XmlElement(name = "region")
    private List<Region> regions = new ArrayList<>();

    public Country() {
    }
    public void add(Region reg) {
        regions.add(reg);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(regions.toArray());
    }
}

