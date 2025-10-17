//12S25017 - Fenita Anjelina Simbolon
//12S25048 - Posman H.C. Sitinjak

import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, mahasiswa;
        double nr, total, max, min;
        double[] ns = new double[4];

        total = 0;
        mahasiswa = Integer.parseInt(input.nextLine());
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ":");
            ns[i] = Double.parseDouble(input.nextLine());
            total = total + ns[i];
        }
        nr = total / 4;
        max = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] > max) {
                max = ns[i];
            }
        }
        min = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println("Ratarata:" + nr);
        System.out.println("Tertinggi:" + max);
        System.out.println("Terendah:" + min);
    }
}
