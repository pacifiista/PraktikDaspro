import java.util.Scanner;
public class contohArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String [] nama = new String[5];

        for (int i = 0; i < nama.length; i++){
            System.out.println("masukkan nama teman ke : " + (i+1));
            nama[i]= sc.nextLine();
        }
        System.out.println("/nDafar nama: ");
        for (int i= 0; i < nama.length; i++){
            System.out.println("nama ke- " + (i+1) + nama[i]);

            for (String n : nama) { //fori
                System.out.println(n);
            }
                
            }
        }
    }
}