import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input 
        int panjang, lebar, jmlKolam, luasTanah, jariJari, sisi, luasPersegi;
        double luasLingkaran, totalKolam, luasRumput;

        //input dinamis
        System.out.println("Masukkan panjang kolam Anda: ");
        panjang = input.nextInt();
        System.out.println("Masukkkan lebar kolam Anda: ");
        lebar = input.nextInt();
        System.out.println("Masukkan sisi kolam Anda: ");
        sisi = input.nextInt();
        System.out.println("Masukkan jari-jari kolam Anda: ");
        jariJari = input.nextInt();
        System.out.println("Masukkan Jumlah kolam Anda: ");
        jmlKolam = input.nextInt();

        //proses penghitungan
        luasTanah = panjang*lebar;
        luasLingkaran = jmlKolam*3.14*jariJari*jariJari;
        luasPersegi = sisi*sisi;
        totalKolam = luasLingkaran + luasPersegi;
        luasRumput = luasTanah - totalKolam;

        System.out.println("Luas tanah yang dimiliki pak Jaka adalah: "+ luasTanah);
        System.out.println("Luas lingkaran kolam pak Jaka adalah: "+ luasLingkaran);
        System.out.println("Luas persegi kolam pak Jaka adalah: "+ luasPersegi);
        System.out.println("Luas RUmput yang akan ditanami oleh pak Jaka adalah: "+ luasRumput);
    }
}
