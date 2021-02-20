

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker checker = new Checker();
        
        String string = "tue";
        checker.isDayOfWeek(string);
        
        String wrongString = "asd";
        checker.isDayOfWeek(wrongString);
        
        String vocalString = "aaaeeeeiii";
        checker.allVowels(vocalString);
        
        String notVocalString = "aaaaeeeyyy";
        checker.allVowels(notVocalString);
        
        String time = "12:12:12";
        checker.timeOfDay(time);
        
        String notTime = "abc";
        checker.timeOfDay(notTime);
    }
}
