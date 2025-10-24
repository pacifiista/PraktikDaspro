# Jobsheet 7 Perulangan
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>

 ## Pertanyaan Percobaan 1 <br>
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
<br>
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
<br>
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
> if (nilai > tertinggi) {
>   tertinggi = nilai;
>   } if (nilai < terendah){
>   terendah = nilai;
>   }


## Jawab: <br>
1. Masing-masing komponen yang ada pada perulangan FOR pada program ke 1 ialah: 
- Inisialisasi → int i = 1
Bagian ini memberikan nilai awal pada variabel penghitung i.
Artinya, perulangan dimulai dari mahasiswa ke-1.
- Kondisi → i < 10
Perulangan akan terus berjalan selama nilai i kurang dari 10.
Jadi, program akan meminta input nilai mahasiswa ke-1 hingga ke-9 (total 9 mahasiswa).
- Increment → i++
Setelah satu kali perulangan selesai, nilai i akan bertambah 1.
Hal ini memastikan perulangan berjalan secara berurutan dari mahasiswa ke-1 sampai ke-9.
<br>

2. Alasan variabel tertinggi diinisialisasikan 0 dan terendah diinisialisasikan 100 ialah tertinggi = 0 → diasumsikan tidak ada nilai mahasiswa yang lebih kecil dari 0.
Dengan inisialisasi ini, ketika program membaca nilai pertama, otomatis nilai tersebut akan lebih besar dari 0 dan menggantikan nilai tertinggi. sedangkan terendah = 100 → diasumsikan tidak ada nilai yang melebihi 100.
Maka, nilai pertama yang dimasukkan pasti lebih kecil dari 100 dan akan menggantikan nilai terendah.
<br>

3. Penjelasan alur kerja kode
- Program menerima input nilai baru melalui variabel nilai.
**kondisi pertama:** <br>
> if (nilai > tertinggi)
Artinya: jika nilai yang baru dimasukkan lebih besar dari nilai tertinggi sebelumnya, maka nilai tertinggi tersebut diperbarui menjadi nilai yang baru:
> tertinggi = nilai;
Dengan cara ini, tertinggi akan selalu menyimpan nilai paling besar dari seluruh data yang sudah dimasukkan sejauh ini. 
<br>

**Kondisi kedua**
> if (nilai < terendah)
Artinya: jika nilai yang baru dimasukkan lebih kecil dari nilai terendah sebelumnya, maka nilai terendah tersebut diperbarui menjadi nilai yang baru:
> terendah = nilai;
Dengan cara ini, terendah akan selalu menyimpan nilai paling kecil dari semua data yang sudah dimasukkan.
<br>

## Pertanyaan percobaan 2 
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
> if (nilai < 0 || nilai > 100) {
>    System..out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!")
>   continue;
>  }
- nilai < 0 || nilai > 100
- continue
<br>

2.  Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE? <br>
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan? <br>

## Jawab:
1. **nilai < 0 || nilai > 100** ialah kondisi logika yang memeriksa apakah nilai yang dimasukkan tidak berada dalam rentang 0–100.
> nilai < 0 berarti nilai lebih kecil dari 0 
> (terlalu rendah / tidak masuk akal).

> nilai > 100 berarti nilai lebih besar dari 100 
> (terlalu tinggi / tidak mungkin).

> Tanda || (dibaca “or”) artinya salah satu dari dua
> kondisi itu benar, maka hasilnya akan bernilai
> benar (true).
- **continue** ialah perintah kontrol dalam perulangan yang digunakan untuk melewatkan sisa kode di dalam loop dan langsung melanjutkan ke iterasi berikutnya. Agar input yang tidak valid tidak diproses lebih lanjut, dan program langsung meminta input baru dari pengguna. <br>

2. Karena kita ingin agar perintah dalam perulangan dijalankan dulu untuk nilai i saat ini, baru kemudian variabel penghitung dinaikkan untuk iterasi berikutnya.
Dengan menulis i++ di akhir, program memastikan bahwa setiap data (misalnya setiap mahasiswa) diproses secara berurutan mulai dari yang pertama hingga terakhir. <br>

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, maka perulangan akan berjalan sebanyak 19 kali. Hal ini karena perulangan dimulai dari i = 1 dan akan terus berjalan selama kondisi i <= 19 bernilai benar. <br>

## Pertanyaan Percobaan 3:
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan? <br>
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut! <br>
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? <br>
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update? <br>

## Jawab:
1. Pada struktur do-while, perintah di dalam blok do { ... } selalu dijalankan minimal satu kali, meskipun kondisi di bagian while bernilai salah sejak awal.
Artinya, jika pada input pertama pengguna langsung mengetik “batal”, maka perulangan tetap dijalankan satu kali. Program akan menampilkan pesan “Transaksi dibatalkan.”
<img width="807" height="102" alt="Screenshot 2025-10-24 092348" src="https://github.com/user-attachments/assets/db87307a-4fc0-4237-9b78-f26aca5e36c1" />
<br>
3. Kondisi berhenti dalam program tersebut adalah ketika pengguna mengetikkan kata “batal” pada input nama pelanggan. Dikarekan adanya "break;" berfungsi untuk menghentikan perulangan secara paksa, meskipun kondisi while masih bernilai benar. <br>
4. Nilai true berarti kondisi selalu benar, sehingga perulangan do-while akan berjalan tanpa batas (infinite loop) selama tidak ada instruksi yang menghentikannya secara manual.
Namun, agar program tidak benar-benar berjalan tanpa akhir, digunakan perintah break sebagai pengontrol utama untuk keluar dari perulangan. <br>
5. Hal ini karena do-while bekerja berdasarkan logika kondisi yang diperiksa di bagian while, bukan dari penghitung angka seperti pada perulangan for.
Pada program tersebut, selama kondisi true tetap bernilai benar, perulangan akan terus dijalankan. Tidak adanya inisialisasi atau update tidak menjadi masalah, karena kontrol perulangan dilakukan melalui input pengguna (yakni mengetik “batal”), bukan dari variabel penghitung. <br>
