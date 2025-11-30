# 📋 Dokumentasi Program Gaji Karyawan

## 📌 Deskripsi Program
Program ini dibuat untuk menghitung total penghasilan karyawan berdasarkan:
- **Golongan Karyawan** (A, B, atau C)
- **Jumlah Jam Lembur** (0 jam atau lebih)

Program akan otomatis menghitung gaji pokok sesuai golongan dan menambahkan bonus lembur berdasarkan jumlah jam kerja lembur.

---

## 🏗️ Struktur Program

### 1️⃣ **Input Program**
Program meminta 2 input dari user:
```
1. Golongan Karyawan (A/B/C)
2. Jumlah Jam Lembur (angka)
```

### 2️⃣ **Proses Perhitungan**

#### A. Menentukan Gaji Pokok Berdasarkan Golongan

| Golongan | Gaji Pokok |
|----------|------------|
| A | Rp 5.000.000 |
| B | Rp 6.500.000 |
| C | Rp 9.500.000 |

**Kode:**
```java
if (golongan.equals("A")) {
    gajiPokok = 5000000;
} else if (golongan.equals("B")) {
    gajiPokok = 6500000;
} else if (golongan.equals("C")) {
    gajiPokok = 9500000;
} else {
    System.out.println("Golongan tidak valid!");
    System.exit(0);
}
```

**Kondisi:**
- ✅ Jika input A, B, atau C → Gaji pokok ditetapkan sesuai tabel
- ❌ Jika input selain A/B/C → Program berhenti dengan pesan error

---

#### B. Menentukan Gaji Lembur Berdasarkan Jam Lembur

Gaji lembur dihitung sebagai **persentase dari gaji pokok**:

| Jam Lembur | Persentase | Rumus Gaji Lembur |
|------------|------------|-------------------|
| 0 jam | 0% | 0 × Gaji Pokok |
| 1 jam | 30% | 0.30 × Gaji Pokok |
| 2 jam | 32% | 0.32 × Gaji Pokok |
| 3 jam | 34% | 0.34 × Gaji Pokok |
| 4 jam | 36% | 0.36 × Gaji Pokok |
| ≥ 5 jam | 38% | 0.38 × Gaji Pokok |

**Kode:**
```java
if (jamLembur == 1) {
    gajiLembur = 0.30 * gajiPokok;
} else if (jamLembur == 2) {
    gajiLembur = 0.32 * gajiPokok;
} else if (jamLembur == 3) {
    gajiLembur = 0.34 * gajiPokok;
} else if (jamLembur == 4) {
    gajiLembur = 0.36 * gajiPokok;
} else if (jamLembur >= 5) {
    gajiLembur = 0.38 * gajiPokok;
} else {
    gajiLembur = 0;
}
```

**Kondisi:**
- ✅ Jam lembur 1-4 → Persentase tetap sesuai tabel
- ✅ Jam lembur ≥ 5 → Persentase maksimal 38%
- ✅ Jam lembur 0 atau negatif → Tidak ada gaji lembur

---

#### C. Menghitung Total Penghasilan

```java
totalGaji = gajiPokok + gajiLembur;
```

**Formula:**
```
Total Penghasilan = Gaji Pokok + Gaji Lembur
```

---

### 3️⃣ **Output Program**

Program menampilkan hasil perhitungan dalam format:
```
=== Hasil Perhitungan Gaji Karyawan ===
Golongan          : [A/B/C]
Gaji Pokok        : Rp [nominal]
Gaji Lembur       : Rp [nominal]
Total Penghasilan : Rp [nominal]
```

---

## 💡 Contoh Penggunaan

### **Contoh 1: Golongan A, 2 Jam Lembur**

**Input:**
```
Masukkan Golongan Karyawan (A/B/C): A
Masukkan Jumlah Jam Lembur: 2
```

**Proses:**
- Gaji Pokok = Rp 5.000.000
- Gaji Lembur = 32% × Rp 5.000.000 = Rp 1.600.000
- Total = Rp 5.000.000 + Rp 1.600.000 = Rp 6.600.000

**Output:**
```
=== Hasil Perhitungan Gaji Karyawan ===
Golongan          : A
Gaji Pokok        : Rp 5.000.000
Gaji Lembur       : Rp 1.600.000
Total Penghasilan : Rp 6.600.000
```

---

### **Contoh 2: Golongan B, 5 Jam Lembur**

