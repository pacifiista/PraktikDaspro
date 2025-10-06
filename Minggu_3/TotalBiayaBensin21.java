import java.util.Scanner;

public class TotalBiayaBensin21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Deklarasi
    double jarak, konsumPerLiter=2.0, hargaPerLiter=10000.0, literDibutuhkan, totalBiaya;

    // Input
    System.out.print("Masukkan Jarak tempuh mobil: ");
    jarak = sc.nextDouble();
    
    // Proses
    literDibutuhkan = jarak / konsumPerLiter;
    totalBiaya = literDibutuhkan * hargaPerLiter;

    // Output
    System.out.print("Total biaya bensin mobil untuk perjalanan sebesar Rp. " + totalBiaya);

    }
}