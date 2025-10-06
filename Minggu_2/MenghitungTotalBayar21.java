import java.util.Scanner;

public class MenghitungTotalBayar21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Deklarasi
    double potongan, jmlBayar, diskon=0.15, harga;

    //input
    System.out.println("Masukkan harga pakaian: ");
    harga=sc.nextInt();

    // Proses
    potongan=diskon*harga;
    jmlBayar=harga-potongan;

    // Output
    System.out.println("Besar potongan harga yang anda dapat: " + potongan);
    System.out.println(" Total harga pakaian setelah potongan harga: " + jmlBayar);


    }
}