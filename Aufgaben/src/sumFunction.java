


public class sumFunction {

    public static void main(String[] args) {

        int zahl = 6;

        System.out.printf("Ergebnis mit Rekursive ist: %d", sumFunctionRecursive(zahl));

        System.out.printf("\nErgebnis mit Iterativ ist: %d", sumFunctionIterative(zahl));




    }


    public static int sumFunctionRecursive(int number){

        if(number == 1){
            return number = 1;
        }
        else{
            return number = number + sumFunctionRecursive(number = number - 1);
        }
    }

    public static int sumFunctionIterative(int number){
                int num = 1;
                while(number > 1){
                    num = num + number;
                    number--;
                }
                return num;



    }
}
