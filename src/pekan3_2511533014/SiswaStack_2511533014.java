package pekan3_2511533014;

import java.util.ArrayList;

class Siswa_2511533014 {
    String nama;
    int nim;

    public Siswa_2511533014(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama;
    }
}

public class SiswaStack_2511533014 {
    private ArrayList<Siswa_2511533014> stack;

    public SiswaStack_2511533014() {
        stack = new ArrayList<>();
    }

    public void push_2511533014(Siswa_2511533014 mhs) {
        stack.add(mhs);
    }

    public Siswa_2511533014 pop_2511533014() {
        if (!isEmpty_251153014()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswa_2511533014 peek_2511533014() {
        if (!isEmpty_251153014()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty_251153014() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa_2511533014() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        SiswaStack_2511533014 studentStack = new SiswaStack_2511533014();

        Siswa_2511533014 mhs1 = new Siswa_2511533014("Ali", 1);
        Siswa_2511533014 mhs2 = new Siswa_2511533014("Boby", 2);
        Siswa_2511533014 mhs3 = new Siswa_2511533014("Charles", 3);

        studentStack.push_2511533014(mhs1);
        studentStack.push_2511533014(mhs2);
        studentStack.push_2511533014(mhs3);

        System.out.println("Siswa di dalam stack:");
        studentStack.tampilkanSiswa_2511533014();

        System.out.println("Siswa teratas: " + studentStack.peek_2511533014());
        System.out.println("Mengeluarkan siswa: " + studentStack.pop_2511533014());

        System.out.println("Setelah pop:");
        studentStack.tampilkanSiswa_2511533014();
    }
}