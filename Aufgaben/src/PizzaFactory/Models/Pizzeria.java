package PizzaFactory.Models;

public abstract class Pizzeria {

    private Preparation _preparation;
    private Type _type;

    public Pizzeria(Preparation preparation, Type type){
        _preparation = preparation;
        _type = type;
    }

    @Override
    public String toString(){
        return "Typ: " + _type + " " + "Zubereitung: " + _preparation + " ";
    }
}
