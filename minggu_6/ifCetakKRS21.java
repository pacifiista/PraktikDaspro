package minggu_6;

import java.util.Scanner;

public class ifCetakKRS21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (True/False): ");
        boolean uktLunas = sc.nextBoolean();

        // Proses versi If-Else
            // if (uktLunas) {
            //System.out.println("Pembayaran UKT terverivikasi");
            //System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        //} else{
           // System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu ");
        //}

        // Versi Ternary operator
        String pesan = uktLunas
             ? "Pembayaran UKT terverivikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
             : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println("\n[Versi Ternary Operator]");
        System.out.println(pesan);
    }
}