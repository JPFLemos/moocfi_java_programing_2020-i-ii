
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String nameInput = scanner.nextLine();

            if (nameInput.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int ageRec = Integer.valueOf(scanner.nextLine());

            books.add(new Book(nameInput, ageRec));
            System.out.println("");
        }

        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);

        Collections.sort(books, comparator);

        books.stream().forEach(b -> System.out.println(b));

    }

}
