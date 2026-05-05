package Pertemuan11;
class DataMahasiswa7 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public DataMahasiswa7(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}