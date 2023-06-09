package StrategyPatternStadion;

public class TicketChild implements Ticket {
    private double tax = 1.20;
    private double price = 9.99;

    @Override
    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double calcPrice() {
        double sum = price * tax;
        return sum;
    }
}
