package CM2;
public class DLL7 {
    // DLL Pembeli
    Pembeli7 head;
    Pembeli7 tail;

    // DLL Pesanan
    Pesanan7 headPesanan;
    Pesanan7 tailPesanan;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    //tambah antrian
    public int tambahAntrian(String nama, String hp) {
        int nomorBaru;
        if (isEmpty()) {
            nomorBaru = 1;
        } else {
            nomorBaru = tail.noAntrian + 1;
        }
        Pembeli7 baru = new Pembeli7(nomorBaru, nama, hp);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        size++;
        return nomorBaru;
    }

    //cetak antrian
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
            Pembeli7 current = head;
            System.out.println("=================================");
            System.out.println("Daftar Antrian Pembeli");
            System.out.println("=================================");
            System.out.printf("No Antrian\tNama\t\tNo HP\n");

        while (current != null) {
            System.out.printf(current.noAntrian + "\t\t" + current.namaPembeli + "\t\t" + current.noHp + "\n");
            current = current.next;
        }
    }

    //hapus antrian
    public Pembeli7 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Pembeli7 data = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    //tambah pesanan
    public void tambahPesanan(int kode, String namaPesanan, int harga) {
        Pesanan7 baru = new Pesanan7(kode, namaPesanan, harga);
        
        if (headPesanan == null) {
            headPesanan = tailPesanan = baru;
        } else {
            Pesanan7 current = headPesanan;
            //pengurutan abjad nama pesanan
            while (current != null && current.namaPesanan.compareToIgnoreCase(baru.namaPesanan) < 0) {
                current = current.next;
            }

            // insert awal
            if (current == headPesanan) {
                baru.next = headPesanan;
                headPesanan.prev = baru;
                headPesanan = baru;

            }

            // insert akhir
            else if (current == null) {
                tailPesanan.next = baru;
                baru.prev = tailPesanan;
                tailPesanan = baru;
            }

            // insert tengah
            else {
                Pesanan7 before = current.prev;
                before.next = baru;
                baru.prev = before;
                baru.next = current;
                current.prev = baru;
            }
        }
    }

    //cetak laporan pesanan
    public void tampilPesanan() {
        if (headPesanan == null) {
            System.out.println("Belum ada pesanan");
            return;
        }

        Pesanan7 current = headPesanan;
        System.out.println("==============================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==============================================");
        System.out.printf("Kode Pesanan\t\tNama Pesanan\t\tHarga\n");

        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf(current.kodePesanan + "\t\t\t" + current.namaPesanan + "\t\t" + current.harga + "\n");
            totalPendapatan += current.harga;
            current = current.next;
        }
        System.out.println("==============================================");
        System.out.println("Total Pendapatan Restoran: Rp" + totalPendapatan);
    }
}
////buatkan 2 antrian normal dan antrian prioritas otomatis disimpan di index ke 2