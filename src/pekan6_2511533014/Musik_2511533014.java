package pekan6_2511533014;
import java.util.Scanner;
public class Musik_2511533014 {
    static Lagu_2511533014 head_3014 = null;
    static Lagu_2511533014 tail_3014 = null;

    // Method tambah lagu di akhir
    public static void tambahLagu_3014(String judul_3014,String penyanyi_3014) {
    	Lagu_2511533014 laguBaru_3014 = new Lagu_2511533014(judul_3014, penyanyi_3014);
                   
        // Jika playlist kosong
        if (head_3014 == null) {
            head_3014 = laguBaru_3014;
            tail_3014 = laguBaru_3014;
        }
        // Jika playlist sudah ada isi
        else {
            tail_3014.next_3014 = laguBaru_3014;
            laguBaru_3014.prev_3014 = tail_3014;
            tail_3014 = laguBaru_3014;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }
    // Method hapus lagu pertama
    public static void hapusLaguAwal_3014() {
        // Jika playlist kosong
        if (head_3014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Lagu "  + head_3014.getJudul_3014() + " berhasil dihapus!");         
        // Jika hanya ada satu lagu
        if (head_3014 == tail_3014) {
            head_3014 = null;
            tail_3014 = null;
        }

        // Jika lebih dari satu lagu
        else {
            head_3014 = head_3014.next_3014;
            head_3014.prev_3014 = null;
        }
    }

    // Method tampil playlist maju
    public static void tampilMaju_3014() {
        // Jika playlist kosong
        if (head_3014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511533014 bantu_3014 = head_3014;
        System.out.println("=== Playlist Maju ===");
        while (bantu_3014 != null) {
            System.out.println("Judul : " + bantu_3014.getJudul_3014());
            System.out.println("Penyanyi : " + bantu_3014.getPenyanyi_3014());
            System.out.println();
            bantu_3014 = bantu_3014.next_3014;
        }
    }
    // Method tampil playlist mundur
    public static void tampilMundur_3014() {
        // Jika playlist kosong
        if (tail_3014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511533014 bantu_3014 = tail_3014;
        System.out.println("=== Playlist Mundur ===");
        while (bantu_3014 != null) {
            System.out.println("Judul : "  + bantu_3014.getJudul_3014());
            System.out.println("Penyanyi : " + bantu_3014.getPenyanyi_3014());
            System.out.println();
            bantu_3014 = bantu_3014.prev_3014;
        }
    }
    // Method cari lagu
    public static void cariLagu_3014(String judulCari_3014) {
        // Jika playlist kosong
        if (head_3014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511533014 bantu_3014 = head_3014;
        boolean ditemukan_3014 = false;
        while (bantu_3014 != null) {
            if (bantu_3014.getJudul_3014()
                    .equalsIgnoreCase(judulCari_3014)) {
                System.out.println("Lagu ditemukan!");
                System.out.println("Judul : " + bantu_3014.getJudul_3014());
                System.out.println("Penyanyi : " + bantu_3014.getPenyanyi_3014());             
                ditemukan_3014 = true;
                break;
            }
            bantu_3014 = bantu_3014.next_3014;
        }
        // Jika lagu tidak ditemukan
        if (ditemukan_3014 == false) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }
    // Main Program
    public static void main(String[] args) {
        Scanner input_3014 = new Scanner(System.in);
        int pilihan_3014;
        do {
            System.out.println();
            System.out.println("=== Playlist Musik NIM: 2511533014 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist Maju");
            System.out.println("4. Lihat Playlist Mundur");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            pilihan_3014 = input_3014.nextInt();
            input_3014.nextLine();
            // Tambah Lagu
            if (pilihan_3014 == 1) {
                System.out.print("Judul : ");
                String judul_3014 = input_3014.nextLine();
                System.out.print("Penyanyi : ");
                String penyanyi_3014 = input_3014.nextLine();
                tambahLagu_3014(judul_3014, penyanyi_3014);           
            }
            // Hapus Lagu
            else if (pilihan_3014 == 2) {
                hapusLaguAwal_3014();
            }
            // Tampil Playlist Maju
            else if (pilihan_3014 == 3) {
                tampilMaju_3014();
            }
            // Tampil Playlist Mundur
            else if (pilihan_3014 == 4) {
                tampilMundur_3014();
            }
            // Cari Lagu
            else if (pilihan_3014 == 5) {
                System.out.print("Masukkan judul lagu : ");
                String cari_3014 = input_3014.nextLine();                     
                cariLagu_3014(cari_3014);
            }
            // Keluar
            else if (pilihan_3014 == 6) {
                System.out.println("Program selesai!");
            }
            // Jika pilihan salah
            else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3014 != 6);
        input_3014.close();
    }  }
