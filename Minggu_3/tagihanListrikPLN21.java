import java.util.Scanner;
public class tagihanListrikPLN21 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        //Deklarasi
        int biayaTetap=50000, tarifListrikPerKWH=1500, dayaKwh, totalListrik;
        double ppn= 0.10, totalPPN, totalBiaya;

        //input
        System.out.print("Masukkan besarnya daya dalam KWH:");
        dayaKwh = sc.nextInt();

        //Proses
        totalListrik= biayaTetap+(dayaKwh*tarifListrikPerKWH);
        totalPPN= totalListrik*ppn;
        totalBiaya=totalListrik+totalPPN;

        //Output
        System.out.print("Total biaya yang harus dikeluarkan ialah: Rp. " + totalBiaya);
    }
}