package PizzaFactory;

import PizzaFactory.Models.*;

public class PizzaFactoryPattern {
    public static void main(String[] args) {

        Pizzeria p1 = BerlinPizzeriaFactory.getBerlinPizzeria(Type.BerlinDiavolo, Preparation.backen);
        Pizzeria p2 = BerlinPizzeriaFactory.getBerlinPizzeria(Type.BerlinSalami, Preparation.schneiden);

        Pizzeria p3 = HamburgPizzeriaFactory.getHamburgPizzeria(Type.HamburgHawai, Preparation.einpacken);
        Pizzeria p4 = HamburgPizzeriaFactory.getHamburgPizzeria(Type.HamburgSalami, Preparation.backen);

        Pizzeria p5 = RostockPizzeriaFactory.getRostockPizzeria(Type.RostockMargharita, Preparation.schneiden);
        Pizzeria p6 = RostockPizzeriaFactory.getRostockPizzeria(Type.RostockCalzone, Preparation.einpacken);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);



    }

}
