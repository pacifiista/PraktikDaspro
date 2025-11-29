# Jobsheet 11 2D Array
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>
 <br>

 ### Pertanyaan Percobaan 1 <br>
1. Apakah fungsi tanpa parameter selalu harus bertipe void? <br>
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? <br> Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi! <br>
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main. <br>
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar). <br>

### Jawaban <br>
1. Tidak, Fungsi tanpa parameter tidak harus bertipe void. <br>
**Penjelasan**
- Parameter hanya menentukan apakah fungsi menerima input atau tidak. <br>
- Tipe kembalian (return type) menentukan apakah fungsi mengembalikan nilai atau tidak. <br>
- Jadi, sebuah fungsi bisa saja tanpa parameter tetapi tetap mengembalikan nilai. <br>
2. Daftar menu bisa ditampilkan tanpa menggunakan fungsi Menu(). Caranya adalah dengan langsung menuliskan perintah System.out.println(...) di dalam main <br>
> public class kafe21 { <br>
    public static void Menu() { // modifikasi fungsi dengan nama Menu <br>
        System.out.println("========== Kafe 21 Menu =========="); <br>
        System.out.println("1. Kopi Hitam - Rp 15,000"); <br>
        System.out.println("2. Capppuccino - Rp 20,000"); <br>
        System.out.println("3. Latte - Rp 22,000"); <br>
        System.out.println("4. Teh Tarik - Rp 12,000"); <br>
        System.out.println("5. Roti Bakar - Rp 10,000"); <br>
        System.out.println("6. Mie Goreng - Rp 18,000"); <br>
        System.out.println("==================================="); <br>
        System.out.println("Silakan pilih menu:"); <br>
    } <br>
} <br>

3. Menggunakan fungsi Menu() memiliki keuntungan besar dibandingkan menuliskan semua perintah langsung di dalam main. Dengan adanya fungsi khusus, kode menjadi lebih rapi dan terstruktur karena tugas menampilkan daftar menu dipisahkan dari alur utama program. Fungsi ini juga memudahkan pemanggilan ulang, sehingga jika menu perlu ditampilkan berkali-kali, programmer cukup memanggil Menu() tanpa harus menulis ulang baris perintah yang sama. <br> Selain itu, perubahan harga atau penambahan menu cukup dilakukan di satu tempat, yaitu di dalam fungsi, sehingga lebih mudah dipelihara dan mengurangi duplikasi kode. Singkatnya, fungsi Menu()membuat program lebih modular, mudah dibaca, dan efisien untuk dikembangkan. <br>
4. Alur eksekusi program ketika fungsi Menu() dipanggil dari main dapat dijelaskan singkat seperti ini: <br>
- Program dijalankan → eksekusi dimulai dari method main. <br>
- Pemanggilan fungsi Menu() → di dalam main, baris Menu(); dieksekusi. <br>
- Masuk ke fungsi Menu() → eksekusi berpindah ke definisi fungsi Menu(). <br>
- Perintah cetak dijalankan → setiap baris System.out.println(...) di dalam Menu() dijalankan secara berurutan. <br>
- Daftar menu tampil di layar → hasil cetakan berupa daftar menu kafe muncul di konsol. <br>
- Fungsi selesai → setelah semua baris selesai dicetak, eksekusi kembali ke main untuk melanjutkan instruksi berikutnya. <br>

### Pertanyaan percobaan 2 <br>
1. Apakah kegunaan parameter di dalam fungsi? <br>
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember? <br>
3. Apakah parameter sama dengan variabel? Jelaskan. <br>
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false? <br>
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember? <br>
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. <br> Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid. <br>
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar. <br>
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan <br> dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
Jelaskan alasan Anda. <br>

