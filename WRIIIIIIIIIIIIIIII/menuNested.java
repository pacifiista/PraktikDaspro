import java.util.Scanner;
public class menuNested {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String [] menu = {"kopi", "teh", "roti"};

        for (int i = 0; i < 3 ; i++) {
            System.out.print("\nMasukkan nama pelanggan: ");
            String pelanggan = sc.nextLine();

            int totalPesanan = 0;
            System.out.println("Pesanan untuk " + pelanggan + ":");
            for (int j = 0; j < menu.length; j++) {
                System.out.print("jumlah " + menu[j] + " : ");
                int jumlah = sc.nextInt();
                totalPesanan += jumlah;
            }
            System.out.println("TOtal pesanan " + pelanggan+ ": " +totalPesanan + "item\n");
            sc.nextLine();

        }
        
        sc.close();
       
        }
    }
