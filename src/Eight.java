import java.util.Arrays;

public class Eight {
    /*
    8 Bubble sort är en algoritm för att sortera en array. Den går igenom en array och byter plats på element tills arrayen är sorterad. För att göra det använder man två for-loopar. Skriv ett program som sorterar en slumpad array med bubble sort. Använd den här algoritmen:
    För varje element i loopen, i
    För varje element i loopen från i+1
    Om elementet med index i är större än elementet med index i+1, byt plats på dem

     */
    public static void main(String[] args) {

        int [] array = {3,5,1,2,6,8};

        System.out.println(Arrays.toString(array));
        System.out.println();
        bubbleSortering(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] bubbleSortering(int [] array){
        boolean swapping = true;
        while (swapping){
            swapping = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i +1]){
                    int temp = array[i +1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    swapping = true;
                }
            }
        }
        return array;
    }
}
