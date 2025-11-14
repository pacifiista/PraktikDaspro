import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah siswa dan jumlah mata kuliah
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlMatkul = sc.nextInt();

        int [][] nilai = new int[jmlMahasiswa][jmlMatkul];

        //Input nilai per Mahasiswa
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalNilai = 0;
        

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.println("Nilai Mata Kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalNilai += nilai [i][j];
            }
            double rataRatasiswa=0;
            rataRatasiswa = totalNilai / jmlMatkul;
            System.out.printf("Rata-rata nilai mahasiswa ke-%d: %.2f%n", (i+1), rataRatasiswa);
        }   

        // Rata-rata per Matkul
        System.out.println("====================");
        System.out.println("Rata-rata Nilai setiap Mata kuliah: ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul=0;
            for (int i = 0; i < jmlMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            double rataRataMatkul = totalPerMatkul / jmlMahasiswa;
            System.out.printf("Mata kuliah %d: %.2f%n", (j + 1), rataRataMatkul);

        }


        sc.close();
    }
    
}

 // int[][] nilai = new int[4][3];

        // for (int i = 0; i < nilai.length; i++) {
        //     System.out.println("Input nilai mahsiswa ke-" + (i+1));
        //     double totalPerSiswa = 0;

        //     for (int j = 0; j < nilai[i].length; j++) {
        //         System.out.print("Nilai mata kuliah " + (j+1) + ": ");
        //         nilai[i][j] = sc.nextInt();
        //         totalPerSiswa += nilai[i][j];
        //     }

        //     System.out.println("nilai rata-rata: " + totalPerSiswa/3);
        // }

        // System.out.println("\n===================================");
        // System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        // for (int j = 0; j < 3; j++) {
        //     double totalPerMatkul = 0;
            
        //     for (int i = 0; i < 4; i++) {
        //         totalPerMatkul += nilai[i][j];
        //     }

        //     System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/4);
        // }