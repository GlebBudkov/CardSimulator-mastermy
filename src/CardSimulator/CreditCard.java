package CardSimulator;

import java.math.BigDecimal;

public class CreditCard extends Card{
    public CreditCard(String userName) {
        super(userName);
    }

    public CreditCard(String userName, double balance) {
        super(userName, balance);
    }

    @Override
    public void withdrawBalance(double moneyBYN) {
        BigDecimal balanceBD = new BigDecimal(balance);
        BigDecimal moneyBD = new BigDecimal(moneyBYN);
        BigDecimal differenceBD = balanceBD.subtract(moneyBD);
        balance = differenceBD.doubleValue();
    }
}
