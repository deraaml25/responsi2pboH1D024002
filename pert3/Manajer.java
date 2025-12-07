// Gunakan keyword 'extends' untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    private double tunjangan;

    // Constructor
    // Gunakan 'super' untuk memanggil constructor parent
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);  // Memanggil constructor parent (Karyawan)
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    @Override
    void tampilInfo() {
        // Tampilkan info dasar dari parent
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok +
                " | Tunjangan: Rp " + tunjangan);
        // Hitung dan tampilkan total pendapatan
        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}