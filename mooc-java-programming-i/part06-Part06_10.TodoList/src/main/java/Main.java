
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TodoList thingsToDo = new TodoList();
        
        UserInterface userInterface = new UserInterface(thingsToDo, scanner);
        userInterface.start();
    }
}
