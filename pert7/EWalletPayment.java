// EWalletPayment.java (Kode yang Diperbaiki)
public class EWalletPayment implements PaymentMethod {

    // Atribut
    private String namaPenyedia;
    private double saldo;
    // Hapus: private double nominalTransaksi;

    // Spesifikasi meminta getTransactionFee() mengembalikan biaya (misal Rp 2.000) [cite: 10]
    private static final double BIAYA_TRANSAKSI = 2000.0;

    // Constructor (Atribut nominalTransaksi dihapus) [cite: 18]
    public EWalletPayment(String namaPenyedia, double saldo) {
        this.namaPenyedia = namaPenyedia;
        this.saldo = saldo;
        // Hapus: this.nominalTransaksi = nominalTransaksi;
    }

    // Implementasi method dari interface PaymentMethod

    @Override
    // UBAH: Tambahkan parameter 'amount' sesuai interface
    public void processPayment(double amount) {
        // 'amount' menggantikan nominalTransaksi
        double totalPembayaran = amount + BIAYA_TRANSAKSI;

        System.out.println("Memproses pembayaran sebesar " + (int)amount + "..."); // Sesuai output contoh [cite: 29]

        if (saldo >= totalPembayaran) {
            saldo -= totalPembayaran;
            // Output sesuai spesifikasi [cite: 21]
            System.out.println("Pembayaran berhasil!");
            // Output Tambahan
            // System.out.println("Total pembayaran (termasuk fee): Rp " + totalPembayaran);
        } else {
            // Output sesuai spesifikasi [cite: 22]
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
            // Output Tambahan
            // System.out.println("Dibutuhkan: Rp " + totalPembayaran);
            // System.out.println("Saldo tersedia: Rp " + saldo);
        }
    }

    @Override
    public String getPaymentDetails() {
        // Sesuaikan dengan format output contoh [cite: 31]
        return "Pembayaran dilakukan melalui " + namaPenyedia;
    }

    @Override
    public double getTransactionFee() {
        return BIAYA_TRANSAKSI; // Mengembalikan biaya transaksi [cite: 10]
    }

    @Override
    public double getBalance() {
        return saldo; // Mengembalikan saldo [cite: 10]
    }
}