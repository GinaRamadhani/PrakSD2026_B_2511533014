package pekan2_2511533014;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Musik_2511533014> playlist = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511533014 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();

                    Musik_2511533014 lagu = new Musik_2511533014(judul, penyanyi, durasi);
                    playlist.add(lagu);

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        System.out.println("=== Daftar Lagu ===");
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println((i + 1) + ". " + playlist.get(i));
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong, tidak ada yang bisa dihapus.");
                    } else {
                        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                        int index = input.nextInt();

                        if (index > 0 && index <= playlist.size()) {
                            playlist.remove(index - 1);
                            System.out.println("Lagu berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}