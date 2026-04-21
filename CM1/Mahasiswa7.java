package CM1;

public class Mahasiswa7 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa7(String nm, String name, String prodi) {
        this.nim = nm;
        this.nama = name;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}