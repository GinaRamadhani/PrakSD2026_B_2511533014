package pekan4_2511533014;
import java.util.Scanner;
public class AntrianLoketDriver_2511533014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLoket_2511533014 q = new AntrianLoket_2511533014(10);

        int pilihan;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    q.enqueue_3014(nama);
                    break;

                case 2:
                    q.dequeue_3014();
                    break;

                case 3:
                    q.display_3014();
                    break;

                case 4:
                    q.reverse_3014();
                    q.display_3014();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}