**Input:**
```
Masukkan Golongan Karyawan (A/B/C): B
Masukkan Jumlah Jam Lembur: 5
```

**Proses:**
- Gaji Pokok = Rp 6.500.000
- Gaji Lembur = 38% × Rp 6.500.000 = Rp 2.470.000
- Total = Rp 6.500.000 + Rp 2.470.000 = Rp 8.970.000

**Output:**
```
=== Hasil Perhitungan Gaji Karyawan ===
Golongan          : B
Gaji Pokok        : Rp 6.500.000
Gaji Lembur       : Rp 2.470.000
Total Penghasilan : Rp 8.970.000
```

---

### **Contoh 3: Golongan C, Tanpa Lembur**

**Input:**
```
Masukkan Golongan Karyawan (A/B/C): C
Masukkan Jumlah Jam Lembur: 0
```

**Proses:**
- Gaji Pokok = Rp 9.500.000
- Gaji Lembur = 0% × Rp 9.500.000 = Rp 0
- Total = Rp 9.500.000 + Rp 0 = Rp 9.500.000

**Output:**
```
=== Hasil Perhitungan Gaji Karyawan ===
Golongan          : C
Gaji Pokok        : Rp 9.500.000
Gaji Lembur       : Rp 0
Total Penghasilan : Rp 9.500.000
```

---

### **Contoh 4: Input Golongan Tidak Valid**

**Input:**
```
Masukkan Golongan Karyawan (A/B/C): D
Masukkan Jumlah Jam Lembur: 3
```

**Output:**
```
Golongan tidak valid!
```
*Program berhenti dan tidak melanjutkan perhitungan*

---

### **Contoh 5: Golongan A, 10 Jam Lembur (Lebih dari 5 jam)**

**Input:**
```
Masukkan Golongan Karyawan (A/B/C): A
Masukkan Jumlah Jam Lembur: 10
```

**Proses:**
- Gaji Pokok = Rp 5.000.000
- Gaji Lembur = 38% × Rp 5.000.000 = Rp 1.900.000 *(tetap 38%, tidak naik lagi)*
- Total = Rp 5.000.000 + Rp 1.900.000 = Rp 6.900.000

**Output:**
```
=== Hasil Perhitungan Gaji Karyawan ===
Golongan          : A
Gaji Pokok        : Rp 5.000.000
Gaji Lembur       : Rp 1.900.000
Total Penghasilan : Rp 6.900.000
```

---

## 🔍 Analisis Kondisi Program

### **Kondisi IF untuk Golongan**
```java
if (golongan.equals("A"))      // Jika golongan = A
else if (golongan.equals("B")) // Jika golongan = B
else if (golongan.equals("C")) // Jika golongan = C
else                           // Jika golongan selain A/B/C → ERROR
```

### **Kondisi IF untuk Jam Lembur**
```java
if (jamLembur == 1)      // Tepat 1 jam → 30%
else if (jamLembur == 2) // Tepat 2 jam → 32%
else if (jamLembur == 3) // Tepat 3 jam → 34%
else if (jamLembur == 4) // Tepat 4 jam → 36%
else if (jamLembur >= 5) // 5 jam atau lebih → 38%
else                     // 0 atau negatif → 0%
```

---

## 🎯 Fitur Program

✅ **Validasi Input Golongan** - Program menolak input selain A/B/C  
✅ **Perhitungan Otomatis** - Gaji pokok dan lembur dihitung otomatis  
✅ **Format Rupiah** - Output ditampilkan dengan pemisah ribuan  
✅ **Fleksibel Jam Lembur** - Mendukung 0 jam hingga jam unlimited  
✅ **Case Insensitive** - Input 'a' atau 'A' sama-sama diterima  

---

## 🛠️ Cara Menjalankan

1. **Compile program:**
   ```bash
   javac GajiKaryawan.java
   ```

2. **Jalankan program:**
   ```bash
   java GajiKaryawan
   ```

3. **Input data sesuai petunjuk**

---

## 📝 Catatan Penting

- Input golongan **tidak case-sensitive** (a, A, b, B, c, C semuanya valid)
- Jam lembur maksimal bonus adalah **38%** (untuk ≥5 jam)
- Jika input golongan salah, program akan **langsung berhenti**
- Gaji lembur dihitung berdasarkan **persentase gaji pokok**, bukan nilai tetap

---

## 👨‍💻 Pembuat
**Yustiko**  
Tugas Kuliah - Pemrograman Java

---

*Dokumentasi dibuat: 30 November 2025*
