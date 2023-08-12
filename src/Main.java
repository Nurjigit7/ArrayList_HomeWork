import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(new Integer[50]));
        ArrayList<Integer> even = new ArrayList<>();   // чётные
        ArrayList<Integer> odd = new ArrayList<>();    // нечётные

        for (Integer san : data) {
            san = random.nextInt(1, 100);
            if (san % 2 == 1) {
                even.add(san);
            } else {
                odd.add(san);
            }
        }
        System.out.println("так сандар :");
        for (Integer a : even) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("жуп сандар:");
        for (Integer s : odd) {
            System.out.print(s + " ");
        }


    }
}