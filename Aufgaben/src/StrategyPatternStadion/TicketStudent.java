package StrategyPatternStadion;

public class TicketStudent implements Ticket {
    private double tax = 1.2;
    private double price = 12.99;


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
