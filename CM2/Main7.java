package CM2;
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
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    int nomor = antrian.tambahAntrian(nama, hp);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
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

                case 4:
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