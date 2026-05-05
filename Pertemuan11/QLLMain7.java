package Pertemuan11;
import java.util.Scanner;
public class QLLMain7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList7 queue = new QueueLinkedList7();

        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Menambahkan Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampil Antrian Terdepan & Terakhir");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    DataMahasiswa7 mhs = new DataMahasiswa7(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    queue.peekFront();
                    queue.peekRear();
                    break;

                case 5:
                    queue.jumlahAntrian();
                    break;

                case 6:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);
    }
}