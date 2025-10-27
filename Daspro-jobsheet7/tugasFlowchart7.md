# Latihan 1& 2 membuat Flowchart pertemuan 7 Perulangan
 <h1> Nama   : Naura Fadhilla Aditya Putri </h1>
 <h3> Nim    : 254107020007 </h3>
 <h3> Kelas  : TI-1C </h3>

 ### SOAL <br>
 1. Buatlah flowchart untuk melacak waktu belajar siswa di rumah. Setiap hari siswa memasukkan jumlah jam belajar harian mereka. Program harus menghitung dan menampilkan total jam belajar selama seminggu. Jika siswa belajar lebih dari 10 jam dalam sehari, program harus mengabaikan input tersebut dan meminta input ulang, karena dianggap tidak mungkin.
Catatan: Perulangan dapat menggunakan for, while, atau do-while. Penambahan break atau continue jika diperlukan <br>
jawab : 
> PROGRAM PelacakWaktuBelajarSiswa

DEKLARASI
    totalJamBelajar : REAL = 0
    jamHarian     : REAL
    hari          : INTEGER = 1

MULAI
    TAMPILKAN "=== Pelacak Waktu Belajar Siswa ==="
    TAMPILKAN "Masukkan jam belajar harian Anda selama seminggu."
    TAMPILKAN "Jam belajar tidak boleh lebih dari 10 jam dalam sehari."

    ULANGI UNTUK hari DARI 1 HINGGA 7
        ULANGI
            TAMPILKAN "Hari ke-" + hari + ": Masukkan jumlah jam belajar (misal: 2.5): "
            BACA jamHarian

            JIKA jamHarian >= 0 DAN jamHarian <= 10 MAKA
                totalJamBelajar = totalJamBelajar + jamHarian
                HENTIKAN ULANGI (keluar dari inner loop)
            SELAIN ITU
                TAMPILKAN "Input tidak valid. Jam belajar tidak mungkin lebih dari 10 jam atau kurang dari 0. Silakan masukkan ulang."
            AKHIR JIKA
        SAMPAI KONDISI BENAR (input valid)
    AKHIR ULANGI

    TAMPILKAN ""
    TAMPILKAN "=================================="
    TAMPILKAN "Total jam belajar Anda minggu ini adalah: " + totalJamBelajar + " jam"
    TAMPILKAN "=================================="

> AKHIR PROGRAM

<br>

2. Buatlah flowchart untuk menentukan bonus yang diterima pegawai perusahaan. Setiap pegawai yang bekerja lebih dari 8 jam per hari akan menerima bonus sebesar 20% dari gaji harian. Program akan meminta input jumlah jam kerja dan gaji harian pegawai, lalu menghitung bonusnya. Program akan berhenti jika pengguna memasukkan jam kerja negatif, dan pegawai tersebut tidak diproses. Catatan: Perulangan dapat menggunakan for, while, atau do-while. Penambahan break atau continue jika diperlukan <br>
jawab:
> PROGRAM PenentuBonusPegawai

DEKLARASI
    jamKerja   : REAL
    gajiHarian : REAL
    bonus      : REAL

MULAI
    TAMPILKAN "=== Penentu Bonus Pegawai ==="
    TAMPILKAN "Masukkan jam kerja dan gaji harian pegawai. Program akan berhenti jika jam kerja negatif."

    ULANGI TERUS (Loop tak terbatas, mirip 'while true')
        TAMPILKAN ""
        TAMPILKAN "------------------------------------"
        TAMPILKAN "Masukkan data pegawai baru (atau jam kerja negatif untuk berhenti)."

        TAMPILKAN "Masukkan jam kerja pegawai: "
        BACA jamKerja

        JIKA jamKerja < 0 MAKA
            TAMPILKAN "Input jam kerja negatif terdeteksi. Program berhenti."
            HENTIKAN ULANGI (Keluar dari loop utama)
        AKHIR JIKA

        TAMPILKAN "Masukkan gaji harian pegawai: "
        BACA gajiHarian

        // Validasi tambahan: gaji harian tidak boleh negatif (opsional, tapi baik untuk robustness)
        JIKA gajiHarian < 0 MAKA
            TAMPILKAN "Gaji harian tidak boleh negatif. Pegawai ini tidak diproses."
            LANJUTKAN ULANGI (Melanjutkan ke iterasi berikutnya, meminta data pegawai baru)
        AKHIR JIKA

        JIKA jamKerja > 8 MAKA
            bonus = 0.20 * gajiHarian
            TAMPILKAN "Pegawai ini menerima bonus sebesar: " + bonus
        SELAIN ITU
            bonus = 0
            TAMPILKAN "Pegawai ini tidak menerima bonus."
        AKHIR JIKA
    AKHIR ULANGI

    TAMPILKAN "===================================="
    TAMPILKAN "Program selesai."

> AKHIR PROGRAM