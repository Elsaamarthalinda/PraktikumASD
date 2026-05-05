package Pertemuan11;
public class Mahasiswa7 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa7() {
    }

    Mahasiswa7(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
    System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}