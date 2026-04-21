package Jobsheet9;

public class StackSurat7 {
    Surat7[] stack;
    int top;
    int size;

    public StackSurat7(int size) {
        this.size = size;
        stack = new Surat7[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat7 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh");
        }
    }
    public Surat7 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }
    public Surat7 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.trim().equalsIgnoreCase(nama.trim())) {
                return true;
            }
        }
        return false;
    }
}