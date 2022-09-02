import java.util.Arrays;
import java.util.Scanner;

public class Foure {
     /*
    4 Skriv ett program som frågar användaren efter ett tal. Programmet ska skapa en ny array som är så lång och fylla den med slumptal (se uppgift 3)
    av datatypen int. Skriv ut alla talen och vad de har för medelvärde som en double.
     */
     public static void main(String[] args) {
         // Random random = new Random();                       input of random number
         Scanner sc = new Scanner(System.in);
         int sum = 0;


         System.out.println("Enter a number how long do you wanna have a list ");
         int [] list = new int[sc.nextInt()];

         for (int i = 0; i < list.length; i++) {
             list[i] = (int)(Math.random() * list.length) + 1;
             // list[i] = random.nextInt(bound: 101);            Second way to get a random number
             sum += list[i];
         }

         System.out.println(Arrays.toString(list));
         System.out.println("Average number is: " + averageNum(sum));


     }
    static double averageNum (int sum){
        double averageNum = 0;
        return averageNum =(double) sum /2;
        }
     }

