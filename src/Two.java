public class Two {
    /*
    Skriv ett program som räknar ut summan av alla element i arrayen [2, 3, 5, 8, 13, 21, 34].
    Extra utmaning: vartannat tal ska adderas och varannat subtraheras.
     */
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        int add = 0;
        int subtract = 0;

        for (int i = 0; i < list.length; i++) {
            sum = list[i] + list[i];

        }
        System.out.println(sum);

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0){
                add += list[i];
            }
            else if (list[i] % 2 == 1){
                subtract -= list[i];
            }
        }
        System.out.println("Add num: " + add);
        System.out.println("Subtract num: " + subtract);
    }
}
