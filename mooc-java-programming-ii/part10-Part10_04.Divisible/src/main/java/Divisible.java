
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                
                .forEach(i -> System.out.println(i));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> div = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
                div.add(number);
        }
        return div;
    }

}
