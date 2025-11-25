
import java.util.Scanner;

public class HitungBalok21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = sc.nextInt();

        System.out.print("Masukkan lebar balok: ");
        l = sc.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        t = sc.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah: " + L);

        vol = p * l * t;
        System.out.println("Volume balok adalah: " + vol);
    }
    static int hitungLuas21(int pjg, int lb) {
        int L = pjg * lb;
        return L;
    }
    static int hitungVolume21(int tinggi, int a, int b) {
        int Volume= hitungLuas21(a, b) * tinggi;
        return Volume;
    }
   
    

}
