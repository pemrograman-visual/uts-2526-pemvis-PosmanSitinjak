//12S25017 - Fenita Anjelina Simbolon
//12S25048 - Posman H.C. Sitinjak

import java.util.*;
import java.lang.Math;

public class kalkulator {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int penjumlahan, pengurangan, perkalian, pembagian;
        String pilihan;
        int angka1, angka2;

        pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            angka1 = Integer.parseInt(input.nextLine());
            angka2 = Integer.parseInt(input.nextLine());
            penjumlahan = angka1 + angka2;
            System.out.println(penjumlahan);
        } else {
            if (pilihan.equals("2")) {
                angka1 = Integer.parseInt(input.nextLine());
                angka2 = Integer.parseInt(input.nextLine());
                pengurangan = angka1 - angka2;
                System.out.println(pengurangan);
            } else {
                if (pilihan.equals("3")) {
                    angka1 = Integer.parseInt(input.nextLine());
                    angka2 = Integer.parseInt(input.nextLine());
                    perkalian = angka1 * angka2;
                    System.out.println(perkalian);
                } else {
                    if (pilihan.equals("4")) {
                        angka1 = Integer.parseInt(input.nextLine());
                        angka2 = Integer.parseInt(input.nextLine());
                        pembagian = (double) angka1 / angka2;
                        System.out.println(pembagian);
                    }
                }
            }
        }
    }
}
