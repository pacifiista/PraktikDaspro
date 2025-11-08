# Jobsheet 9 Array
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>
 <br>

 ### Soal Percobaan 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.  Apa yang terjadi? Mengapa bisa demikian? <br>
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaliguspada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut<br>
> for (int i =0; i < 4; i++>) {
    System.out.println(bil[i]);
} <br>
Apa keluaran dari program? Jelaskan maksud dari statement tersebut. <br>
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian? <br>

### Jawaban
1. Yang terjadi setelah mengubah elemen array bilangan diubah dengan angka tersebut pada soal ialah mengalami eror, karena tipe data double sedangkan yang dideklarasikan bertipe data integer.<br>
2. Berikut hasil modifikasi deklarasi array <br>
3. Setelah mengubah statement pada langkah 4, menghasilkan output yang sama seperti soal yaitu 3,13,-7, dan 17 dikarenakan "i < 4" yang beratikan i kurang dari indeks 4. Dimana kita mendeklarasikan "int [] bilangan = new int[4];" (indeks 0,1,2,3). <br>
4. Yang terdapat pada output program setelah mengubah statement menjadi "i <= 4" ialah "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4" yang berarti - Tapi program mencoba mengakses bilangan[4], yang tidak ada karena indeks 4 sudah di luar batas. <br>

### Soal Percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: <br>
> for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-" + i + " : ");
    nilaiAkhir[i] =sc.nextInt();
} <br>
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?<br>
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ? <br>
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): <br>
>  for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] >  70) {
            System.out.println("Mahasiswa ke-" + i + "lulus!");
        }
} <br>
Jalankan program dan jelaskan alur program!
<br>

### Jawaban
1. Adanya perubahan pada kode "10" yang diubah menjadi "nilaiAkhir.length" dimana saat program dijalankan hasilnya tetap sama yaitu menginput banyak nya nilai akhir. Namun yang membedakan ialah "nilaiAkhir.length" Menyesuaikan jumlah iterasi dengan panjang array yang sebenarnya. Sedangkan "10" angka tetap sehingga Memaksa iterasi sebanyak 10 kali, terlepas dari ukuran array. <br>
2. Yang dimaksud "i > nilaiAkhir.length" ialah Menyesuaikan jumlah iterasi dengan panjang array yang sebenarnya. Jika ukuran array berubah, loop tetap bekerja dengan benar.<br>
3. Berikut ialah hasil modifikasi program: <br>

### Soal Percobaan 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70). <br>
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini: <br>
> Masukkan jumlah mahasiswa : 5
Masukkan nilai mahasiswa ke-1 : 80
Masukkan nilai mahasiswa ke-2 : 60
Masukkan nilai mahasiswa ke-3 : 90
Masukkan nilai mahasiswa ke-4 : 85
Masukkan nilai mahasiswa ke-5 : 65
Rata-rata nilai lulus  = 85.0
>Rata =-rata nilai tidak lulus = 62.5
<br>

### Jawaban
1. Berikut ialah hasil modifikasi pada program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70): <br>
2. Berikut ialah hasil modifikasi pada program sehingga program menerima jumlah elemen berdasarkan input dari pengguna : <br>

### Soal Percobaan 4
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
atas. <br>
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:<br>
> Masukkan banyaknya nilai yang akan diinput : 6
Masukkan nilai mahasiswa ke-1 : 80
Masukkan nilai mahasiswa ke-2 : 60
Masukkan nilai mahasiswa ke-3 : 75
Masukkan nilai mahasiswa ke-4 : 83
Masukkan nilai mahasiswa ke-5 : 78
Masukkan nilai mahasiswa ke-6 : 92
Masukkan nilai yang ingin dicari : 78

Nilai 78 ketemu, merupakan nilau mahasiswa ke-5 <br>

3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan
"Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut: <br>
> Masukkan banyaknya nilai yang akan diinput : 6
Masukkan nilai mahasiswa ke-1 : 80
Masukkan nilai mahasiswa ke-2 : 60
Masukkan nilai mahasiswa ke-3 : 75
Masukkan nilai mahasiswa ke-4 : 83
Masukkan nilai mahasiswa ke-5 : 78
Masukkan nilai mahasiswa ke-6 : 92
Masukkan nilai yang ingin dicari : 78

Nilai yang dicari tidak ditemukan <br>

### Jawaban
1. Statement break; pada baris ke-10 dalam kode program percobaan 4 berfungsi untuk menghentikan perulangan for secara paksa saat kondisi tertentu terpenuhi.
2. Berikut ialah hasil modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari: <br>
3. Berikut ialah hasil modifikasi  program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array: <br>
