import java.util.Scanner;
public class rapotarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[10];
        int total = 0; 

        for (int i = 0; i < grades.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke " + (i+1) + ": ");
            grades[i] = sc.nextInt();
            total+= grades[i];
        }

        double rataRata = total / grades.length;
        System.out.print("rata-rata dari 10 mahasiswa: " + rataRata);
    }
}