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
        int total=0;

        // Input menu dan harga
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            menu[i] = sc.nextLine();
            System.out.print("Harga " + (i + 1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            total += harga[i]; // menghitung total harga
        }

        // Menampilkan daftar menu dan total harga
        System.out.println("\nDaftar Menu Anda:");
        
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp. " + harga[i]);
            
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Total Harga: Rp" + total);

        
    }
}