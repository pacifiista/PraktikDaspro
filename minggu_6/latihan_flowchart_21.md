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
[boolean1.drawio](https://github.com/user-attachments/files/22723535/boolean1.drawio)
<img width="550" height="545" alt="Screenshot 2025-10-06 205219" src="https://github.com/user-attachments/assets/adf829f4-5ccc-4891-bb8a-0dc93316457e" />

- Pseudocode untuk menyelesaikan masalah:


Mulai(Start) 
// Deklarasi variabel
    Set BOOLEAN kartuMahasiswa, registrasiOnline;
  

//Input data
    Input kartuMahasiswa, registrasiOnline;

    
// Proses
````IF (kartuMahasiswa == "masuk") THEN
Print "Mahasiswa berhasil masuk" 
ELSE 
tampilkan "Mahasiswa gagal masuk" 
END IF
````
Akhir(End)

2. Membuat Flowchart
[nested2.drawio](https://github.com/user-attachments/files/22724533/nested2.drawio)
<img width="555" height="697" alt="Screenshot 2025-10-06 215003" src="https://github.com/user-attachments/assets/c4f48ba9-4ac4-43d3-aa26-be549bb9c5d2" />


- Pseudocode untuk menyelesaikan masalah:
Mulai (Start)
    // Deklarasi variabel
    Set String jenisPengguna, jenisPenggunaMahasiswa, jenisPenggunaDosen;
    Set int SKS;

    // Input Data 
    input jenisPengguna;

    // Proses
````IF ( jenisPenggunaMahasiswa == "jumlah SKS") THEN
IF (SKS >= 12) THEN
Print "Akses WiFi diberikan (mahasiswa aktif)"
ELSE
Print "Akses ditolak,SKS kurang dari 12"
END IF
ELSE
Print "Akses ditolak"
END IF
````
Akhir (End)
