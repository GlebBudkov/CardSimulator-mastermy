package CardSimulator;

public class Atm {
    private Card card;

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void putMoney(double moneyBYN) {
        card.putMoney(moneyBYN);
    }

    public void withdrawBalance(double moneyBYN) {
        card.withdrawBalance(moneyBYN);
    }

    public String info() {
        return card.info();
    }
}
