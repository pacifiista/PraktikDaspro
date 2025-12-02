# Jobsheet 14 Fungsi 2
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>

 ### Pertanyaan Percobaan 1 <br>
1. Apa yang dimaksud dengan fungsi rekursif? <br>
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi <br> faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif! <br>

### Jawaban <br>
1. Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri untuk menyelesaikan masalah yang lebih kecil hingga mencapai kondisi dasar (base case). <br>
2. Hasil dari yang diberikan fungsi FaktorialRekursif dan fungsi FaktorialIteratif ialah sama namun yang membedakan ialah cara kerjanya yaitu: <br>
- fungsi FaktorialRekursif <br>
Fungsi memanggil dirinya sendiri dengan nilai parameter yang lebih kecil (n-1) sampai mencapai base case (n == 0). <br>
Menggunakan pemanggilan fungsi berulang. <br>

- fungsi FaktorialIteratif 
Menggunakan loop `for` untuk mengalikan angka dari 1 sampai n <br>

### Pertanyaan Percobaan 2 <br>
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, <br> kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan! <br>
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. <br>
Contoh: <br>
hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32 <br>

### Jawaban <br>
1. Pada *Percobaan2*, pemanggilan fungsi rekursif `hitungPangkat(x, y)` akan terus dijalankan selama nilai pangkat (`y`) belum mencapai **0**. <br> Saat `y == 0`, fungsi berhenti (base case) dan mengembalikan nilai `1`, lalu hasil dikembalikan ke pemanggilan sebelumnya hingga menghasilkan nilai akhir. <br>
2. Berikut ialah hasil modifikasi program: <br>

### Pertanyaan Percobaan 3 <br>
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”! <br>
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3) <br>

### Jawaban <br>
1. Pada Percobaan 3 yang merupakan `Base Case` dan `Recursion Call` ialah <br>
- `Base Case`: <br>
`if (lamaInvestasi == 0) { return saldoInvestor; }` <br>
→ Kondisi berhenti, ketika lama investasi sudah 0 maka fungsi tidak lagi memanggil dirinya sendiri. <br>
- `Recursion Call`: <br>
`return (1.11 * hitungLaba(saldoInvestor, lamaInvestasi - 1));` <br>
→ Fungsi memanggil dirinya sendiri dengan `lamaInvestasi - 1`. <br>

2. Fase Ekspansi (pemanggilan berulang) <br>
- hitungLaba(100000, 3) <br>
= 1.11 × hitungLaba(100000, 2) <br>
- hitungLaba(100000, 2) <br>
= 1.11 × hitungLaba(100000, 1) <br>
- hitungLaba(100000, 1) <br>
= 1.11 × hitungLaba(100000, 0) <br>
- hitungLaba(100000, 0) <br>
= 100000 (base case) <br>

Fase Substitusi (pengembalian nilai) <br>
- hitungLaba(100000, 0) = 100000 <br>
- hitungLaba(100000, 1) = 1.11 × 100000 = 111000 <br>
- hitungLaba(100000, 2) = 1.11 × 111000 = 123210 <br>
- hitungLaba(100000, 3) = 1.11 × 123210 = 136,731 <br>

Ringkasan <br>
- Base Case: lamaInvestasi == 0 → return saldoInvestor <br>
- Recursion Call: return 1.11 * hitungLaba(saldoInvestor, lamaInvestasi - 1) <br>

- Trace hasil: <br>
hitungLaba(100000, 3) <br>
= 1.11 × (1.11 × (1.11 × 100000)) <br>
= 136,731 <br>

### Tugas <br>
1. Buatlah program yang mengimplementasikan fungsi rekursif dan fungsi iteratif untuk menghitung dan mencetak total nilai, dengan input N → 1 + 2 + 3 + 4 + 5 + … + … + N. Contoh: <br>

### Jawaban <br>
1. Berikut ialah hasil program: <br>







