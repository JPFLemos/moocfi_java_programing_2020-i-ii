
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<String> textLines = new ArrayList<>();
        
        int counter = 0;
        while (true) {
            String line = scanner.nextLine();
            
            if (line.equals("end")) {
                break;
            }
            
            textLines.add(line);
            counter++;
        }
        
        System.out.println(textLines.size());
        System.out.println(counter);
    }
}
