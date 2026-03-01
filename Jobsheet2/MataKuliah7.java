package Jobsheet2;

public class MataKuliah7 {
    public String kodeMK;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah7() {
        }

    public MataKuliah7(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK       : " + kodeMK);
        System.out.println("Nama          : " + nama);
        System.out.println("SKS           : " + sks);
        System.out.println("Jumlah Jam    : " + jumlahJam);
        System.out.println("-------------------------------------------------------");
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sksBaru);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah setelah ditambah: " + jumlahJam);
    }

    void kurangiJam (int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
    }
}