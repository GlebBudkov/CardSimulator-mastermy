package CardSimulator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Card {
    protected final String userName;
    protected double balance;

    public Card(String userName) {
        this.userName = userName;
    }

    public Card(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getUserName() {
        return userName;
    }

    public void putMoney(double moneyBYN) {
        BigDecimal balanceBD = new BigDecimal(balance);
        BigDecimal moneyBD = new BigDecimal(moneyBYN);
        BigDecimal summBD = balanceBD.add(moneyBD);
        balance = summBD.doubleValue();
    }

    public abstract void withdrawBalance(double moneyBYN);

    public String info() {
        return "Имя держателя: " + userName + "\n" + "баланс: " + balance + " BYN";
    }

    public double getBalanceInDollars(double dollarRate) {
        BigDecimal dollarRateBD = new BigDecimal(dollarRate);
        BigDecimal balanceBD = new BigDecimal(balance);
        BigDecimal balanceUSD = balanceBD.divide(dollarRateBD, 2, RoundingMode.HALF_UP);
        return balanceUSD.doubleValue();
    }

    @Override
    public String toString() {
        return "Card{" +
                "userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        if (!card.userName.equals(userName)) return false;
        return card.balance == balance;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 31 + userName.hashCode();
        long temp = Double.doubleToLongBits(balance);
        result = result * 31 + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
