import java.util.Scanner;
public class kafe21Percobaan3 {
    public static void main(String namaPelanggan, boolean isMember) { //fungsi paramenter percobaan 2
        System.out.println("Selamat datang di Kafe 21, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        } 

        System.out.println("========== Kafe 21 Menu ==========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capppuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===================================");
        System.out.println("Silakan pilih menu:");


    }

    public static int hitungTotalHarga21(int pilihanMenu, int banyakItem) { //percobaan 3
        int [] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaMenu[pilihanMenu - 1] * banyakItem;
        return totalHarga;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem);
        System.out.print("Total harga yang harus dibayar: Rp " + totalHarga);
    }
}
