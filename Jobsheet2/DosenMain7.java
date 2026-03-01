package Jobsheet2;

public class DosenMain7 {
    public static void main(String[] args) {
        Dosen7 dsn1 = new Dosen7();
        dsn1.idDosen = "12345";
        dsn1.nama = "Candra Bella Vista";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2020;
        dsn1.bidangKeahlian = "RPL";

        dsn1.tampilInformasi();
        dsn1.ubahKeahlian("Basis Data");
        System.out.println("Masa Kerja: " +dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.tampilInformasi();
        System.out.println("------------------------------------------------------");

        Dosen7 dsn2 = new Dosen7("54321", "Astrifidha", false, 2018, "Agama");
        dsn2.tampilInformasi();
        dsn2.ubahKeahlian("English");
        System.out.println("Masa Kerja      : " +dsn2.hitungMasaKerja(2026) +" tahun");
        dsn2.tampilInformasi();
    }
}