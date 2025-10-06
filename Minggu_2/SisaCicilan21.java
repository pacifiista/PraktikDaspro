import java.util.Scanner;

public class SisaCicilan21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Deklarasi
    int hargaMotor, uangMuka, jmlLama, sisaCicilan;
    double bunga=0.01, bungaCicilan, jmlCicilan, totalCicilan;

    // Input
    System.out.print("Masukkan Harga motor: Rp. ");
    hargaMotor = sc.nextInt();
    System.out.println("Masukkan Uang muka motor: Rp. ");
    uangMuka = sc.nextInt();
    System.out.println("Masukkan Lama bulan cicilan: ");
    jmlLama = sc.nextInt();

    // Proses
    sisaCicilan = hargaMotor - uangMuka;
    bungaCicilan = bunga * sisaCicilan;
    totalCicilan = bungaCicilan + sisaCicilan;
    jmlCicilan = totalCicilan / jmlLama;

    // Output 
    System.out.print("Jumlah cicilan per bulan yang harus dibayar Pak Ali adalah: Rp. " + jmlCicilan);
    }
}