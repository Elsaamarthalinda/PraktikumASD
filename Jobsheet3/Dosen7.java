package Jobsheet3;

public class Dosen7 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen7(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void cetakInfo() {
        System.out.println("Kode          : " +kode);
        System.out.println("Nama          : " +nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " +usia);
        System.out.println();
    }
}
