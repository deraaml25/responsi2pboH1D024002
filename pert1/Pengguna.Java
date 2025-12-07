class Pengguna {
    // State (variabel) yang diperlukan
    int umur;
    double berat;
    double tinggi;
    
    // Konstanta faktor aktivitas (tidak bisa diubah)
    final double faktorAktivitas = 1.2;
    
    // Constructor untuk menginisialisasi data pengguna
    Pengguna(int umur, double berat, double tinggi) {
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    double hitungBMI() {
        // Konversi tinggi dari cm ke meter
        double tinggiMeter = tinggi / 100;
        // Hitung BMI dengan rumus: berat / (tinggiMeter × tinggiMeter)
        return berat / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        // Rumus: kalori = berat × faktorAktivitas × 10
        return berat * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Nama: Dera Amelia");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("BMI: %.2f%n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari%n", hitungKalori());
        System.out.println("====================================");
    }
}
