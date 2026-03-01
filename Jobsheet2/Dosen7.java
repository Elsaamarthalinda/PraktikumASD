package Jobsheet2;

public class Dosen7 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen        : " +idDosen);
        System.out.println("Nama Lengkap    : " +nama);
        System.out.println("Status Aktif    : " +statusAktif);
        System.out.println("Tahun Bergabung : " +tahunBergabung);
        System.out.println("Bidang Keahlian : "  +bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif (boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja (int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi " +bidangKeahlian);
    }
 
    public Dosen7() {
    }

    public Dosen7(String id, String nm, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        idDosen = id;
        nama = nm;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;

    }
}