import java.util.Scanner;
public class biayaCetakBuku21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Deklarasi
    int biayaCetakPerHalaman=200, biayaJilid=20000, beratKertas=3, beratSampul=250;
    int beratKemasan=300, biayaPengirimPerKG=15000, jmlHalaman, totalBiayaCetak, beratTotal, biayaTotal;

    //Input
    System.out.print("Masukkan Jumlah Halaman: ");
    jmlHalaman = sc.nextInt();

    //Proses
    totalBiayaCetak=jmlHalaman*biayaCetakPerHalaman;
    beratTotal = (jmlHalaman/2)*beratKertas+beratSampul+beratKemasan;
    biayaTotal = totalBiayaCetak+(beratTotal*biayaPengirimPerKG/1000);

    //Output
    System.out.print("Total biaya yang harus dibayar berdasarkan jumlah halaman buku ialah: Rp. " + biayaTotal);
    }
}