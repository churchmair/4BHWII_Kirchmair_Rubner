package Singleton;

import Singleton.Models.Drucker;

public class DruckerMain {
    public static void main(String[] args) {

        Drucker drucker = Drucker.getInstance();
        Drucker drucker2 = Drucker.getInstance();


        if(drucker == drucker2){
            System.out.println("Es seits der gleiche Drucker");
        }
        else{
            System.out.println(drucker.drucken());
            System.out.println(drucker2.drucken());
        }


    }
}
