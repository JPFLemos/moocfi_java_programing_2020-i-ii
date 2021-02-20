
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());
        
        int thres1 = 5000;
        int thres2 = 25000;
        int thres3 = 55000;
        int thres4 = 200000;
        int thres5 = 1000000;
        
        int tax1flat = 100;
        int tax2flat = 1700;
        int tax3flat = 4700;
        int tax4flat = 22100;
        int tax5flat = 142100;
        
        double tax1rate = 0.08;
        double tax2rate = 0.10;
        double tax3rate = 0.12;
        double tax4rate = 0.15;
        double tax5rate = 0.17;
                
        if (valueOfGift < thres1) {
            System.out.println("No tax!");
        } else if (valueOfGift <= thres2){
            System.out.println("Tax: " + (tax1flat + (valueOfGift - thres1)*tax1rate) );
        } else if (valueOfGift <= thres3){
            System.out.println("Tax: " + (tax2flat + (valueOfGift - thres2)*tax2rate) );
        } else if (valueOfGift <= thres4){
            System.out.println("Tax: " + (tax3flat + (valueOfGift - thres3)*tax3rate) );
        } else if (valueOfGift <= thres5){
            System.out.println("Tax: " + (tax4flat + (valueOfGift - thres4)*tax4rate) );
        } else {
            System.out.println("Tax: " + (tax5flat + (valueOfGift - thres5)*tax5rate));
        }
    }
}
