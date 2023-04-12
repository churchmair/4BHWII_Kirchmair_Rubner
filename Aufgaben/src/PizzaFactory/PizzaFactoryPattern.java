package PizzaFactory;

import PizzaFactory.Models.*;

public class PizzaFactoryPattern {
    public static void main(String[] args) {

        Pizzeria p1 = PizzeriaFactory.getPizzeria(Type.BerlinDiavolo, Preparation.backen);
        Pizzeria p2 = PizzeriaFactory.getPizzeria(Type.BerlinSalami, Preparation.schneiden);
        Pizzeria p3 = PizzeriaFactory.getPizzeria(Type.HamburgHawai, Preparation.einpacken);
        Pizzeria p4 = PizzeriaFactory.getPizzeria(Type.HamburgSalami, Preparation.backen);
        Pizzeria p5 = PizzeriaFactory.getPizzeria(Type.RostockMargharita, Preparation.schneiden);
        Pizzeria p6 = PizzeriaFactory.getPizzeria(Type.RostockCalzone, Preparation.einpacken);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);



    }

}
