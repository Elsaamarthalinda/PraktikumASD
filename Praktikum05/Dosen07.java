package Praktikum05;

public class Dosen07 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen07(String kd, String nm, boolean jk, int age) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------");
    }
}