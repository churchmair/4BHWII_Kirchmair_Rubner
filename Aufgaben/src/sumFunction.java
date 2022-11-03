public class sumFunction {

    public static void main(String[] args) {
        int number = 6;

        System.out.printf("Ergebnis mit Rekursiver Methode ist: %d", sumFunctionRecursive(number));

        System.out.printf("\nErgebnis mit Iterativer Methode ist: %d", sumFunctionIterative(number));




    }

    public static int sumFunctionRecursive(int number){

        if(number == 1 || number == 0){
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
