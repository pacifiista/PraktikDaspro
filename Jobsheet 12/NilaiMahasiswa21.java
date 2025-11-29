import java.util.Scanner;

public class NilaiMahasiswa21 {
    // a. Fungsi isianArray
    public static void isianArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray
    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    // c. Fungsi hitTotalNilai
    public static int hitTotalNilai(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        int[] nilaiMahasiswa = new int[N];

        // Memanggil fungsi
        isianArray(nilaiMahasiswa, sc);
        tampilArray(nilaiMahasiswa);
        int totalNilai = hitTotalNilai(nilaiMahasiswa);
        System.out.println("\nTotal nilai semua mahasiswa: " + totalNilai);

        sc.close();
    }
}