public class BinarySearch {

    public static void binarySearch(char arr[], int first, int last, char key){

        int mid = first + (last - first)/2;

        while( first <= last ){

            // (int)arr[mid] wandelt den wert arr[mid] in einen int um
            if ( (int)arr[mid] < (int)key ){
                // der gesuchte buchstabe ist größer => first wert wird auf den jetzigen mittelpunkt gesetzt
                first = mid + 1;

                // mid ist der gesuchte Buchstabe
            }else if ( arr[mid] == key ){

                //Ausgabe
                System.out.println("Element is found at index: " + mid);
                break;

                // abbruchs bedingung if (first > last)  daher abruch der while schleife
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        // array erstellen
        char arr[] = {'a','b','c','d','e','f','g','h','i'};
        // wert nachdem gesucht wird
        char key = 'a';

        binarySearch(arr,0,arr.length-1,key);
    }
}
