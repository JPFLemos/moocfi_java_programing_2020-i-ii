import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        
        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Product("Tape measure"));
        products.add(new Product("Plaster", "home improvement section"));
        products.add(new Product("tyre"));
        
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
