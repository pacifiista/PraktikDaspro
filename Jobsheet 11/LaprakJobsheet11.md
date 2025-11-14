# Jobsheet 11 2D Array
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>
 <br>

 ### Soal Percobaan 1
 1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan! <br>
 2. Mengapa terdapat null pada daftar nama penonton? <br>
 3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut: <br>
 > penonton[0][0] = "Amin"; <br>
penonton[0][1] = "Bena"; <br>
penonton[1][0] = "Candra"; <br>
penonton[1][1] = "Dela"; <br>
penonton[2][0] = "Eka"; <br>
penonton[2][1] = "Farhan"; <br>
penonton[3][0] = "Gisel"; <br>
penonton[3][1] = "Hana"; <br>
4. Tambahkan kode program sebagai berikut: <br>
> System.out.println(penonton.length); <br>
System.out.println(penonton[0].length); <br>
System.out.println(penonton[1].length); <br>
System.out.println(penonton[2].length); <br>
System.out.println(penonton[3].length); <br>
Jelaskan fungsi dari penonton.length dan penonton[0].length! <br>
Apakah penonton[0].length, penonton[1].length,penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?<br>
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris
pada array menggunakan for loop. Compile, run, lalu amati hasilnya. <br>
>  System.out.println(penonton.length); <br>
for (int i = 0; i < penonton.length; i++) { <br>
System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length); <br>
} <br>
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya. <br>
> System.out.println(penonton.length); <br>
for (String[] barisPenonton : penonton) { <br>
System.out.println("Panjang baris: " + barisPenonton.length); <br>
} <br>
7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. <br> Compile, run, lalu amati hasilnya. <br>
> System.out.println("Penonton pada baris ke-3: ");  <br>
for (int i = 0; i < penonton[2].length; i++) {  <br>
System.out.println( penonton[2][i]);  <br>
}  <br>
8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya. <br>
> System.out.println("Penonton pada baris ke-3: "); <br>
for (String i : penonton[2]) { <br>
System.out.println(i); <br>
} <br>
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. <br> Compile dan run program kemudian amati hasilnya. <br>
> for (int i = 0; i < penonton.length; i++) { <br>
System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i] )); <br>
} <br>
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop? <br>
11. Berapa indeks baris maksimal untuk array penonton? <br>
12. Berapa indeks kolom maksimal untuk array penonton? <br>
13. Apa fungsi dari String.join()? <br>

### Jawaban
1. Tidak. Pengisian elemen array tidak wajib dilakukan secara berurutan. Kita bebas menentukan indeks mana yang ingin diisi terlebih dahulu, <br> selama indeks tersebut berada dalam rentang yang valid sesuai ukuran array, misalnya angka[5] = 7; pada array berukuran 5 akan menyebabkan ArrayIndexOutOfBoundsException. <br>
2. Nilai  pada daftar nama penonton biasanya muncul karena **elemen array belum diisi dengan data apa pun.** <br> Dalam konteks pemrograman, khususnya saat menggunakan array bertipe objek seperti  di Java, setiap elemen yang belum diinisialisasi secara eksplisit akan memiliki nilai default. <br>
3. Berikut ialah setelah ditambahkan daftar penonton: <br>
image
4.  - penonton.length menunjukkan jumlah baris dalam array dua dimensi penonton. Karena array dibuat dengan new String[4][2], maka penonton.length bernilai 4, artinya ada 4 baris. <br>
- penonton[0].length menunjukkan jumlah kolom pada baris pertama. Karena setiap baris memiliki 2 kolom, maka hasilnya adalah 2. <br>
**Apakah penonton[0].length, penonton[1].length,penonton[2].length, dan penonton[3].length memiliki nilai yang sama?** <br>
Ya, penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama, yaitu 2. <br>
5. Berikut ialah hasil modifikasi menggunakan For Loop: <br>
Dimana manghasilkan output seperti di gambar yang berartikan <br>
- Dalam perulangan for, mencetak panjang setiap baris menggunakan penonton[i].length, dan hasilnya adalah 2 untuk semua baris. <br> Ini menunjukkan bahwa setiap baris memiliki dua elemen, yaitu dua nama penonton. <br>
6. Berikut ialah hasil modifilasi program dengan menggunakan Foreach loop: <br>
Dimana menghasilkan output yang **sama** karena Struktur array yang tidak berubah, Perulangan foreach adalah cara yang lebih ringkas dan aman untuk menelusuri elemen array, terutama saat kamu tidak membutuhkan indeks. <br> Dalam kasus ini, baik for biasa maupun foreach menghasilkan output yang sama karena keduanya mengakses elemen yang sama dan mencetak <br>
7. Berikut ialah hasil modifikasi menggunakan For Loop: <br>
Dimana manghasilkan output penonton yang berada pada array baris 3 yaitu **Eka & Farhan** <br>
8.  Berikut ialah hasil modifikasi menggunakan Foreach Loop: <br>
Dimana manghasilkan output penonton yang berada pada array baris 3 yaitu **Eka & Farhan** <br> dimana menghasilkan output yang sama karena keduanya mengakses elemen yang sama dan mencetak <br>
9. Berikut ialah hasil modifikasi: <br>
Dimana menampilkan output semua daftar penonton pada array <br>
10. **Kelebihan dan kekurangan Foreach:** <br>
**Kelebihan:** <br>
- Lebih ringkas dan mudah dibaca 
- Aman dari kesalahan indeks
- Cocok untuk menelusuri semua elemen
**Kekurangan:** <br>
- Tidak bisa akses indeks langsung
- Tidak cocok untuk manipulasi berdasarkan posisi
- Kurang fleksibel untuk logika iterasi khusus <br>
11. Indeks baris maksimal untuk array penonton adalah 3. <br>
12. Indeks baris maksimal untuk array penonton adalah 1. <br>
13. Fungsi  di Java digunakan untuk menggabungkan elemen-elemen string menjadi satu string utuh, dengan <br> pemisah tertentu di antara elemen-elemennya. Seperti, Menyusun daftar nama, kata, atau data menjadi satu baris teks <br>

