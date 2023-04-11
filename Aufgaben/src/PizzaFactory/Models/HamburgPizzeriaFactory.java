package PizzaFactory.Models;

public class HamburgPizzeriaFactory {
    public static Pizzeria getHamburgPizzeria(Type type, Preparation preparation){
        if(type == Type.HamburgHawai){
            return new HamburgPizzeria(preparation, type);
        }
        else if(type == Type.HamburgSalami){
            return new HamburgPizzeria(preparation, type);
        }
        return null;
    }
}
