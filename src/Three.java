public class Three {
       /*
    3 Skriv ett program som skapar en array med fem heltal, som ska slumpas fram. Programmet ska sedan gå igenom arrayen och skriva ut vilket det
    största och minsta talet är samt hur många tal som är udda.
     */
       public static void main(String[] args) {
           int [] list = {2,1,4,3,7,5};

           bubbleSort(list);

           // System.out.println(Arrays.toString(list)); print out list from low to high
           int lowNumber = list[0];
           int higestNumber = list[list.length-1];
           System.out.println("This is lowest number in list:  " + lowNumber);
           System.out.println("This is highest number in list: " + higestNumber);

       }
    static void bubbleSort (int[] list){
        boolean swapping = true;
        while (swapping){
            swapping = false;
            for (int i = 0; i < list.length -1; i++) {

                if (list[i] > list[i+1]){
                    int temp = list[i+1];
                    list[i +1] = list[i];
                    list[i] = temp;
                    swapping = true;
                }
            }
        }
       }

}
