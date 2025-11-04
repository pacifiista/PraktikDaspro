import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        // input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1)+ " :");
            nilaiMhs[i] = sc.nextInt();
        }

        // hitung 
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            
        }

        // hitung rata-rata
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " +rata2);
    }
}
