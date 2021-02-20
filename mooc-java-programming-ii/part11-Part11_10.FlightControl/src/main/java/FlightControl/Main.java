
package FlightControl;
import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl fc = new FlightControl();
        TextUI ui = new TextUI(fc, scanner);
        
        ui.start();
    }
}
