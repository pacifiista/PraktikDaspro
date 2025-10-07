package minggu_6.Jobsheet_5;

import java.util.Scanner;

public class nestedUjianSkripsi21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi
        String pesan, bebasKompen;
        int bimbinganP1, bimbinganP2;

        // Input
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        bimbinganP2 = sc.nextInt();

        // Proses
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang mencapai 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8 ) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
         } else {
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
            }
        System.out.println(pesan);
        }
    }
}