### Jawaban <br>
1. **Kegunaan Parameter dalam fungsi** <br>
- Parameter di dalam fungsi berguna sebagai wadah untuk menerima data dari luar fungsi (menerima input). <br>
- Membuat fungsi lebih umum dan reusable <br>
Dengan parameter, satu fungsi bisa digunakan untuk banyak kasus tanpa harus menulis ulang kode. <br>
- Mempermudah pengelolaan data <br>
Parameter menjadi cara untuk mengirim data ke fungsi tanpa harus menggunakan variabel global. <br>
- Meningkatkan modularitas program <br>
Fungsi dengan parameter bisa dipisahkan dari detail implementasi, sehingga program lebih terstruktur dan mudah dipelihara. <br>
2. Fungsi Menu() pada percobaan itu menggunakan parameter namaPelanggan dan isMember agar tampilan menu menjadi lebih dinamis dan personal, bukan sekadar daftar menu statis. <br>
- Dimana Parameter "namaPelanggan" Digunakan untuk menampilkan sapaan khusus kepada pelanggan  yang menggunakan aplikasi tanpa harus menulis ulang nama di dalam kode. <br>
- Parameter "isMember" - Digunakan untuk mengecek apakah pelanggan adalah member atau bukan, Jika "isMember == true" maka akan ditampilkan. <br>
3. Parameter dan variabel memang mirip, tapi tidak sama. Variabel adalah wadah umum untuk menyimpan data dalam program. <br> Parameter adalah variabel khusus yang dipakai sebagai **input fungsi** nilainya diberikan saat fungsi dipanggil dan hanya berlaku di dalam fungsi tersebut. Jadi, semua parameter adalah variabel, tetapi tidak semua variabel adalah parameter. <br>
4. Berdasarkan hasil pemeriksaan, fungsi akan menampilkan output yang berbeda. <br>
- Jika isMember = **true** <br>
Fungsi akan menampilkan pesan atau menu khusus untuk member, misalnya diskon, promo, atau akses tambahan. <br>
→ Output: "Selamat datang, Member! Anda mendapat diskon khusus." <br>
- Jika isMember = **false** <br>
Fungsi akan menampilkan menu standar tanpa fasilitas tambahan. <br>
→ Output: "Selamat datang, Pengunjung! Silakan lihat menu reguler." <br>
- Kesimpulan
Parameter isMember berfungsi sebagai penentu kondisi dalam fungsi Menu(). <br>
5. maka program akan error saat kompilasi. <br>
Pesan error biasanya berupa “method Menu in class … cannot be applied to given types”. <br> Artinya, Java tidak menemukan versi fungsi Menu() yang sesuai dengan pemanggilan tanpa parameter, karena definisi fungsi mengharuskan adanya namaPelanggan dan isMember. <br>
6. Berikut ialah modifikasi pada program: <br>
> public class kafe21Percobaan2 {
    public static void main(String namaPelanggan, boolean isMember, String kodePromo) { //fungsi paramenter percobaan 2
        System.out.println("Selamat datang di Kafe 21, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        } 

        // Soal Percobaan 2 No 6
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon tambahan 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon tambahan 30%.");
        } else  {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("========== Kafe 21 Menu ==========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capppuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===================================");
        System.out.println("Silakan pilih menu:");

    }
        }

7. Berikut ialah perintah pemanggilan fungsi: <br>
> kafe21Percobaan2.main("Budi", true, "DISKON30"); <br>
8. Penggunaan parameter "namaPelanggan" dan "isMember" membuat fungsi Menu() lebih mudah dibaca dan dikembangkan karena data tidak ditulis langsung di dalam fungsi. <br> Dengan parameter, fungsi menjadi fleksibel: bisa dipanggil untuk pelanggan berbeda tanpa mengubah isi kode, lebih jelas menunjukkan data apa yang dibutuhkan, serta memudahkan pemeliharaan dan penggunaan ulang. Tanpa parameter, kode akan kaku dan sulit diperluas. <br>

### Pertanyaan Percobaan 3 <br>
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. <br> Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus. <br>
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. <br> Jelaskan arti masing-masing
parameter dalam konteks program kafe. <br>
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", <br> maka
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga. <br>
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. <br> Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis
menu)? <br>

