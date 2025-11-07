import java.util.Scanner;
public class tugas3kafe_21 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       // deklarasi daftar menu makanan dalam bentuk array
       String [] menu = {"Nasi goreng", "Mie goreng", "Capcay", "Es teh", "Es jeruk"};

       System.out.println("----------------------------------");
       System.out.println("SELAMAT DATANG DI CAFE DEMI UNGKER");
       System.out.println("----------------------------------");
       System.out.println("Daftar Menu Kami: ");

       for (String item : menu) {
            System.out.println("-" + item);
       }
       System.out.println("===================================");

       //input nama makanan yang ingin dicari (users)
       System.out.print("Masukkan nama menu makanan / minuman yang Anda ingin cari: ");
       String key = sc.nextLine();

       //Proses mencari nama makanan
       boolean found = false;
       int idx = -1; // untuk nilai default

       for (int i = 0; i < menu.length; i++) {
        if (menu[i].equalsIgnoreCase(key)) {
            found = true;
            idx = i; // simpan index jika ditemukan
            break;
         }
       }
       // output
       System.out.println("------------------------------------");
       if (found) {
            System.out.println("Hasil Pencarian");
            System.out.println("Makanan/Minuman \"" + key + "\" TERSEDIA di menu kami.");
            System.out.println("Ditemukan pada indeks ke- " + idx + "\" dalam daftar menu.");
       } else {
            System.out.println("Hasil Pencarian: ");
            System.out.println("Maaf, Makanan/Minuman \"" + key + "\" TIDAK ADA di menu kami.");
       }
       System.out.println("----------------------------------");
       sc.close();
    }
}