package PizzaFactory.Models;

public class RostockPizzeriaFactory {

    public static Pizzeria getRostockPizzeria(Type type, Preparation preparation){
        if(type == Type.RostockCalzone){
            return new RostockPizzeria(preparation, type);
        }
        else if(type == Type.RostockMargharita){
            return new RostockPizzeria(preparation, type);
        }
        return null;
    }
}
