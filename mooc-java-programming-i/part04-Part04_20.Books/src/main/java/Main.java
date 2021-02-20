import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        
        while(true) {
            System.out.println("Title:");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println("What information will be printed?");
        String toBePrinted = scan.nextLine();
        for (Book book : books) {
            if (toBePrinted.equals("everything")) {
                System.out.println(book);
            } else if (toBePrinted.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
        
    }
}
