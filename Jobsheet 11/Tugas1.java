import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a. Menyimpan hasil survey
        int [][] surveyData = new int[10][6];
        
        // 10 responden, 6 pertanyaan

        // input 
        System.out.println("Masukkan Jawaban survei (1-5): ");
        for (int i = 0; i < surveyData.length; i++) {
            System.out.print("Responden " + (i+1) + ": ");
            sc.nextLine();
        for (int j = 0; j < surveyData[i].length; j++) {
            System.out.print("Pertanyaan " + (j+1) + ": ");
            surveyData[i][j] = sc.nextInt();
            sc.nextLine();
        }
        }

        // menampilkan data survei
        System.out.println("Data Survey Kepuasan Pelanggan: ");
        for (int i = 0; i < surveyData.length; i++) {
            System.out.print("Responden " + (i+1) + ": ");
            for (int j = 0; j < surveyData[i].length; j++) {
                System.out.print(surveyData[i][j] + " ");
            }
            System.out.println();
        }
        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("Rata-Rata per Responden: ");
        for (int i = 0; i < surveyData.length; i++) {
            double total=0;
            for (int j = 0; j < surveyData[i].length; j++) {
                total += surveyData[i][j];
            }
            double rataRata = total /surveyData[i].length;
            System.out.printf("Responden %d: %.2f%n", i+1, rataRata);
        }
        



    }
}