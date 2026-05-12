package Jobsheet12;
public class DoubleLinkedList7 {
    NodeDLL7 head;
    NodeDLL7 tail;

    public DoubleLinkedList7() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(MahasiswaDLL7 data) {
        NodeDLL7 newNode = new NodeDLL7(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(MahasiswaDLL7 data) {
        NodeDLL7 newNode = new NodeDLL7(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String keyNim, MahasiswaDLL7 data) {
        NodeDLL7 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        NodeDLL7 newNode = new NodeDLL7(data);

        if(current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List maasih kosong.");
            return;
        }
        NodeDLL7 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}