public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================
    private int modulScan;   // kemampuan scan planet (level 1–5)

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        if (modulScan < 1) {
            this.modulScan = 1;
        } else if (modulScan > 5) {
            this.modulScan = 5;
        } else {
            this.modulScan = modulScan;
        }
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 2;

        if (getLevelEnergi() < energiDibutuhkan) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            int energiBaru = getLevelEnergi() - energiDibutuhkan;
            setLevelEnergi(energiBaru);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        setLevelEnergi(energiBaru);
        System.out.println("Mengisi energi kapal eksplorasi sebanyak " + jumlah + "%. Energi sekarang: " + getLevelEnergi() + "%");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }

    // ==========================================================
    // GETTER TAMBAHAN
    // ==========================================================
    public int getModulScan() {
        return modulScan;
    }
}