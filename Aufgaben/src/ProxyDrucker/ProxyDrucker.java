package ProxyDrucker;

import java.util.ArrayList;
import java.util.List;

public class ProxyDrucker implements Drucker{

    private Drucker drucker = new RealDrucker();




    @Override
    public void print(int numberPages){
        if(numberPages >= 500){
            System.out.println("Too many pages! Decrease number of pages");
        }
        else if(numberPages <= 0){
            System.out.println("Too few pages! Increase number of pages");
        }
        drucker.print(numberPages);

    }
}
