package minggu_6;

import java.util.Scanner;

public class ifElseTugasDua21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi
        int angka;

        // Input
        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        // Proses
        if (angka % 2 == 0) {
            System.out.println("Angka genap");
        } else{
            System.out.println("Angka Ganjil");
        }
    }
}
