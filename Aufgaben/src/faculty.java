public class faculty {

    public static void main(String[] args) {

        int number = 6;
        System.out.println("Das Ergebnis ist: " + facultyEndRecursive(1, number));
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
