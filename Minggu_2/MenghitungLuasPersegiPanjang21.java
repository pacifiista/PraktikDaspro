import java.util.Scanner;

public class MenghitungLuasPersegiPanjang21 {
    public static void main(String[] args) {
    // Membuat objek scanner
    Scanner sc = new Scanner(System.in);

    // deklarasi 
    int panjang;
    int lebar;
    int luas;
    
    // input
    System.out.println("Masukkan Panjang ; ");
    panjang=sc.nextInt();
    System.out.println("Masukkan lebar: ");
    lebar=sc.nextInt();

    // Proses
    luas = panjang*lebar;

    // Output
    System.out.println("Luas persegi adalah " + luas);


    }
}