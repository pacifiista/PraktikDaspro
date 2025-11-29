
public class kafe21Percobaan2 {
    public static void main(String namaPelanggan, boolean isMember, String kodePromo) { //fungsi paramenter percobaan 2
        System.out.println("Selamat datang di Kafe 21, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        } 

        // Soal Percobaan 2 No 6
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon tambahan 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon tambahan 30%.");
        } else  {
            System.out.println("Kode promo tidak valid.");
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
        }


