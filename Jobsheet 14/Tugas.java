import java.util.Scanner;

public class Tugas {

    // Fungsi rekursif untuk menjumlahkan array dari belakang
    static int totalRekursif(int[] data, int index) {
        if (index < 0) {
            return 0; // base case
        } else {
            return data[index] + totalRekursif(data, index - 1); // recursion call
        }
    }

    // Fungsi iteratif untuk menjumlahkan array
    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        // Input angka dari belakang ke depan
        for (int i = N - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke–" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        // Hitung dan cetak total dengan rekursif
        int hasilRekursif = totalRekursif(angka, N - 1);
        System.out.println("Total dari " + N + " angka (rekursif): " + hasilRekursif);

        // Hitung dan cetak total dengan iteratif
        int hasilIteratif = totalIteratif(angka);
        System.out.println("Total dari " + N + " angka (iteratif): " + hasilIteratif);
    }
}