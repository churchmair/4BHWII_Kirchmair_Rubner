package ProxyDrucker;

public class RealDrucker implements Drucker {

    @Override
    public void print(int numberPages) {
        if((numberPages > 0) && (numberPages <= 50)){

            System.out.println("Print " + numberPages + " Pages in Color");
        }
        else if((numberPages > 50) && (numberPages < 500)){
            System.out.println("Print " + numberPages + " Pages in Black and White");
        }
    }
}
