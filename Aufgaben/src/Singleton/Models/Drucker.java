package Singleton.Models;

public class Drucker {

    private static Drucker instance = new Drucker();

    private Drucker(){}

    public static Drucker getInstance(){
        return instance;
    }

    public static String drucken(){
        return "Ich drucke, bin die Instanz " + Drucker.getInstance().hashCode();
    }


}