package StrategyPatternStadion;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        TicketChild tc = new TicketChild();
        TicketAdult ta = new TicketAdult();
        TicketSenior ts = new TicketSenior();
        TicketStudent tst = new TicketStudent();

        cart.addTicket(tc);
        cart.addTicket(ta);
        cart.addTicket(ts);


        System.out.printf("The total price is: %.2f", cart.calcTotal());
        System.out.println();
        tc.setTax(1.10);

        System.out.printf("The total price is: %.2f", cart.calcTotal());
        System.out.println();

        cart.removeTicket(ts);
        cart.addTicket(tst);

        System.out.printf("The total price is: %.2f", cart.calcTotal());
    }

}
