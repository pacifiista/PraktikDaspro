import java.util.Scanner;
public class password1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Password anda: ");
        String password = "abcd"; 

        do {
            String passwordInput = sc.nextLine();
            if (passwordInput.equals("abcd")) {
                System.out.println("Anda berhasil login!");
                break; // buat perulangannya berhenti

            }
        } while (true);
    }
}