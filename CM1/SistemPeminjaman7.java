package CM1;
import java.util.Scanner;

public class SistemPeminjaman7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //data awal mahasiswa
        Mahasiswa7[] daftarMhs = {
            new Mahasiswa7("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa7("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa7("22003", "Citra", "Sistem Informasi Bisnis")
        };

        //data awal buku
        Buku7[] daftarBuku = {
            new Buku7("B001", "Algoritma", 2020),
            new Buku7("B002", "Basis Data", 2019),
            new Buku7("B003", "Pemrograman", 2021),
            new Buku7("B004", "Fisika", 2024)
        };

        //data peminjaman
        Peminjaman7[] daftarPinjam = {
            new Peminjaman7(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman7(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman7(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman7(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman7(daftarMhs[0], daftarBuku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch (pilihan) {
                case 1:
                    System.out.println("=== Daftar Mahasiswa ===");
                    for (Mahasiswa7 m : daftarMhs) m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("=== Daftar Buku ===");
                    for (Buku7 b : daftarBuku) b.tampilBuku();
                    break;

                case 3:
                    System.out.println("=== Data Peminjaman ===");
                    for (Peminjaman7 p : daftarPinjam) p.tampilPeminjaman();
                    break;

                case 4:
                    //menggunakan SELECTION SORT - Denda dari Terbesar (Descending)
                    for (int i = 0; i < daftarPinjam.length - 1; i++) {
                        int idxMax = i;
                        for (int j = i + 1; j < daftarPinjam.length; j++) {
                            if (daftarPinjam[j].denda > daftarPinjam[idxMax].denda) {
                                idxMax = j;
                            }
                        }
                        Peminjaman7 temp = daftarPinjam[idxMax];
                        daftarPinjam[idxMax] = daftarPinjam[i];
                        daftarPinjam[i] = temp;
                    }
                    System.out.println("=== Setelah diurutkan (Denda terbesar) ===");
                    for (Peminjaman7 p : daftarPinjam) p.tampilPeminjaman();
                    break;

                case 5:
                    //sorting data berdasarkan NIM terlebih dahulu
                    for (int i = 0; i < daftarPinjam.length - 1; i++) {
                        for (int j = 0; j < daftarPinjam.length - i - 1; j++) {
                            if (daftarPinjam[j].mhs.nim.compareTo(daftarPinjam[j+1].mhs.nim) > 0) {
                                Peminjaman7 temp = daftarPinjam[j];
                                daftarPinjam[j] = daftarPinjam[j+1];
                                daftarPinjam[j+1] = temp;
                            }
                        }
                    }

                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    
                    //binary Search
                    int awal = 0, akhir = daftarPinjam.length - 1;
                    boolean ditemukan = false;

                    while (awal <= akhir) {
                        int tengah = (awal + akhir) / 2;
                        if (daftarPinjam[tengah].mhs.nim.equals(cariNim)) {
                            daftarPinjam[tengah].tampilPeminjaman();
                            ditemukan = true;
                            // cek ke kiri
                            int i = tengah - 1;
                            while (i >= 0 && daftarPinjam[i].mhs.nim.equals(cariNim)) {
                                daftarPinjam[i].tampilPeminjaman();
                                i--;
                            }

                             // cek ke kanan
                            int j = tengah + 1;
                            while (j < daftarPinjam.length && daftarPinjam[j].mhs.nim.equals(cariNim)) {
                                    daftarPinjam[j].tampilPeminjaman();
                                    j++;
                            }

                            break;
                        } else if (daftarPinjam[tengah].mhs.nim.compareTo(cariNim) < 0) {
                            awal = tengah + 1;
                        } else {
                            akhir = tengah - 1;
                        }
                    }
                    if (!ditemukan) System.out.println("Data tidak ditemukan.");
                    break;

                case 0:
                    System.out.println("=== Terima Kasih ===");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}