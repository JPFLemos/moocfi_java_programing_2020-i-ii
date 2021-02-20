
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        MessagingService chat = new MessagingService();
        
        Message jToR = new Message("John", "Ciao More");
        Message rToJ = new Message("Rach", "MAVAFANCUL");
        
        chat.add(jToR);
        chat.add(rToJ);
        
        System.out.println(chat.getMessages());
        
    }
}
