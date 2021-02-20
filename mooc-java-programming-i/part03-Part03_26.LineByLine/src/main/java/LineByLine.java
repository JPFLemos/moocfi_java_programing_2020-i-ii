
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            
            String[] words = string.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }

    }
}
