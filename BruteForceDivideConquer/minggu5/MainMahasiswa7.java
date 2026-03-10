package BruteForceDivideConquer.minggu5;
public class MainMahasiswa7 {
    public static void main(String[] args) {

        Mahasiswa7[] data = {
            new Mahasiswa7("Ahmad","220101001",2022,78,82),
            new Mahasiswa7("Budi","220101002",2022,85,88),
            new Mahasiswa7("Cindy","220101003",2021,90,87),
            new Mahasiswa7("Dian","220101004",2021,76,79),
            new Mahasiswa7("Eko","220101005",2023,92,95),
            new Mahasiswa7("Fajar","220101006",2020,88,85),
            new Mahasiswa7("Gina","220101007",2023,80,83),
            new Mahasiswa7("Hadi","220101008",2020,82,84)
        };

        Mahasiswa7 tertinggi = NilaiMahasiswa7.utsTertinggi(data, 0, data.length - 1);
        Mahasiswa7 terendah = NilaiMahasiswa7.utsTerendah(data, 0, data.length - 1);
        double rata = NilaiMahasiswa7.rataUAS(data);

        System.out.println("=======================================");
        System.out.println("     HASIL ANALISIS DATA MAHASISWA     ");
        System.out.println("=======================================");
        System.out.println("\nNilai UTS Tertinggi: ");
        System.out.println("Nama       : " + tertinggi.nama);
        System.out.println("NIM        : " + tertinggi.nim);
        System.out.println("Tahun Masuk: " + tertinggi.tahunMasuk);
        System.out.println("Nilai UTS  : " + tertinggi.nilaiUTS);
        System.out.println("---------------------------------------");
        System.out.println("Nilai UTS Terendah: ");
        System.out.println("Nama       : " + terendah.nama);
        System.out.println("NIM        : " + terendah.nim);
        System.out.println("Tahun Masuk: " + terendah.tahunMasuk);
        System.out.println("Nilai UTS  : " + terendah.nilaiUTS);
        System.out.println("---------------------------------------");
        System.out.println("Rata-rata Nilai UAS : " + rata);
    }
}