### Jawaban <br>
1. Fungsi membutuhkan nilai kembalian (return value) ketika hasil dari proses di dalam fungsi **masih diperlukan untuk digunakan kembali oleh program.** Sebaliknya, <br> fungsi tidak perlu mengembalikan nilai jika hanya menjalankan perintah tertentu **tanpa ada hasil yang harus dipakai lagi.** <br>
2. Dua Parameter yang digunakan ialah "int pilihanMenu" dan "int jumlahPesanan" : <br>
- "int pilihanMenu" : Digunakan untuk mengambil harga dari daftar menu sesuai pilihan. <br>
- "int jumlahPesanan" : Digunakan untuk mengalikan harga satuan dengan jumlah pesanan agar diperoleh total harga. <br>
3. Berikut ialah hasil modifikasi program percobaan 3 pada no **3 & 4**: <br>
> import java.util.Scanner;
> public class kafe21Percobaan3 {
> public static void main(String namaPelanggan, boolean isMember) { //fungsi paramenter percobaan 2
>        System.out.println("Selamat datang di Kafe 21, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        } 

        System.out.println("========== Kafe 21 Menu ==========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capppuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===================================");
        System.out.println("Silakan pilih menu:");


    }

    public static int hitungTotalHarga21(int pilihanMenu, int banyakItem, String kodePromo) { //percobaan 3
        int [] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 0 || pilihanMenu > hargaMenu.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }
        int totalHarga = hargaMenu[pilihanMenu - 1] * banyakItem;

        // Soal Percobaan 3 No 3: Logika Diskon Kode Promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            totalHarga = (int)(totalHarga * 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            totalHarga = (int)(totalHarga * 0.7);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid, tidak ada potongan harga.");
        }

        return totalHarga;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextInt(); // consume newline
        System.out.print("Masukkan kode promo (jika ada, kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();
        
        // Memanggil fungsi untuk menampilkan sambutan dan menu
        kafe21Percobaan3.main(namaPelanggan, isMember);
        int totalKeseluruhan = 0;
        boolean lanjut = true;

        // Loop untuk pemesanan berulang
        while (lanjut) {
            System.out.print("Pilih nomor menu yang ingin dipesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan banyak item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); // consume newline

            int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }
        System.out.println("Total keseluruhan harga pesanan Anda: Rp " + totalKeseluruhan); 
    }
}
}

### Pertanyaan Percobaan 4 <br>
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung! <br>
2. Modifikasi method daftarPengunjung menggunakan for-each loop. <br>
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya! <br>
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. <br> Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan? <br>

### Jawaban <br>
1. Penulisan parameter dengan String...namaPengunjung pada praktikum 4 digunakan karena program ingin menerima jumlah argumen yang tidak tetap (variabel). <br> 
- String... disebut varargs (variable arguments) dalam Java. <br>
Dengan varargs, kita bisa memanggil fungsi daftarPengunjung() dengan satu nama, dua nama, atau banyak nama sekaligus, tanpa harus mendefinisikan parameter berulang seperti String nama1, String nama2, String nama3. <br>
2. Berikut ialah modifikasi program: <br>
> public class PengunjungCafe21 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama Pengunjung: ");
        // menggunakan for-each loop untuk menampilkan nama pengunjung modified
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

3. Tidak, di Java tidak bisa menggunakan dua tipe data varargs (...) dalam satu fungsi. <br> 
- Varargs (...) adalah cara untuk menerima jumlah argumen yang tidak tetap dalam bentuk array. <br>
- Aturan Java: hanya boleh ada satu parameter varargs dalam sebuah metode, dan varargs tersebut **harus diletakkan di parameter terakhir** <br>
- Jika kita mencoba menulis dua varargs, misalnya void contoh(String... nama, int... angka), maka akan muncul error kompilasi karena Java tidak bisa menentukan bagaimana cara memisahkan argumen ke masing-masing varargs. <br>
4. Pemanggilan tanpa argumen tetap valid, program berjalan, tetapi daftar nama pengunjung akan kosong. <br>

### Pertanyaan Percobaan 5 <br>
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok! <br>
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. <br> Jelaskan secara singkat alur jalannya program sampai output tersebut muncul. <br>
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut! <br>
> public class programku21 {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }

    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = Jumlah (1, 1);
        TampilJumlah(temp, 5);
    }
}

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan! <br>
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5. <br>
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume. <br>

### Jawaban <br>
1. Tahapan eksekusi **program Percobaan 5 (HitungBalok21)** secara singkat dan jelas:  <br>
#### Tahapan Eksekusi Program <br>
a.  **Program dijalankan** → Eksekusi dimulai dari `main(String[] args)` pada kelas `HitungBalok21`.  <br>
b. **Scanner dibuat** → Program menyiapkan objek `Scanner input` untuk membaca data dari pengguna.  <br>
c. **Input data** → Program meminta pengguna memasukkan: <br>
   - Panjang (`p`)  <br>
   - Lebar (`l`)  <br>
   - Tinggi (`t`)  <br>
   Nilai ini dibaca dari keyboard.  <br>
d. **Memanggil fungsi `hitungLuas(p, l)`**  <br>
   - Fungsi menerima parameter panjang dan lebar.  <br>
   - Menghitung `Luas = p * l`.  <br>
   - Mengembalikan nilai luas ke variabel `L`.  <br>
   - Output ditampilkan: *"Luas Persegi Panjang adalah …"*.  <br>
