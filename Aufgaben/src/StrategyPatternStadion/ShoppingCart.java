package StrategyPatternStadion;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Ticket> tickets;

    public ShoppingCart(){
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket){
        tickets.remove(ticket);
    }

    public double calcTotal(){
        double price = 0;
        for (Ticket t : tickets){
            price = price + t.calcPrice();
        }
        return price;
    }

}
