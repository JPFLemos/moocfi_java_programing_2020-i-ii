import java.util.ArrayList;
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter her
        
        ArrayList<Counter> counters = new ArrayList<>();
        counters.add(new Counter());
        counters.add(new Counter(10));
        
        for (Counter counter : counters) {
            System.out.println(counter);
            
            counter.decrease();
            System.out.println(counter);
            
            counter.decrease(10);
            System.out.println(counter);
            
            counter.increase();
            System.out.println(counter);
            
            counter.increase(32);
            System.out.println(counter);
            
        }
    }
}
