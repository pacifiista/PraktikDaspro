# Latihan soal Pemilihan (IF-Else)
<h1> Nama   : Naura Fadhilla Aditya Putri </h1>
<h3> Nim    : 254107020007 </h3>
<h3> Kelas  : TI-1C </h3>

## Soal
1. Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat:
 * Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi online, maka boleh masuk. 
 * Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk.
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

2. Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas
akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
 * Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.
 * Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS
yang diambil:
- Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.
- Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
* Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

## Jawaban
1. Membuat Flowchart
(image)

* Pseudocode untuk menyelesaikan masalah:
Mulai(Start)
    // Deklarasi variabel
    Set BOOLEAN kartuMahasiswa, registrasiOnline;

    //Input data
    Input kartuMahasiswa, registrasiOnline;

    // Proses
    IF (kartuMahasiswa == "masuk") THEN
    Print "Mahasiswa berhasil masuk"
    ELSE
    tampilkan "Mahasiswa gagal masuk"
     END IF
Akhir(End)

2. Membuat Flowchart
(image)

* Pseudocode untuk menyelesaikan masalah:
Mulai (Start)
    // Deklarasi variabel
    Set String jenisPengguna, jenisPenggunaMahasiswa, jenisPenggunaDosen;
    Set int SKS;

    // Input Data 
    input jenisPengguna;

    // Proses
````IF (kehadiran >= 75) THEN
IF (nilaiTugas >= 60) THEN
Print "Boleh ikut ujian"
ELSE
Print "Tidak boleh ikut ujian karena nilai tugas kurang"
END IF
ELSE
Print "Tidak boleh ikut ujian"
END IF
````