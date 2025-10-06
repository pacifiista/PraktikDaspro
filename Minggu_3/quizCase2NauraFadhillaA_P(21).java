import java.util.Scanner;
public class quizCase2NauraFadhillaA_P(21) {
    public static void main(String[] args) {
    // Nama Program Target kalori 3 jenis olahraga

    Scanner sc = new Scanner(System.in); 
    // Deklarasi
    int durasi, beratBadan, ketinggian, kecepatan;
    double berlari=0.05, berenang=0.04, bersepeda=0.03, totalKalori, rataRataKalori; //koefisien 3 jenis olahraga
    double kaloriBerlari, KaloriBerenang, kaloriBersepeda, presentaseTarget;

    // Input
    System.out.print("Masukkan durasi olahraga: ");
    durasi = sc.nextInt();
    System.out.print("Masukkan berat badan:");
    beratBadan = sc.nextInt();
    System.out.print("Masukkan Ketinggian lokasi: ");
    ketinggian = sc.nextInt();
    System.out.print("Masukkan kecepatan: ");
    kecepatan = sc.nextInt();

    // Proses
    //Hitung kalori untuk masing-masing olahraga
    kaloriBerlari = (durasi*berlari)+(kecepatan*0.5)+(ketinggian*0.01);
    kaloriBersepeda = (durasi*bersepeda)+(kecepatan*0.5)+(ketinggian*0.01);
    KaloriBerenang = (durasi*berenang)+(kecepatan*0.5)+(ketinggian*0.01);

    //Hitung Total Kalori yang terbakar
    totalKalori = kaloriBerlari+kaloriBersepeda+KaloriBerenang;

    // Rata-rata  kalori yang terbakar per menit
    rataRataKalori = (totalKalori/3)*(durasi/60); //60 ialah 60 detik atau per menit

    // Presentasi target kalori
    presentaseTarget = rataRataKalori*100;

    // Output
    System.out.print("Kalori yang terbakar saat berlari ialah: " + kaloriBerlari);
    System.out.print("Kalori yang terbakar saat bersepeda ialah: " + kaloriBersepeda);
    System.out.print("Kalori yang terbakar saat berenang ialah: " + KaloriBerenang);
    System.out.print("Total kalori yang terbakar dari semua aktivitas ialah: " + totalKalori);
    System.out.print("Rata-rata kalori yang terbakar ialah: " + rataRataKalori);
    System.out.print("Persentase kertercapaian target kalori harian: " + presentaseTarget);
    }
}