e. **Memanggil fungsi `hitungVolume(t, p, l)`**  <br>
   - Fungsi menerima parameter tinggi, panjang, dan lebar.  <br>
   - Di dalamnya, fungsi `hitungLuas(a, b)` dipanggil lagi untuk menghitung luas alas.  <br>
   - Volume dihitung dengan rumus `volume = luas * tinggi`.  <br>
   - Nilai volume dikembalikan ke variabel `vol`.  <br>
   - Output ditampilkan: *"Volume Balok adalah …"*.  <br>
f. **Program selesai** → Scanner ditutup, eksekusi berakhir. <br>  
####  Urutan Output <br>
Program menampilkan prompt untuk input panjang, lebar, tinggi. Setelah input diberikan, program menampilkan:  <br>
   - **Luas Persegi Panjang adalah [hasil]**  <br>
   - **Volume Balok adalah [hasil]**  <br>
<br>

2. Alur singkat program: <br>
a. Input dibaca: pengguna memasukkan panjang (4), lebar (3), dan tinggi (5). <br>
b. Fungsi hitungLuas(p, l) dipanggil <br>
- Rumus: Luas = p * l <br>
- Hasil: 4 * 3 = 12 <br>
- Output: Luas Persegi Panjang adalah 12 <br>
c. Fungsi hitungVolume(t, p, l) dipanggil <br>
- Di dalamnya, hitungLuas(p, l) dipanggil lagi → hasilnya 12. <br>
- Rumus: Volume = Luas * tinggi <br>
- Hasil: 12 * 5 = 60 <br>
- Output: Volume Balok adalah 60 <br>

3. Output dari program yaitu : "1234567" <br>
4. Fungsi perlu **parameter** jika butuh data dari luar (misalnya panjang, lebar, tinggi untuk perhitungan). Jika tidak butuh input tambahan, fungsi bisa tanpa parameter. <br> Fungsi perlu **nilai kembalian** jika hasilnya dipakai lagi (misalnya total harga atau volume balok). Jika hanya menampilkan informasi tanpa hasil yang digunakan, cukup `void` tanpa nilai kembalian. <br>
5. Fungsi sebaiknya menggunakan **parameter** ketika perhitungannya membutuhkan data dari luar agar bisa fleksibel. Pada Percobaan 5, fungsi `hitungLuas(int pjg, int lb)` menggunakan parameter karena nilai panjang dan lebar tidak ditentukan di dalam fungsi, melainkan harus diberikan saat fungsi dipanggil. Dengan begitu, fungsi bisa menghitung luas untuk berbagai ukuran persegi panjang tanpa mengubah isi kode. <br>

Sebaliknya, fungsi boleh **tanpa parameter** jika tugasnya hanya menampilkan informasi tetap atau menjalankan aksi yang tidak bergantung pada input luar. Misalnya, jika ada fungsi `tampilMenu()` yang hanya mencetak daftar menu kafe, ia tidak perlu parameter karena data sudah ditentukan di dalam fungsi.  <br>

Untuk nilai kembalian, `hitungVolume(int tinggi, int a, int b)` juga memakai parameter karena butuh panjang, lebar, dan tinggi dari luar, lalu mengembalikan hasil perhitungan volume agar bisa dipakai lagi. Jadi, parameter dipakai saat fungsi butuh **input variabel**, sedangkan tanpa parameter dipakai saat fungsi cukup bekerja dengan **data tetap**. <br>
6. Fungsi sebaiknya memiliki **nilai kembalian (return value)** jika hasil dari proses di dalamnya masih akan digunakan kembali oleh program. Contohnya pada Percobaan 5:  <br>
- `hitungLuas(int pjg, int lb)` → mengembalikan nilai luas persegi panjang. Nilai ini dipakai lagi untuk ditampilkan atau digunakan dalam perhitungan volume.  <br>
- `hitungVolume(int tinggi, int a, int b)` → mengembalikan nilai volume balok. Nilai ini juga dipakai lagi untuk ditampilkan ke pengguna.  
Sebaliknya, fungsi **tidak perlu memiliki nilai kembalian** jika hanya menjalankan aksi tanpa ada hasil yang harus dipakai lagi.<br>
Misalnya:  <br>
- `main(String[] args)` → tidak mengembalikan nilai karena hanya mengatur alur program, menerima input, memanggil fungsi lain, dan menampilkan hasil ke layar.  <br>
→ Jadi, fungsi dengan return value dipakai untuk **menghasilkan output yang akan digunakan kembali**, sedangkan fungsi tanpa return value (`void`) dipakai untuk **aksi langsung** seperti menampilkan teks atau mengatur jalannya program.


































