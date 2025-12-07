public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================
    private String namaKendaraan;
    private int levelEnergi;         // 0–100
    private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;  // default energi penuh
    }

    // ==========================================================
    // GETTER
    // ==========================================================
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // ==========================================================
    // SETTER PROTECTED (untuk subclass)
    // ==========================================================
    protected void setLevelEnergi(int levelEnergi) {
        if (levelEnergi > 100) {
            this.levelEnergi = 100;
        } else if (levelEnergi < 0) {
            this.levelEnergi = 0;
        } else {
            this.levelEnergi = levelEnergi;
        }
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================
    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi +
                "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================
    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}