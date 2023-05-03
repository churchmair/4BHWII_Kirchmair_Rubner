package ObserverPatternWetterstation;

public class main {
    public static void main(String[] args) {

        Weather weather = new Weather();
        PushClient c1 = new Client1();
        PushClient c2 = new Client2();

        weather.addClient(c1);
        weather.addClient(c2);

        weather.setHumidity(80);
        weather.setTemperature(20);
        weather.removeClient(c2);
        weather.setWindSpeed(75);
    }



}
