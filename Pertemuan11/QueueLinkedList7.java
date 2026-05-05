package Pertemuan11;
public class QueueLinkedList7 {
    NodeQL7 front, rear;
    int size;

    public QueueLinkedList7() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(DataMahasiswa7 data) {
        NodeQL7 newNode = new NodeQL7(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil antrian:");
        front.data.tampil();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        NodeQL7 temp = front;
        System.out.println("Daftar antrian:");
        while (temp != null) {
            temp.data.tampil();
            System.out.println("-------------------");
            temp = temp.next;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}