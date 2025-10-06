import java.util.Scanner;
public class BiayaSewaMobil21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Deklarasi
    int jmlHari, biayaSewa=300000, biayaSupir=200000, jarak, biayaBBM= 1000, totalBiayaSewa, totalBiayaSupir, totalBiayaBBM, totalBiayaKeseluruhan;

    // input
    System.out.print("Masukkan Jarak tempuh mobil: ");
    jarak = sc.nextInt();
    System.out.print("Masukkan jumlah hari sewa: ");
    jmlHari = sc.nextInt();

    //Proses
    totalBiayaSewa=jmlHari*biayaSewa;
    totalBiayaSupir=jmlHari*biayaSupir;
    totalBiayaBBM=jarak*biayaBBM;
    totalBiayaKeseluruhan=totalBiayaSewa+totalBiayaSupir+totalBiayaBBM;

    //Output
    System.out.print("jadi total keseluruhan untuk biaya sewa mobil ialah: Rp." + totalBiayaKeseluruhan);
    }
}