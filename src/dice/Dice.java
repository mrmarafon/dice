package dice;

public class Dice {

    public static void main(String[] args) {
        int n;
        int count[] = new int[7];
        for (int i = 0; i < 10000; i++) {
            n = (int) (Math.random() * 6 + 1);
            //  System.out.print(n+" ");
            count[n]++;
        }
        for (n = 1; n < 7; n++) {

            System.out.println(n + "--" + count[n] + " ");
        }

        System.out.println();
    }

}
