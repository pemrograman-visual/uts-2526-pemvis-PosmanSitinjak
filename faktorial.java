//12S25017 - Fenita Anjelina Simbolon
//12S25048 - Posman H.C. Sitinjak

import java.util.*;
import java.lang.Math;

public class faktorial {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan, faktorial, i;

        System.out.println("Masukkan bilangan(0-15)");
        bilangan = Integer.parseInt(input.nextLine());
        faktorial = 1;
        i = 1;
        while (i <= bilangan) {
            faktorial = faktorial * i;
            i = i + 1;
        }
        System.out.println("Hasil Faktorial=" + faktorial);
    }
}
