import java.util.Scanner;

public class faculty {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;
        System.out.println("Bitte Zahl eingeben [0-16]");
        number = reader.nextInt();

        System.out.println("Das Ergebnis ist: " + faculty(number));
    }

    private static int faculty(int zahl){
        return facultyEndRecursive(1, zahl);
    }


    public static int facultyEndRecursive(int sum, int fak){
        if (fak == 0){
            return sum;
        }
        else{
             return facultyEndRecursive(sum * fak,fak - 1);
        }

    }



}
