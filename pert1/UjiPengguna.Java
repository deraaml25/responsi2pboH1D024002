
class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna dengan data uji coba
        // Umur: 25 tahun, Berat: 60 kg, Tinggi: 170 cm
        Pengguna p = new Pengguna(25, 60.0, 170.0);
        
        // Panggil method tampilInfo untuk menampilkan semua informasi
        p.tampilInfo();
        // Tampilkan demonstrasi tentang konstanta final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");

    }
}