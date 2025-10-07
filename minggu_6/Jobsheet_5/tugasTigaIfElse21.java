import java.util.Scanner;

public class tugasTigaIfElse21 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //Input
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
        String jenisPengguna = sc.next().toLowerCase();

        // Proses
        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenisPengguna.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak.");
        }

        sc.close();
    }
}
