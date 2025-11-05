import java.util.Scanner;

public class tugas2kafe_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah pesanan
        System.out.println("====================================");
        System.out.print("Masukkan jumlah pesanan anda: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); // membersihkan newline

        // Deklarasi array
        String[] menu = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];

        // Input menu dan harga
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            menu[i] = sc.nextLine();
            System.out.print("Harga " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Masukkan angka untuk harga!");
                sc.next(); // buang input yang salah
            }
            harga[i] = sc.nextInt();
            sc.nextLine(); // membersihkan newline
        }

        // Menampilkan daftar menu dan total harga
        System.out.println("\nDaftar Menu Anda:");
        int total = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp. " + harga[i]);
            total += harga[i];
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Total Harga: Rp" + total);

        // Pencarian menu
        System.out.print("\nMasukkan Menu pilihan anda: ");
        String key = sc.nextLine();
        boolean found = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(key)) {
                System.out.println("Menu \"" + key + "\" tersedia.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Menu \"" + key + "\" tidak tersedia.");
        }
    }
}