package PizzaFactory.Models;

public class PizzeriaFactory {

    public static Pizzeria getPizzeria(Type type, Preparation preparation){
        if(type == Type.BerlinDiavolo){
            return new BerlinPizzeria(preparation, type);
        }
        else if(type == Type.BerlinSalami){
            return new BerlinPizzeria(preparation, type);
        }
        else if(type == Type.RostockCalzone){
            return new RostockPizzeria(preparation, type);
        }
        else if(type == Type.RostockMargharita){
            return new RostockPizzeria(preparation, type);
        }
        else if(type == Type.HamburgSalami){
            return new HamburgPizzeria(preparation, type);
        }
        else if(type == Type.HamburgHawai){
            return new HamburgPizzeria(preparation, type);
        }
        return null;
    }
}
