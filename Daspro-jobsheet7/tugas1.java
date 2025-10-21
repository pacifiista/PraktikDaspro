import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        double Hargatiket=50000, jmlPelanggan=0, jmlTiket=0, totalHarga=0, totalSehari=0;
        double diskon1=0.9, diskon2=0.85;
    

        System.out.print("Masukkan jumlah pengunjung hari ini: ");
            jmlPelanggan=sc.nextDouble();

        // proses
        for (int i = 1; i <= jmlPelanggan; i++) {
            System.out.print("Jumlah tiket yang dibeli pelanggan ke- " + i + ": ");
            jmlTiket = sc.nextDouble();
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }
            else if (jmlTiket > 10 ) {
                totalHarga = (jmlTiket*Hargatiket*diskon2);
            }
            else if (jmlTiket < 4) {
                 totalHarga = (jmlTiket*Hargatiket*diskon1);
            }
            System.out.println("Total Harga yang harus dibaya pelanggan ke-" + i + ":Rp" + totalHarga);
            totalSehari += totalHarga;
        }   

        System.out.println("Total pendapatan hari ini: Rp. " + totalSehari);
       
        
               
        }
    }
