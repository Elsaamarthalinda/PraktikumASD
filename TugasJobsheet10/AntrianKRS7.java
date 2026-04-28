package TugasJobsheet10;
public class AntrianKRS7 {
    KRSMahasiswa7[] data;
    int front, rear, size, max;
    int sudahProses = 0;
    int kuotaDPA = 30;

    public AntrianKRS7(int max) {
        this.max = max;
        data = new KRSMahasiswa7[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(KRSMahasiswa7 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        if (sudahProses >= kuotaDPA) {
            System.out.println("Kuota DPA sudah penuh (30 mahasiswa)");
            return;
        }

        System.out.println("Memproses KRS:");

        for (int i = 0; i < 2; i++) {
            if (!isEmpty() && sudahProses < kuotaDPA) {
                KRSMahasiswa7 m = data[front];
                front = (front + 1) % max;
                size--;
                sudahProses++;

                System.out.print("Diproses: ");
                m.tampilkanData();
            }
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("2 Antrian terdepan:");
            for (int i = 0; i < 2 && i < size; i++) {
                int idx = (front + i) % max;
                data[idx].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir:");
            data[rear].tampilkanData();
        }
    }

    public void CetakStatistikAntrian() {
        System.out.println("Jumlah antrian: " + size);
        System.out.println("Sudah proses KRS: " + sudahProses);
        int sisa = kuotaDPA - sudahProses;
        System.out.println("Sisa kuota proses: " + sisa);
    }
}