public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);

        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        System.out.println("\n--- PESAWAT TEMPUR ---");
        // Aktifkan mesin pesawat
        pesawat.aktifkanMesin();

        // Pesawat menjelajah 10 km
        pesawat.jelajah(10);

        // Pesawat menjelajah 30 km
        pesawat.jelajah(30);

        // Pesawat menembak 3 rudal
        pesawat.tembakRudal(3);

        // Tampilkan status pesawat
        pesawat.tampilStatus();

        System.out.println("\n--- KAPAL EKSPLORASI ---");
        // Aktifkan mesin kapal eksplorasi
        kapal.aktifkanMesin();

        // Kapal menjelajah 15 km
        kapal.jelajah(15);

        // Kapal melakukan scanPlanet("Kepler-442b")
        kapal.scanPlanet("Kepler-442b");

        // Tampilkan status kapal
        kapal.tampilStatus();
    }
}