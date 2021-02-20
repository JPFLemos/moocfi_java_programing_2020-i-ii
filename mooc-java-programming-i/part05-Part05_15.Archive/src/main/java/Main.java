
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String idInput = scanner.nextLine();
            if (idInput.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                break;
            }
            
            Item item = new Item(nameInput, idInput);
            
            if (!archive.contains(item)) {
                archive.add(item);
            }
        }
        
        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item);
        }


    }
}
