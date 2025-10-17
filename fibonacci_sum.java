//12S25017 - Fenita Anjelina Simbolon
//12S25048 - Posman H.C. Sitinjak

import java.util.*;
import java.lang.Math;

public class fibonacci_sum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int fb1, fb2, temp, jumlah, n, i;

        n = Integer.parseInt(input.nextLine());
        fb1 = 1;
        fb2 = 1;
        jumlah = 0;
        for (i = 0; i <= n; i++) {
            jumlah = jumlah + fb1;
            temp = fb1;
            fb1 = fb2;
            fb2 = temp + 1;
        }
        System.out.println(jumlah);
    }
}
