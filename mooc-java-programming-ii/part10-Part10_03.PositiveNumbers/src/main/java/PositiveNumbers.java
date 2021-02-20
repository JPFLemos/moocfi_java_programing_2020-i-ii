
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            int numberInput = Integer.valueOf(scanner.nextLine());
            if (numberInput == 0) {
                break;
            }
            listOfNumbers.add(numberInput);
        }

        System.out.println("You have inputed the numbers: ");
        for (Integer number : listOfNumbers) {
            System.out.println(number);
        }

        List<Integer> positiveNumbersInputed = listOfNumbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("And the positive numbers are:");
        
        for (Integer number : positiveNumbersInputed) {
            if (number > 0) {
                System.out.println(number);
            }
        }

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        return positiveNumbers;
    }

}
