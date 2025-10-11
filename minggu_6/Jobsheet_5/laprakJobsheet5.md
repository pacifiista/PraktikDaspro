# Laporan Praktikum Jobsheet 5 Pemilihan
<h1> Nama   : Naura Fadhilla Aditya Putri </h1>
<h3> Nim    : 254107020007 </h3>
<h3> Kelas  : TI-1C </h3>

**Percobaan 1: Penerapan IF dan IF-ELSE untuk mencetak KRS** <br>
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
Jawab: Pengecekan di dalam struktur if tidak melibatkan operator relasional (seperti >, <, ==, !=) karena variabel yang diperiksa sudah bertipe boolean (misalnya, sudahBayarUKT bernilai true atau false).
<br> 
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
Jawab:Program akan melompati blok if dan melanjutkan ke baris kode berikutnya (jika ada). Output program hanya akan menampilkan teks di luar blok if atau tidak menampilkan apa-apa jika tidak ada kode lain.
<br> 
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka
terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi
program tersebut dengan menambahkan struktur ELSE!
Jawab:
<img width="1920" height="1080" alt="Screenshot (52)" src="https://github.com/user-attachments/assets/c10bd539-a8e4-4759-b4dd-f7974cc327ec" />

<br>

**Percobaan 2: SWITCH-CASE untuk mencetak KRS** <br>
1. Apa fungsi dari sintaks break? 
Jawab:Fungsi dari sintaks break dalam struktur SWITCH-CASE adalah untuk menghentikan eksekusi di dalam blok switch dan keluar dari struktur tersebut.
Tanpa break di akhir setiap blok case, program akan terus mengeksekusi kode di case berikutnya, bahkan jika kondisinya tidak cocok. Fenomena ini disebut fall-through. Sintaks break memastikan bahwa hanya blok kode yang sesuai dengan case yang benar-benar dieksekusi.
<br> 
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
Jawab: Peran dari sintaks default pada struktur SWITCH-CASE adalah untuk menyediakan blok kode cadangan yang akan dieksekusi apabila tidak ada satu pun nilai case yang cocok dengan ekspresi yang dievaluasi.
<br> 
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil
transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah
dibuat ke dalam bentuk IF-ELSE IF-ELSE
Jawab: <img width="1920" height="1080" alt="Screenshot (55)" src="https://github.com/user-attachments/assets/5427f847-289f-40f0-b0a2-315d976827f7" />
<br> 
**Percobaan 3: NESTED IF untuk Mengecek Syarat Ujian Skripsi** <br>
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
Jawab: karena jawaban "No" 
enyebabkan kondisi ini bernilai FALSE. Selain itu, syarat utama (bebas kompen) tidak terpenuhi, program tidak akan pernah mengecek kondisi di level kedua (jumlah bimbingan).
<br> 
2. jelaskan ptongan kode berikut! <br> if(bimbinganP1 >= 8 && bimbinganP2 >= 4) 
Jawab: Potongan kode if(bimbinganP1 >= 8 && bimbinganP2 >= 4) berfungsi sebagai pengecekan dua syarat sekaligus untuk melanjutkan proses pendaftaran ujian skripsi.

Inti Logika:
bimbinganP1 >= 8: Memeriksa apakah jumlah log bimbingan dengan Pembimbing 1 sudah minimal 8 kali atau lebih.

bimbinganP2 >= 4: Memeriksa apakah jumlah log bimbingan dengan Pembimbing 2 sudah minimal 4 kali atau lebih.

&& (AND Logika): Operator ini mengharuskan kedua syarat di atas terpenuhi (TRUE) agar mahasiswa dapat lolos pengecekan ini.

Kesimpulan: Mahasiswa hanya akan memenuhi syarat jika kedua jumlah bimbingan (P1 ≥8 dan P2 ≥4) sudah terpenuhi.
<br> 
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
Jawab: Tahap 1: Pengecekan Syarat Utama (Bebas Kompen)
Program memulai dengan mengecek jawaban mahasiswa pada pertanyaan "Apakah Anda bebas kompen?".

Kondisi A: Kompen Lolos
Jika Mahasiswa Menjawab "Yes":
Kondisi if (bebasKompen.equalsIgnoreCase("Yes")) bernilai TRUE.
Alur Berlanjut: Program pindah ke Tahap 2 (Pengecekan Log Bimbingan).

Kondisi B: Kompen Gagal
Jika Mahasiswa Menjawab "No":
Kondisi if (bebasKompen.equalsIgnoreCase("Yes")) bernilai FALSE.
Alur Selesai: Program langsung melompat ke blok ELSE level 1.
Hasil: Sistem menampilkan pesan Penolakan yang berkaitan dengan Kompen.

Tahap 2: Pengecekan Syarat Kedua (Log Bimbingan)
Tahap ini hanya dieksekusi jika Kompen Lolos (Kondisi A). Program menggunakan Nested-IF untuk mengecek jumlah log bimbingan P1 dan P2.

Kondisi C: Bimbingan Lolos
Jika bimbinganP1 >= 8 DAN bimbinganP2 >= 4:
Kondisi Nested-IF if (bimbinganP1 >= 8 && bimbinganP2 >= 4) bernilai TRUE.
Alur Selesai: Program menjalankan blok kode Nested-IF.
Hasil: Sistem menampilkan pesan Penerimaan. Mahasiswa dapat melanjutkan pendaftaran.

Kondisi D: Bimbingan Gagal
Jika salah satu atau kedua syarat log bimbingan TIDAK TERPENUHI (misalnya P1 = 7 atau P2 = 3):
Kondisi Nested-IF bernilai FALSE.
Alur Selesai: Program melompat ke blok ELSE dari Nested-IF (level 2).

