
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Literacy> literacies = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[0], parts[1].trim(), parts[2].trim(), parts[3].trim(), Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                    .forEach(value -> literacies.add(value));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Collections.sort(literacies, (l1, l2) -> Double.compare(l1.getLiteracy(), l2.getLiteracy()));
        literacies.stream().forEach(l -> System.out.println(l));
        

    }
}
