
import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldoInvestor, int lamaInvestasi){
        if (lamaInvestasi == 0) {
            return saldoInvestor;
        } else {
            return (1.11 * hitungLaba(saldoInvestor, lamaInvestasi - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInvestor;   
        int lamaInvestasi;

        System.out.print("Masukkan saldo awal investor: " );
        saldoInvestor = sc.nextDouble();
        System.out.print("Masukkan lama investasi (dalam tahun): " );
        lamaInvestasi = sc.nextInt();

        System.out.print("Jumlah saldo setelah investasi: " + lamaInvestasi + " tahun adalah " + hitungLaba(saldoInvestor, lamaInvestasi));
        System.out.print(hitungLaba(saldoInvestor, lamaInvestasi));
    }
}
