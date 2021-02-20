
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_MEAL = 2.50;
    private static final double HEARTY_MEAL = 4.30;

    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        
        
        if (payment >= AFFORDABLE_MEAL) {
            this.money = this.money + AFFORDABLE_MEAL;
            affordableMeals++;
            return payment - AFFORDABLE_MEAL;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= HEARTY_MEAL) {
            this.money = this.money + HEARTY_MEAL;
            heartyMeals++;
            return payment - HEARTY_MEAL;
        } else {
            return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_MEAL){
            card.takeMoney(AFFORDABLE_MEAL);
            affordableMeals++;
            return true;
        }
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= HEARTY_MEAL) {
            card.takeMoney(HEARTY_MEAL);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0){
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
