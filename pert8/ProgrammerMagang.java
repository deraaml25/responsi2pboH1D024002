// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false; // default belum login
    }

    // @Override: IMPLEMENTASIKAN hitungGaji(int jamKerja)
    // LOGIKA: Hitung gaji (jamKerja * gajiPerJam) dan tampilkan hasilnya.
    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * gajiPerJam;
        System.out.println("Gaji " + nama + " (" + jamKerja + " jam) adalah: Rp " + totalGaji);
        return totalGaji;
    }

    // @Override: IMPLEMENTASIKAN perpanjangKontrak(int durasiBulan)
    // LOGIKA: Tampilkan pesan konfirmasi perpanjangan kontrak.
    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    // @Override: IMPLEMENTASIKAN getStatusCuti() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Tersedia 5 hari".
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }


    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println(nama + " berhasil logout.");
    }

    public String getRoleAkses() {
        return "Magang IT";
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPerJam() {
        return gajiPerJam;
    }

    public boolean isSedangLogin() {
        return sedangLogin;
    }
}