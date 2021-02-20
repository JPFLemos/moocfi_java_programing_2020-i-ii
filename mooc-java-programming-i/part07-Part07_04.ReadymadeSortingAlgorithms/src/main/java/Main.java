
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // TEST THIS FOR ARRAY WITH INTS STRINGS AND ARRAYLIST WITH INT AND STRINGS!!!!
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] strings = {"aaaa", "bbbb", "aaab"};
        sort(strings);
        System.out.println(Arrays.toString(strings));
        
        ArrayList<String> stringlist = new ArrayList<>();
        stringlist.add("what");
        stringlist.add("aaaa");
        stringlist.add("ZZZZZ");
        stringlist.add("AAAAAAAA");
        System.out.println(stringlist);
        sortStrings(stringlist);
        System.out.println(stringlist);
    }   
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);                
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
