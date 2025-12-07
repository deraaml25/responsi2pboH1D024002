public class UjiCustomer {
    public static void main(String[] args) {

        // Buat object Customer biasa
        Customer budi = new Customer("Budi Santoso", "CST-001", 500000);

        // Buat object Member
        Member siti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Tampilkan info untuk Customer biasa
        System.out.println("Status: Customer Biasa");
        budi.tampilkanInfo();
        System.out.println();

        // Tampilkan info untuk pelanggan Member
        System.out.println("Status: Member");
        siti.tampilkanInfo();
    }
}