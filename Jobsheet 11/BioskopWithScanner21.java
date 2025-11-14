import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // deklarasi
        int  baris, kolom, menu;
        String  nama, next;
        String[][] penonton = new String[4][2];

        // input
         while (true) {
            System.out.println("==========MENU=========");
            System.out.println("MENU 1: INPUT DATA PENONTON");
            System.out.println("MENU 2: TAMPILKAN DAFTAR PENONTON");
            System.out.println("MENU 3: EXIT");
            System.out.println("Pilih menu: (1/2/3) ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    
                    if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) { // berfungsi untuk mengecek apakah data masi kosong, jika masih maka data akan disimpan
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data berhasil disimpan.");
                            break;
                        } else {
                            System.out.println("Tempat sudah terisi, silahkan pilih tempat yang masih kosong!");
                        }
                    } else {
                        System.out.println("Baris dan kolom tidak valid. Silahkan coba lagi.");
                    }
                }
                case 2:
                System.out.println("==========DAFTAR PENONTON==========");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        String namaPenonton = penonton [i][j];
                         
                        if (namaPenonton != null) {
                            System.out.printf("baris %d, kolom %d: %s%n", i +1, j +1, "***");
                        } else {
                            System.out.printf("baris %d, kolom %d: [kosong]%n", (i +1), (j +1), namaPenonton);
                        }
                    }
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~");
                break;

                case 3: 
                System.out.println("Terima Kasih, keluar program.");
                System.exit(0);
                break;
            }
        }
    }          
}

    
                
                    
        // while (true) {
        //     System.out.print("Masukkan nama: ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukkan baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukkan kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();

        //     penonton[baris-1][kolom-1] = nama;
        //     System.out.print("Input penonton lainnya? (y/n): ");
        //     next = sc.nextLine();

        //     if (next.equalsIgnoreCase("n")) {
        //         break;
        //     }
        // }
    
