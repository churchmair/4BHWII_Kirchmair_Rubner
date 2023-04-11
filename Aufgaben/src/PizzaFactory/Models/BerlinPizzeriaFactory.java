package PizzaFactory.Models;

public class BerlinPizzeriaFactory {

    public static Pizzeria getBerlinPizzeria(Type type, Preparation preparation){
        if(type == Type.BerlinDiavolo){
            return new BerlinPizzeria(preparation, type);
        }
        else if(type == Type.BerlinSalami){
            return new BerlinPizzeria(preparation, type);
        }
        return null;
    }
}
