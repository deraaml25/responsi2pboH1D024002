class Customer {
    // Atribut dasar customer
    protected String nama;
    protected String idCustomer;
    protected int totalBelanja;

    // Constructor untuk inisialisasi data customer
    Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    // Method untuk menampilkan informasi dasar customer
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + idCustomer +
                " | Total Belanja: Rp " + totalBelanja);
    }
}