package CardSimulator;

import java.math.BigDecimal;

public class DebitCard extends Card{

    public DebitCard(String userName) {
        super(userName);
    }

    public DebitCard(String userName, double balance) {
        super(userName, balance);
    }
    @Override
    public void withdrawBalance(double moneyBYN) {
        if (moneyBYN > balance) {
            System.out.println("Not enough money");
        } else {
            BigDecimal balanceBD = new BigDecimal(balance);
            BigDecimal moneyBD = new BigDecimal(moneyBYN);
            BigDecimal differenceBD = balanceBD.subtract(moneyBD);
            balance = differenceBD.doubleValue();
        }
    }
}
