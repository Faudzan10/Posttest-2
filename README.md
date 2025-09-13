**Deskripsi Program**

Program ini adalah Sistem Reservasi Lapangan Mini Soccer berbasis console menggunakan bahasa Java.
Fungsinya untuk mencatat, melihat, mengubah, dan menghapus data reservasi lapangan yang dilakukan oleh pengguna.

Data reservasi tidak disimpan di database, tetapi sementara ditampung dalam ArrayList selama program berjalan.
Struktur program sudah dipisahkan dengan menggunakan packages (main, model, service) sehingga lebih rapih sesuai konsep MVC sederhana.

**Alur Program**

1.Program dijalankan → menampilkan menu utama:

  - Tambah Reservasi

  - Lihat Reservasi

  - Ubah Reservasi
  
  - Hapus Reservasi

  - Keluar

2. Tambah Reservasi

  - User memasukkan: nama, tanggal, jam, dan durasi.

  - Ada validasi input (tidak boleh kosong, durasi harus angka lebih dari 0).

  - Data tersimpan ke dalam daftar reservasi.

3. Lihat Reservasi

  - Menampilkan semua reservasi yang sudah tersimpan.

  - Jika kosong → muncul pesan “Belum ada data reservasi”.

4. Ubah Reservasi

  - User memilih nomor reservasi dari daftar.

  - Program menampilkan data lama → user bisa isi data baru (atau enter kosong jika tidak ingin diubah).

  - Data diperbarui sesuai input.

5. Hapus Reservasi

  - User memilih nomor reservasi dari daftar.

  - Program menghapus data tersebut dari daftar.

6.Keluar

  - User memilih menu keluar.

  - Program menampilkan pesan perpisahan → program berhenti.

Jadi alurnya sederhana: program jalan → tampilkan menu → user pilih → program proses → kembali ke menu, sampai user memilih keluar.

=================================================================================================

**Penjelasan Kode Program**

**Class Main**
1. Package dan Import
<img width="794" height="94" alt="image" src="https://github.com/user-attachments/assets/9def398b-2e12-4666-9b4b-247818bb5aa4" />

- package main → file ini disimpan di folder main.

- ReservasiService → dipanggil untuk menjalankan logika CRUD.

- Scanner → membaca input user.

2. Method Main

   <img width="889" height="685" alt="image" src="https://github.com/user-attachments/assets/247ecb60-a07a-4870-ab87-c72534b42e8b" />

- Membuat objek service untuk memanggil CRUD.

- Menu utama selalu tampil dengan while(true).

- User pilih angka 1–5:

  - 1 → tambah

  - 2 → lihat

  - 3 → ubah

  - 4 → hapus

  - 5 → keluar

**Class Reservasi**

1. Package & Atribut

   <img width="624" height="158" alt="image" src="https://github.com/user-attachments/assets/ae4aff74-a8e4-43cf-8b5e-3c3b2d0637e4" />

- artinya file ini disimpan di folder model.

- Menggunakan access modifier private supaya aman (hanya bisa diakses lewat method getter/setter).

- Atribut minimal 3 sesuai ketentuan (di sini ada 4).

2. Konstruktor

   <img width="794" height="141" alt="image" src="https://github.com/user-attachments/assets/b7b4c457-3874-4c5d-bcf5-37ac7d4fb898" />

- digunakan untuk langsung mengisi data saat objek dibuat.

3. getter & setter

<img width="650" height="721" alt="image" src="https://github.com/user-attachments/assets/384fc0ff-d2ae-4e2d-b771-e31e279a8389" />

<img width="1001" height="125" alt="image" src="https://github.com/user-attachments/assets/ece4a624-b828-4b49-a5d4-9bb8f46af763" />

- Di dalam class Reservasi, terdapat getter dan setter untuk setiap atribut (namaPemesan, tanggal, jam, durasi) yang berfungsi agar data bisa diakses dan diubah secara aman sesuai prinsip enkapsulasi dalam OOP. Getter digunakan untuk mengambil nilai, sedangkan setter untuk mengubah nilai atribut. Selain itu, ada method infoReservasi()

**Class ReservasiService**
1. Package dan Import

<img width="734" height="127" alt="image" src="https://github.com/user-attachments/assets/bec89dc8-12f6-4ad5-89e4-f353a4f8d035" />

- ArrayList → untuk menyimpan banyak data.

- Scanner → untuk input.

- Reservasi → dipakai buat bikin objek baru.

2. Tambah Reservasi
   
<img width="844" height="517" alt="image" src="https://github.com/user-attachments/assets/4ba69b65-197c-4920-9686-c26785eeb624" />
<img width="780" height="378" alt="image" src="https://github.com/user-attachments/assets/fecbc099-da3d-489a-8551-eb3b0e02407f" />

- Method ini digunakan untuk menambahkan data reservasi baru. Input yang diminta berupa nama pemesan, tanggal, jam, dan durasi.

  - Ada validasi input supaya tidak boleh kosong.

  - Untuk durasi harus berupa angka dan minimal 1 jam.

  - Jika semua data sudah benar, maka data baru akan dimasukkan ke dalam daftarReservasi.

3. Lihat Reservasi

   <img width="686" height="295" alt="image" src="https://github.com/user-attachments/assets/2a0bb51f-2e1b-42f7-a26e-f27bc82ea314" />

- Method ini berfungsi untuk menampilkan daftar semua reservasi.

  - Jika belum ada data, akan muncul pesan "Belum ada data reservasi".

  - Kalau ada, setiap reservasi ditampilkan dengan nomor urut, menggunakan method infoReservasi() dari class Reservasi.
4. Ubah Reservasi

<img width="752" height="652" alt="image" src="https://github.com/user-attachments/assets/367b7f9f-268f-45d7-82c1-fbe48226be07" />

<img width="752" height="570" alt="image" src="https://github.com/user-attachments/assets/85c783e6-ce82-4a4d-94ad-f09bfadb7794" />

- Method ini dipakai untuk mengubah data reservasi tertentu.

  - Pertama, semua reservasi ditampilkan.

  - User memilih nomor reservasi yang ingin diubah.

  - Lalu ditampilkan menu pilihan: mengubah nama, tanggal, jam, atau durasi.

  - Data yang dipilih akan diganti dengan input baru.

5. Hapus Reservasi

<img width="794" height="465" alt="image" src="https://github.com/user-attachments/assets/09a0c58e-1c81-4926-82a9-1a377e799a6f" />

- Method ini digunakan untuk menghapus data reservasi berdasarkan nomor urut.

  - Pertama, semua data ditampilkan.

  - User memilih nomor reservasi yang ingin dihapus.

  - Jika nomor valid, data akan dihapus dari daftarReservasi.


