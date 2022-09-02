public class Ten {
    /*
    10 Skapa en tvådimensionell array som matchar uppgift 7b. Skriv ut innehållet på konsolen. Kontrollera att det blir samma resultat som i uppgift 7b.
     */
    public static void main(String[] args) {
        int [][] array = new int[4][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i == j || i == (j % 4))
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }
}