### Soal Percobaan 2 <br>
1. Apakah pengisian elemen array dari scanner harus <br> dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan! <br>
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
- Menu 1: Input data penonton
- Menu 2: Tampilkan daftar penonton
- Menu 3: Exit <br>
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia <br>
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh <br> penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali <br>
5. Pada menu 2, jika kursi kosong, ganti null dengan *** <br>

### Jawaban
1. Tidak, pengisian elemen array dari Scanner tidak harus dilakukan secara berurutan mulai dari indeks ke-0, <br> tapi jika tidak diisi dari indeks ke-0, kamu harus hati-hati terhadap nilai default (null, 0, dll). <br>
2. Berikut ialah hasil modifikasi: <br>
3. Berikut ialah hasil modifikasi: <br>
4. Berikut ialah hasil modifikasi: <br>
5. Berikut ialah hasil modifikasi: <br>

### Soal Percobaan 3 <br>
1. Tambahkan kode program sebagai berikut: <br>
> for (int i = 0; i < myNumbers.length; i++) { <br>
System.out.println(Arrays.toString(myNumbers[i])); <br>
} <br>
2. Apa fungsi dari Arrays.toString()? <br>
3. Apa nilai default untuk elemen pada array dengan tipe data int? <br>
4. Tambahkan kode program berikut: <br>
> for (int i = 0; i < myNumbers.length; i++) { <br>
System.out.println( "Panjang baris ke-" + (i+1) + ": " +myNumbers[i].length); <br>
} <br>
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. <br> Apakah panjang array dapat dimodifikasi setelah diinstansiasi? <br>

### Jawaban <br>
1. Berikut ialah hasil output program setelah ditambahkan kode: <br>
2. Arrays.toString() adalah alat bantu yang sangat praktis untuk melihat isi array secara langsung tanpa harus membuat perulangan manual. <br> Misalnya, jika kita memiliki array <br>
> String[] nama = {"Amin", "Bena", "Candra"}; <br>
maka System.out.println(Arrays.toString(nama)); <br>
akan menghasilkan output [Amin, Bena, Candra]. <br>
3. Nilai default untuk  adalah 0 <br>
4. Berikut ialah hasil output program setelah ditambahkan kode: <br>
5. Dalam Java, panjang array tidak dapat dimodifikasi setelah diinstansiasi. <br> Artinya, begitu sebuah array dibuat dengan ukuran tertentu, jumlah elemen di dalamnya bersifat tetap. <br>

### Soal Percobaan 4 <br>
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? <br> Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis. <br>

### Jawaban <br>
1. Berikut ialah hasil modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.<br>

### Tugas <br>
1. Implementasikan flowchart yang telah dibuat pada latihan Dasar Pemrograman (Teori) ke dalam kode program Java. <br>

### Jawaban <br>
1. Berikut ialah implementasi dari Flowchart tugas di ppt daspro Array 2d : <br>




