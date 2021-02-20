
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(40) + 1;
            
            while (containsNumber(number)) {
                number = random.nextInt(40) + 1;
            }
            
            this.numbers.add(number);
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
        
    }
}

