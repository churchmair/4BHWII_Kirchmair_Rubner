package FactoryPattern.Models;

public class EnvelopesFactory {

    public static Envelopes getEnvelopes(Size size, Double weight){
        if(size == Size.A4){
            return new A4(size, weight);
        }
        else if(size == Size.A5){
            return new A5(size, weight);
        }
        else if(size == Size.A6){
            return new A6(size, weight);
        }
        return null;
    }
}
