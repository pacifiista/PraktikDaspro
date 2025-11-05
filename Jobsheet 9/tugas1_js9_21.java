import java.util.Scanner;
public class tugas1_js9_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // deklarasi
        double total=0, rata2=0;
        int tertinggi=0, terendah=0;

        //input banyak nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jmlNilai = sc.nextInt();
        int[] nilaiMhs = new int[jmlNilai];
        
        // input nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        // hitung rata-rata
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            } if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
            total += nilaiMhs[i];
            System.out.println("Nilai mahasiswa ke" +(i+1)+ " adalah : " +nilaiMhs[i]);
        }
        
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa: " +rata2);
        System.out.println("Nilai Tertinggi: " + tertinggi);
         System.out.println("Nilai Terendah: " + terendah);
    }
}
