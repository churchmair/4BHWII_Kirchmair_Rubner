package FactoryPattern.Models;

public class EnvelopesFactory {

    public static Envelopes getEnvelopes(String size, String weight){
        if("A4".equalsIgnoreCase(size)){
            return new A4(size, weight);
        }
        else if("A5".equalsIgnoreCase(size)){
            return new A5(size, weight);
        }
        else if("A6".equalsIgnoreCase(size)){
            return new A6(size, weight);
        }
        return null;
    }
}
