public class loop_for {
   
    public static void main(String[] args) {

        for (int i = 1; i <=20; i++ ){ //buat yang uda tau pasti limitnya
            if (i%2==0 ) { // pake modulus untuk seleksi angka genap karena angka genap selalu 0 habis dibagi
                System.out.println(i);
            }
        }
    }
}