package jaknauczycsieprogramowania3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PropertyMethods {

    private Map<String, Property> properties = new HashMap<>();

    public void addProperty(Property property){
        properties.put(property.getNameOfAdvertisement(), property);
    }
    public  void listOfProperties(){
        Collection<Property> propertyCollection = properties.values();

        for (Property property: propertyCollection){
            System.out.println(property.getNameOfAdvertisement());
        }
    }

    public Property findProperty(String name){
        return properties.get(name);
    }
}
