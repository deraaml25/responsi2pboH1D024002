class Member extends Customer {
    // Atribut tambahan khusus untuk Member
    private int poinReward;
    private String level;

    // Constructor dengan super untuk memanggil constructor parent
    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja);  // Panggil constructor Customer
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // Panggil method parent terlebih dahulu untuk menampilkan info dasar
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}