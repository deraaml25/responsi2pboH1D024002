
public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ==="); // [cite: 28]

        // UBAH: Hapus argumen nominalTransaksi dari constructor
        EWalletPayment ovo = new EWalletPayment("OVO", 150000);

        System.out.println("Saldo awal: " + (int)ovo.getBalance()); // [cite: 28]

        // Panggilan method sudah benar
        ovo.processPayment(50000); // [cite: 29]

        System.out.println("Sisa saldo: " + (int)ovo.getBalance()); // [cite: 30]
        System.out.println("Detail Transaksi: " + ovo.getPaymentDetails()); // [cite: 31]
    }
}