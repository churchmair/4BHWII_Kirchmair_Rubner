package ObserverPatternWetterstation;

public class Client2 implements PushClient{
    @Override
    public void update(int humidity, int temperature, int windSpeed) {
        System.out.println(getClass().getSimpleName());
        if (temperature >= 30){
            System.out.println("Temperatur: Leuchte ist rot");
        }
        else if((temperature >=15)){
            System.out.println("Temperatur: Leuchte ist gelb");
        }
        else{
            System.out.println("Temperatur: Leuchte ist blau");
        }
        if(humidity >= 75){
            System.out.println("Luftfeuchtigkeit: Hohe Luftfeuchtigkeit");
        }
        else if((humidity >= 50)){
            System.out.println("Luftfeuchtigkeit: erhöhte Luftfeuchtigkeit");
        }
        else if(humidity >= 25){
            System.out.println("Luftfeuchtigkeit: normale Luftfeuchtigkeit");
        }
        else{
            System.out.println("Luftfeuchtigkeit: niedrige Luftfeuchtigkeit");
        }
        if(windSpeed > 100){
            System.out.println("Windgeschwindigkeit: Alarmsirene ist ein");
        }
        else if(windSpeed > 50){
            System.out.println("Windgeschwindigkeit: Warnung ist ein");
        }
        else{
            System.out.println("Windgeschwindigkeit: Es passiert nichts");
        }
    }
}
