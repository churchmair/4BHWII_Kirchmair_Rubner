package PizzeriaFactoryPattern;

public abstract class Pizzeria {
    private Pizza pizza;

    public Pizzeria(Pizza pizza){
        this.pizza = pizza;
    }

    public void backen(){
        System.out.println("Die Pizzeria " + this.getClass().getSimpleName() + " backt die Pizza " + pizza);
    }
    public void schneiden(){
        System.out.println("Die Pizzeria " + this.getClass().getSimpleName() + " schneidet die Pizza " + pizza);
    }
    public void einpacken(){
        System.out.println("Die Pizzeria " + this.getClass().getSimpleName() + " verpackt die Pizza " + pizza);
    }
}
