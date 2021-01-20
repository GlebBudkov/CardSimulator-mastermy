package CardSimulator;

public class Main {
    public static void main(String[] args) {
        Card card = new CreditCard("Ledenev Roman", 1000.00);
        System.out.println(card);
        card.putMoney(150.68);
        System.out.println(card.getBalance());
        card.withdrawBalance(150.68);
        System.out.println(card.getBalanceInDollars(2.62));
        System.out.println(card.info());
        Card card1 = new CreditCard("Ledenev Roman");
        System.out.println(card.equals(card1));
        System.out.println(card.getUserName());
    }
}