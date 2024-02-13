# Ringkasan Pengujian API Booking
# Tujuan: Melakukan pengujian terhadap API yang berkaitan dengan operasi CRUD (Create, Read, Update, Delete) pada data booking.

# Metode Pengujian:

## 1. Menambahkan Booking:

Langkah:
- Mengirim permintaan API untuk menambahkan data booking dengan metode POST.
- Memverifikasi kode respons API adalah 200 (OK).
- Menyimpan isi respons untuk keperluan pengujian selanjutnya.
- Hasil yang Diharapkan:
- Data booking berhasil ditambahkan.
- Isi respons berisi informasi booking yang baru dibuat, termasuk ID booking.

## 2. Memeriksa dan Menampilkan Booking:

Langkah:
- Mengirim permintaan API untuk mendapatkan data booking dengan metode GET.
- Memverifikasi kode respons API adalah 200 (OK).
- Membandingkan data booking yang ditampilkan dengan data yang diharapkan.
- Hasil yang Diharapkan:
- Data booking berhasil ditampilkan.
- Data booking yang ditampilkan sesuai dengan data yang diharapkan.

## 3. Menghapus Booking:

Langkah:
- Mengirim permintaan API untuk menghapus data booking dengan metode DELETE.
- Memverifikasi kode respons API adalah 201 (Created).
- Memverifikasi bahwa data booking yang dihapus tidak lagi muncul di daftar booking.
- Hasil yang Diharapkan:
- Data booking berhasil dihapus.
- Isi respons berisi pesan konfirmasi penghapusan.

## 4. Memperbarui Booking:

Langkah:
- Mengirim permintaan API untuk mengubah data booking dengan metode PUT.
- Memverifikasi kode respons API adalah 201 (Created).
- Memverifikasi bahwa data booking yang diubah telah diperbarui dengan data yang baru.
- Hasil yang Diharapkan:
- Data booking berhasil diubah.
- Isi respons berisi informasi booking yang telah diperbarui.

# Kesimpulan:

Berdasarkan hasil pengujian, API yang berkaitan dengan operasi CRUD pada data booking telah berfungsi dengan baik. Semua kode respons API sesuai dengan yang diharapkan dan data booking berhasil ditambahkan, ditampilkan, dihapus,