public class faculty {

    public static void main(String[] args) {

        int number = 6;
        System.out.println("Das Ergebnis ist: " + facultyRecursive(6));
    }

    public static int facultyRecursive(int number){
        return facultyEndRecursive(1, number);
    }

    public static int facultyEndRecursive(int m, int n){
        if (n == 0){
            return m;
        }
        else{
             return facultyEndRecursive(m * n,n - 1);
        }

    }

}
