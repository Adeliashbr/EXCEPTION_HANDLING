# EXCEPTION_HANDLING
# 💥 EXCEPTION_HANDLING

## 👨‍🎓 Informasi Mahasiswa
- **Nama**: Adelia Shabira 
- **Kelas**: TI23A  
- **NIM**: 20230040194

---

## 📚 Daftar Isi
- [Pendahuluan](#pendahuluan)
- [Analisis Masalah Per Percobaan](#analisis-masalah-per-percobaan)
  - [Percobaan 1](#percobaan-1)
  - [Percobaan 2](#percobaan-2)
  - [Percobaan 3](#percobaan-3)
  - [Percobaan 4](#percobaan-4)
  - [Percobaan 5](#percobaan-5)
  - [Percobaan 6](#percobaan-6)
  - [Percobaan 7](#percobaan-7)
  - [Percobaan 8](#percobaan-8)
  - [Percobaan 9](#percobaan-9)
  - [Percobaan 10](#percobaan-10)
  - [Percobaan 11](#percobaan-11)
  - [Percobaan 12](#percobaan-12)

---

## 📖 Pendahuluan
Praktikum ini membahas bagaimana cara menangani error (exception) pada bahasa pemrograman Java dengan menggunakan `try`, `catch`, `throw`, `throws`, dan `finally`. Tujuannya adalah agar program lebih aman, tidak langsung crash saat terjadi error, dan dapat memberikan informasi yang jelas kepada pengguna atau developer.

---

## 🔎 Analisis Masalah Per Percobaan

### 🔴 Percobaan 1: ArrayIndexOutOfBoundsException
- **Masalah:** Akses indeks ke-5 pada array yang hanya berukuran 5 elemen menyebabkan `ArrayIndexOutOfBoundsException`.
- **Solusi:** Tangani dengan `try-catch` untuk mencegah crash program.

---

### 🔴 Percobaan 2: Loop dengan ArrayIndexOutOfBoundsException
- **Masalah:** Perulangan `while(i<4)` mencoba mengakses indeks di luar batas array.
- **Solusi:** Tangani exception dengan `try-catch` di dalam loop dan reset nilai `i` jika error terjadi.

---

### 🔴 Percobaan 3: ArithmeticException
- **Masalah:** Pembagian bilangan `10 / 0` menyebabkan `ArithmeticException`.
- **Solusi:** Gunakan `try-catch` untuk menangkap dan menangani pembagian oleh nol.

---

### 🔴 Percobaan 4: Multiple Exception
- **Masalah:** Dua error terjadi berurutan (`ArrayIndexOutOfBoundsException` dan `ArithmeticException`), namun hanya satu `try-catch` blok digunakan.
- **Solusi:** Ubah urutan eksekusi dan tambahkan `catch` untuk masing-masing exception agar keduanya tertangani.

---

### 🔴 Percobaan 5: Analisis Pesan Error
- **Masalah:** Menampilkan detail error tanpa penanganan bisa membingungkan.
- **Solusi:** Gunakan `e.getMessage()` dan `e.printStackTrace()` untuk melihat info error secara detail, sangat membantu debugging.

---

### 🔴 Percobaan 6: Throw Manual Exception
- **Masalah:** Program secara eksplisit melempar `NullPointerException`.
- **Solusi:** Tangani dengan `try-catch` untuk mencegah crash. Baris setelah `throw` tidak akan dieksekusi.

---

### 🔴 Percobaan 7: Throw Custom Message
- **Masalah:** `throw new Exception("...")` digunakan untuk melempar pesan custom.
- **Solusi:** Tangani dengan `catch`, lalu tampilkan `e.getMessage()`, `e.toString()`, dan `e.printStackTrace()` untuk melihat detail error.

---

### 🔴 Percobaan 8: Throws dan Finally
- **Masalah:** Method `methodB()` melempar `IOException`, menyebabkan error jika tidak ditangani.
- **Solusi:** Tambahkan `throws IOException` di method `main()` atau tangani dengan `try-catch`. `finally` digunakan untuk baris yang **selalu dieksekusi**, entah error atau tidak.

---

### 🔴 Percobaan 9: Membalik String Kosong
- **Masalah:** String kosong dilempar sebagai Exception.
- **Solusi:** Cek panjang string. Jika 0, lempar Exception dan tangani di `main()`.

---

### 🔴 Percobaan 10: RandomAccessFile
- **Masalah:** Operasi file bisa gagal jika file tidak ditemukan atau format salah.
- **Solusi:** Gunakan `try-catch IOException` untuk menangani error file saat menulis dan membaca data.

---

### 🔴 Percobaan 11: Exception Kustom (extends Throwable)
- **Masalah:** Program melempar error kustom `RangeErrorException`.
- **Solusi:** Buat class exception sendiri dari `Throwable`, lempar dan tangani menggunakan `try-catch`.

---

### 🔴 Percobaan 12: Exception Kustom (extends Exception)
- **Masalah:** Program membuat exception sendiri dengan class `MyException`, dan melemparnya jika input adalah "amir".
- **Solusi:** Tangani dengan `try-catch` saat `MyException` dilempar. Menunjukkan penggunaan `throw` dengan pengecekan logika.

---

> ✨ Dokumentasi ini dibuat sebagai laporan akhir Praktikum Exception Handling – Java, TI23A.
