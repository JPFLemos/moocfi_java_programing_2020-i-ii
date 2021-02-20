
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        ArrayList<String> fileLines = new ArrayList<>();
        
        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            
            while (fileRead.hasNextLine()) {
            fileLines.add(fileRead.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        if (!fileLines.isEmpty()) {
            if (fileLines.contains(searchedFor)){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }
    }
}
