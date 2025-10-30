# Jobsheet 8 Perulangan 2
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>

<br>

### Pertanyaan Percobaan 1
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian? <br>
2. Jika pada perulangan for, kondisi i<=n diubah menjadi i < n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda?<br>
3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian? <br>
4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian? <br>
5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut? <br>

### Jawaban
1. Akibat dari perubahan inisialisasi **i=1 (mulai dari langkah ke-1) menjadi i=0 (mulai dari langkah ke-0)** yaitu Hitungan akan dimulai dari angka nol. Ini berarti total langkah yang diambil bertambah satu (misalnya, dari 1 sampai 5 ada 5 langkah; dari 0 sampai 4 juga 5 langkah, tetapi nilainya berbeda). Karena, Dalam pemrograman, banyak hal (seperti daftar atau array) dimulai dari nol (indeks 0). Mengubahnya menjadi i=0 membuat perulangan selaras dengan cara komputer menghitung, yaitu dari nol. <br>
2. Akibat dari perubahan inisialisasi **i<=n (Berhenti setelah mencapai n) menjadi i < n (berhenti sebelum mencapai n)** yaitu Perulangan akan berhenti satu langkah lebih awal. Nilai n itu sendiri tidak ikut diproses yang membedakan ialah adanya tanda "=". <br>
3. Akibat dari kondisi **i < n menjadi i > n** yaitu Perulangan tidak akan berjalan sama sekali (nol iterasi), kecuali jika nilai awal i(inisialisasi) sudah lebih besar dari n. Karena, Asumsikan perulangan dimulai dengan i yang lebih kecil dari n, misalnya i=1 dan n=5.Kondisi Awal (Mengecek i > n): Ketika i=1, kondisi 1 > 5 adalah SALAH. Aturan Perulangan ialah Perulangan for akan langsung berhenti atau tidak akan pernah dimulai jika kondisi di awal sudah salah. <br>
4. Akibat dari perubahan kondisi **i++ (Lompatan bertambah 1) menjadi i--(Lommpatan berkurang 1)** yaitu Perulangan akan TIDAK PERNAH BERHENTI (Infinite Loop) jika kondisi awal dan mulai (misalnya i=1, kondisi i <= n dengan n positif) tidak diubah. Karena engan i--, kita bergerak MENJAUHI batas berhenti (menjadi 0, -1, -2, dst.). Karena nilai akan terus mengecil dan tidak akan pernah melewati batas atas n, kondisi untuk berhenti tidak akan pernah terpenuhi. <br>
<img width="864" height="903" alt="Screenshot 2025-10-28 110749" src="https://github.com/user-attachments/assets/8c747b91-8847-41ec-8e7f-80bb6fadb85d" />

5. Akibat dari perubahan kondisi **i++ (Lompatan bertambah 1) menjadi i+=2 (Lompatan bertambah 2)** yaitu Ketika langkah (step) diubah dari i++ menjadi i += 2, kita mengubah aturan pergerakan perulangan. Instruksi i += 2 berarti "tambahkan 2 pada nilai i setelah setiap putaran."Jika kita menjalankan perulangan ini dengan batas akhir n=6 (dengan asumsi inisialisasi awal adalah i=1), maka pola output yang dihasilkan adalah 1, 3, 5. <br>
<img width="906" height="703" alt="Screenshot 2025-10-28 110728" src="https://github.com/user-attachments/assets/cdedeb64-c54f-4384-a08c-c4eaa9095022" />


### Pertanyaan Percobaan 2
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian? <br>
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian? <br>
3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya? <br>
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah
perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan? <br>


### Jawaban
1. Jika pada perulangan luar (yang biasanya mengurus baris), inisialisasi diubah dari **iOuter=1 menjadi iOuter=0**, akibatnya adalah perulangan tersebut akan memulai hitungan dari nol. Karena,  Perubahan ini menyebabkan iterasi (putaran) pertama yang dieksekusi adalah untuk nilai iOuter=0, bukan iOuter=1 (misalnya, dari 1 sampai 5 ada 5 putaran; dari 0 sampai 5 ada 6 putaran). Dalam konteks pencetakan pola, ini berarti akan ada satu baris tambahan yang dihasilkan, yaitu baris ke-0. <br>
<img width="926" height="815" alt="Screenshot 2025-10-28 112036" src="https://github.com/user-attachments/assets/a1aa49e1-9565-408d-884f-88f2a097100a" />

2. Jika inisialisasi diubah dari **i=1 menjadi i=0**, akibatnya adalah perulangan dalam akan selalu memulai dari nol untuk setiap putaran perulangan luar. perubahan ini menyebabkan perulangan dalam memiliki satu putaran tambahan (mulai dari i=0). <br>
<img width="949" height="965" alt="Screenshot 2025-10-28 112131" src="https://github.com/user-attachments/assets/40365d4a-3aec-4639-a01b-249a29bd89a2" />

3. **Perbedaan Perulangan luar & dalam**: <br>
- Perulangan Luar (Outer Loop) - Pengatur Baris: Tugas utamanya adalah mengatur berapa kali seluruh proses (termasuk perulangan dalam) harus diulang, yang secara visual berarti mengatur jumlah baris yang akan dihasilkan. Setiap satu putaran perulangan luar selesai, kita pindah ke baris baru.<br>
- Perulangan Dalam (Inner Loop) - Pengatur Kolom: Tugas utamanya adalah menentukan apa yang terjadi di dalam satu baris. Ia mengatur jumlah karakter atau elemen yang dicetak secara horizontal sebelum berganti baris. Perulangan dalam akan selesai seluruhnya baru kemudian perulangan luar melanjutkan putaran berikutnya. <br>
4. Fungsi sintaks "System.out.println();" di perulangan dalam yaitu perintah untuk pindah baris. Perintah ini memberitahu program untuk mengakhiri baris yang sedang dicetak oleh perulangan dalam dan memindahkan kursor pencetakan ke awal baris baru (melakukan line break). Jika Sintaks "System.out.println();" dihilangkan maka semua hasil percetakan akan menyatu dalam satu baris panjang. <br>

### Pertanyaan Percobaan 3
1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut? <br>
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. <br>

### Jawaban 
1. Output yang dihasilkan dari nilai n = 5 sudah sesuai dengan tampilan seperti di soal. <br>
2. Tidak ada perbaikan dalam program tersebut dikarenakan sudah sesuai dengan tampilan yang diinginkan. <br>

### Pertanyaan percobaan 4
1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar. <br>
2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut. <br>

### Jawaban
1. Yang terjadi pada totalNilai di setiap iterasi Outer loop ialah: <br>
- Direset (Di-nol-kan): Variabel diatur ulang ke 0 karena perintah inisialisasi berada di dalam outer loop. <br>
- Digunakan: Perulangan dalam (yang memproses nilai setiap siswa dalam kelompok tersebut) akan menambahkan nilai siswa satu per satu ke dalam totalNilai. <br>
- Dihitung Rata-rata: Setelah perulangan dalam selesai (semua nilai kelompok sudah terjumlah), totalNilai digunakan untuk menghitung rata-rata kelompok.<br>
Mengapa inisialisasinya **total=0** berada di dalam Outer loop? <br>
Karena, program dapat menghitung rata-rata secara terpisah untuk setiap kelompok. <br>
2. Berikut hasil Program setelah dimodifikasi: <br>
> <img width="1567" height="773" alt="Screenshot 2025-10-30 212156" src="https://github.com/user-attachments/assets/6aae27dd-88ee-47a3-8dee-af2f77f1dd9d" />
