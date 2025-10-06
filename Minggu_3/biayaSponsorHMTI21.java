import java.util.Scanner;
public class biayaSponsorHMTI21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Deklarasi
    int biayaPublikasi=300000, biayaDekorasi=500000, konsum=500000, hadiah=4000000, biayaOperasional=500000, jmlPeserta, konsumPeserta=25000, honorJuri=75000;
    int biayaRegistrasi=50000,totalBiaya, totalBiayaKonsum, totalHonorJuri, totalBiayaTetap, totalPendaftaran;
    double danaPolinema=0.60, sponsor;
    String naura = "anjay";

    //Input
    System.out.print("Masukkan jumlah peserta: ");
    jmlPeserta = sc.nextInt();

    //Proses
    totalBiayaTetap= biayaPublikasi+biayaDekorasi+konsum+hadiah+biayaOperasional;
    totalBiayaKonsum= jmlPeserta*3*konsumPeserta;
    totalHonorJuri=jmlPeserta*honorJuri;
    totalPendaftaran= jmlPeserta*biayaRegistrasi;
    totalBiaya = (totalBiayaTetap+totalBiayaKonsum+totalHonorJuri)-totalPendaftaran;
    sponsor = (1-danaPolinema)*totalBiaya;

    //Output
    System.out.print("Total dana yang perlu dipenuhi melalui Sponsor ialah: Rp. " +sponsor);
    }
}