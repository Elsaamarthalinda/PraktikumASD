package Jobsheet2;
public class MataKuliahMain7 {
    public static void main(String[] args) {

        // Objek 1 (Constructor Default)
        MataKuliah7 mk1 = new MataKuliah7();
        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.kodeMK = "ABCD";
        mk1.nama = "Agama";
        mk1.sks = 2;
        mk1.jumlahJam = 2;
        mk1.tampilInformasi();

        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();
        System.out.println();

        // Objek 2 (Constructor Berparameter)
        MataKuliah7 mk2 = new MataKuliah7("1234", "Dasar Pemrograman", 4, 6);
        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();

        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(4);
        mk2.kurangiJam(20); // contoh gagal
        mk2.tampilInformasi();
    }
}