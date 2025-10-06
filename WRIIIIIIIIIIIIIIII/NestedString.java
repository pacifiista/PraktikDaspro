import java.util.Scanner;
public class NestedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan nama tim: ");
            String namaTim = sc.nextLine();
            System.out.print("Masukkan nama anggota: ");
            for (int j = 0; j < 2; j++) {
                System.out.print((j+1) + ".");
                String namaAggota = sc.nextLine();
            }
            
        }
    }
}