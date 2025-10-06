import java.util.Scanner;  
public class nestedLoop {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan baris: ");
    int baris = sc.nextInt();

    System.out.print("Masukkan jumlah kolom: ");
    int kolom = sc.nextInt();

    for(int i = 0 ; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}