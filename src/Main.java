import java.util.ArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();   // чётные
        ArrayList<Integer> odd = new ArrayList<>();    // нечётные
        for (int i = 0; i <50 ; i++) {
            data.add(random.nextInt(1,100));
            if (data.get(i) % 2 == 1) {
                even.add(data.get(i));
            } else {
                odd.add(data.get(i));
            }
        }
        System.out.println("так сандар :");
        for (Integer  tak: even) {
            System.out.print(tak + " ");
        }
        System.out.println(" ");
        System.out.println("жуп сандар:");
        for (Integer jup : odd) {
            System.out.print(jup + " ");
        }


    }
}