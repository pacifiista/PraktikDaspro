import java.util.Scanner;
public class NilaiKelompok21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalNilai=0,rataNilai;
        int nilai;

        int i=1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai=0;
        
        for (int j = 1; j <= 5; j++) {
            System.out.print("Nilai dari kelompok Penilai " + j + ": ");
            nilai = sc.nextInt();
            totalNilai += nilai; 
            
        }
        rataNilai = totalNilai   / 5;
        i++;
        System.out.println("Rata-rata nilai kelompok: " +  rataNilai);
    }
}
}