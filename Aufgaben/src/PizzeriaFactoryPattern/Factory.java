package PizzeriaFactoryPattern;

public class Factory {
    public static Pizzeria getInstance(PizzaTyp typ){

        if(typ == PizzaTyp.BerlinCalzone){
            return new BerlinPizzeria(new PizzaCalcone("BerlinCalcone"));
        }
        else if(typ == PizzaTyp.BerlinHawaii){
            return new BerlinPizzeria(new PizzaHawaii("BerlinHawaii"));
        }
        else if(typ == PizzaTyp.BerlinSalami){
            return new BerlinPizzeria(new PizzaSalami("BerlinSalami"));
        }
        else if(typ == PizzaTyp.HamburgCalzone){
            return new HamburgPizzeria(new PizzaCalcone("HamburgCalcone"));
        }
        else if(typ == PizzaTyp.HamburgHawaii){
            return new HamburgPizzeria(new PizzaHawaii("HamburgHawaii"));
        }
        else if(typ == PizzaTyp.HamburgSalami){
            return new HamburgPizzeria(new PizzaSalami("HamburgSalami"));
        }
        else if(typ == PizzaTyp.RostockCalzone){
            return new RostockPizzeria(new PizzaCalcone("RostockCalcone"));
        }
        else if(typ == PizzaTyp.RostockHawaii){
            return new RostockPizzeria(new PizzaHawaii("RostockHawaii"));
        }
        else if(typ == PizzaTyp.RostockSalami){
            return new RostockPizzeria(new PizzaSalami("RostockSalami"));
        }
        return null;
    }
}
