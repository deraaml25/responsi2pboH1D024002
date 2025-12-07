class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    String kode;
    String nama;
    double harga;
    int stok;

    // Constructor 1: Hanya kode dan nama (harga = 0.0, stok = 0)
    BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Constructor 2: Kode, nama, dan harga (stok = 0)
    BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 3: Data lengkap (kode, nama, harga, stok)
    BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + nama + " | Kode: " + kode +
                " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}