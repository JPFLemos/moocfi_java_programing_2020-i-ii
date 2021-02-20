
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String initialOutput = "The collection " + this.name + " ";
        
        if (this.elements.isEmpty()) {
            return initialOutput + "is empty.";
        }
        
        String listOfElements = "";
        for (String element : elements) {
            listOfElements = listOfElements + "\n" + element ;
        }
        if (this.elements.size() == 1) {
            return initialOutput + "has 1 element:" + listOfElements;
        }
        
        return initialOutput + "has " + this.elements.size() + " elements:" + listOfElements;
    }
    
    
    
}
