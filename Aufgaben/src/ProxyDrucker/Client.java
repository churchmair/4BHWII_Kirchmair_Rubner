package ProxyDrucker;

public class Client {
    public static void main(String[] args) {
        Drucker drucker = new ProxyDrucker();

            drucker.print(23);
            drucker.print(450);
            drucker.print(-50);
            drucker.print(523);

    }
}
