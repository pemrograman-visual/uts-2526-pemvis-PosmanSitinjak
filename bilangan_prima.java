//12S25017 - Fenita Anjelina Simbolon
//12S25048 - Posman H.C. Sitinjak

import java.util.*;
import java.lang.Math;

public class bilangan_prima {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, x;

        System.out.println("masukkan batas bilangan prima");
        n = Integer.parseInt(input.nextLine());
        if (n >= 2) {
            System.out.println("Bilangan prima dari 2 hingga" + n + ":");
            for (x = 2; x <= n; x++) {
                if (isPrima(x)) {
                    System.out.println(Integer.toString(x) + " ");
                }
            }
            System.out.println("");
        } else {
            System.out.println("input lebih besar dari 2");
        }
    }
}
