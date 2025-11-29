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

    public static int hitungTotalHarga21(int pilihanMenu, int banyakItem, String kodePromo) { //percobaan 3
        int [] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 0 || pilihanMenu > hargaMenu.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }
        int totalHarga = hargaMenu[pilihanMenu - 1] * banyakItem;

        // Soal Percobaan 3 No 3: Logika Diskon Kode Promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            totalHarga = (int)(totalHarga * 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            totalHarga = (int)(totalHarga * 0.7);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid, tidak ada potongan harga.");
        }

        return totalHarga;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextInt(); // consume newline
        System.out.print("Masukkan kode promo (jika ada, kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();
        
        // Memanggil fungsi untuk menampilkan sambutan dan menu
        kafe21Percobaan3.main(namaPelanggan, isMember);
        int totalKeseluruhan = 0;
        boolean lanjut = true;

        // Loop untuk pemesanan berulang
        while (lanjut) {
            System.out.print("Pilih nomor menu yang ingin dipesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan banyak item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); // consume newline

            int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }
        System.out.println("Total keseluruhan harga pesanan Anda: Rp " + totalKeseluruhan); 
    }
}
}
