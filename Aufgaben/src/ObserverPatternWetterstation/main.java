package ObserverPatternWetterstation;

public class main {
    public static void main(String[] args) {

        Wheater wheater = new Wheater();
        PushClient c1 = new Client1();
        PushClient c2 = new Client2();

        wheater.addClient(c1);
        wheater.addClient(c2);

        wheater.setHumidity(80);
        wheater.setTemperature(20);
        wheater.removeClient(c2);
        wheater.setWindSpeed(75);
    }



}
