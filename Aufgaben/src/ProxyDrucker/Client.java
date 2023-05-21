package ProxyDrucker;

public class Client {
    public static void main(String[] args) {
        Drucker drucker = new ProxyDrucker();
        try{
            drucker.print(23);
            drucker.print(450);
            drucker.print(-50);
            drucker.print(523);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
