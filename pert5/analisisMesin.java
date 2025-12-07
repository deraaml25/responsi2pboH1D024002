class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] mesinArray = new defaultMesin[5];

        mesinArray[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesinArray[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesinArray[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        mesinArray[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesinArray[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (int i = 0; i < mesinArray.length; i++) {
            mesinArray[i].tampilInfo();
            System.out.println("Kategori: " + mesinArray[i].kategoriMesin());
            System.out.println("Performa: " + mesinArray[i].nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        for (int i = 0; i < mesinArray.length; i++) {
            if (mesinArray[i] instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesinArray[i]).suaraMesin();
            } else if (mesinArray[i] instanceof mesinTraktor) {
                ((mesinTraktor) mesinArray[i]).suaraMesin();
            } else if (mesinArray[i] instanceof mesinMotor) {
                ((mesinMotor) mesinArray[i]).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        defaultMesin mesinTerbaik = mesinArray[0];
        double performaTertinggi = mesinArray[0].nilaiPerforma();

        for (int i = 1; i < mesinArray.length; i++) {
            double performaSekarang = mesinArray[i].nilaiPerforma();
            if (performaSekarang > performaTertinggi) {
                performaTertinggi = performaSekarang;
                mesinTerbaik = mesinArray[i];
            }
        }

        System.out.println(mesinTerbaik.namaMesin + " → " + performaTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        defaultMesin[] sortedMesin = new defaultMesin[mesinArray.length];
        for (int i = 0; i < mesinArray.length; i++) {
            sortedMesin[i] = mesinArray[i];
        }

        for (int i = 0; i < sortedMesin.length - 1; i++) {
            for (int j = 0; j < sortedMesin.length - i - 1; j++) {
                if (sortedMesin[j].nilaiPerforma() < sortedMesin[j + 1].nilaiPerforma()) {
                    defaultMesin temp = sortedMesin[j];
                    sortedMesin[j] = sortedMesin[j + 1];
                    sortedMesin[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3 && i < sortedMesin.length; i++) {
            System.out.println((i + 1) + ". " + sortedMesin[i].namaMesin +
                    " → " + sortedMesin[i].nilaiPerforma());
        }
    }
}