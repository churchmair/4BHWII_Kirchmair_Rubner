package StrategyPatternStadion;

public class TicketAdult implements Ticket {

    private double tax = 1.20;
    private double price = 19.99;

    @Override
    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double calcPrice() {
        return price = price * tax;
    }
}
