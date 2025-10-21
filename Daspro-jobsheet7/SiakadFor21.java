import java.util.Scanner;
public class SiakadFor21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Deklarasi
    double nilai, tertinggi=0, terendah=100;
    int lulus=0, tidakLulus=0, batasKelulusan=60;

    for (int i = 1; i < 10; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();  // Input
        if (nilai>tertinggi) {
            tertinggi = nilai;
        }
        if (nilai<terendah) {
            terendah = nilai;
        }
        if (nilai >= batasKelulusan) {
            lulus++;
        } else {
            tidakLulus++;
        }
    }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
<<<<<<< HEAD
        System.out.println("Jumlah mahasiswa lulus: " +lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " +tidakLulus);
=======
>>>>>>> d42da47627a0541db3ca753174323702aa9ad445
    }
}
