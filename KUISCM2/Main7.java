package KUISCM2;
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL7 antrian = new DLL7();
    
        int pilih;

        do {
            System.out.println("================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian Normal");
            System.out.println("2. Tambah Antrian Prioritas");
            System.out.println("3. Cetak Antrian");
            System.out.println("4. Hapus Antrian dan Pesan");
            System.out.println("5. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                // antrian normal
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    int nomor = antrian.tambahAntrian(nama, hp);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
                    break;

                // antrian prioritas
                case 2:
                    System.out.print("Nama Pembeli : ");
                    String namaP = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hpP = sc.nextLine();
                    int nomorP = antrian.tambahAntrianPrioritas(namaP, hpP);
                    System.out.println("Antrian prioritas berhasil ditambahkan dengan nomor: " + nomorP);
                    break;

                case 3:
                    antrian.cetakAntrian();
                    break;

                case 4:
                    Pembeli7 pembeli = antrian.hapusAntrian();
                    if (pembeli != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesan = sc.nextLine();

                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        antrian.tambahPesanan( kode, namaPesan, harga);
                        System.out.println(pembeli.namaPembeli + " telah memesan " + namaPesan);
                    } else {
                        System.out.println("Antrian kosong, tidak ada pembeli yang bisa memesan.");
                    }
                    break;

                case 5:
                    antrian.tampilPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 0);
    }
}
// apa yang error