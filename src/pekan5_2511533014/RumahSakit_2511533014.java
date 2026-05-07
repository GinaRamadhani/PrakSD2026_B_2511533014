package pekan5_2511533014;
import java.util.Scanner;
public class RumahSakit_2511533014 {
    static Pasien_2511533014 head_3014 = null;
    static int counter_3014 = 0;
    // Insert at tail
    public static void daftarkanPasien_3014(String namaPasien, String penyakit) {
        counter_3014++;
        Pasien_2511533014 pasienBaru_3014 =
                new Pasien_2511533014(namaPasien, penyakit, counter_3014);
        if (head_3014 == null) {

            head_3014 = pasienBaru_3014;

        } else {
            Pasien_2511533014 bantu_3014 = head_3014;
            while (bantu_3014.next_3014 != null)
                bantu_3014 = bantu_3014.next_3014;
            bantu_3014.next_3014 = pasienBaru_3014;
        }
        System.out.println("Pasien berhasil didaftarkan!");
        System.out.println("Nomor Antrian: "
                + pasienBaru_3014.getNomorAntrian_3014());
    }
    // Delete head
    public static void panggilPasien_3014() {
        if (head_3014 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n=== Pasien Dipanggil ===");
        System.out.println("Nomor Antrian : "
                + head_3014.getNomorAntrian_3014());
        System.out.println("Nama Pasien   : "
                + head_3014.getNamaPasien_3014());
        System.out.println("Keluhan       : "
                + head_3014.getPenyakit_3014());

        head_3014 = head_3014.next_3014;
    }
    // Display
    public static void tampilkanAntrian_3014() {
        if (head_3014 == null) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("\n=== Daftar Antrian Pasien ===");
        Pasien_2511533014 bantu_3014 = head_3014;
        int posisi_3014 = 1;
        while (bantu_3014 != null) {
            System.out.println("Posisi Antrian : "
                    + posisi_3014);
            System.out.println("Nomor Antrian  : "
                    + bantu_3014.getNomorAntrian_3014());
            System.out.println("Nama Pasien    : "
                    + bantu_3014.getNamaPasien_3014());
            System.out.println("Keluhan        : "
                    + bantu_3014.getPenyakit_3014());
            System.out.println("--------------------------");
            bantu_3014 = bantu_3014.next_3014;
            posisi_3014++;
        }
    }
    // Search pasien
    public static void cariPasien_3014(String namaCari_3014) {
        if (head_3014 == null) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        Pasien_2511533014 bantu_3014 = head_3014;
        while (bantu_3014 != null) {
            if (bantu_3014.getNamaPasien_3014()
                    .equalsIgnoreCase(namaCari_3014)) {
                System.out.println("\n=== Pasien Ditemukan ===");
                System.out.println("Nomor Antrian : "
                        + bantu_3014.getNomorAntrian_3014());
                System.out.println("Nama Pasien   : "
                        + bantu_3014.getNamaPasien_3014());
                System.out.println("Keluhan       : "
                        + bantu_3014.getPenyakit_3014());
                return;   }
            bantu_3014 = bantu_3014.next_3014;        }
        System.out.println("Pasien tidak ditemukan!");
    }
    // Cek status antrian
    public static void cekStatusAntrian_3014() {
        if (head_3014 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511533014 bantu_3014 = head_3014;
        int jumlah_3014 = 0;
        while (bantu_3014 != null) {
            jumlah_3014++;
            bantu_3014 = bantu_3014.next_3014;
        }
        System.out.println("=== Status Antrian ===");
        System.out.println("Jumlah Pasien : "  + jumlah_3014);
        System.out.println("Pasien Terdepan:");
        System.out.println("Nomor Antrian : "  + head_3014.getNomorAntrian_3014());
        System.out.println("Nama Pasien   : "  + head_3014.getNamaPasien_3014());
        System.out.println("Keluhan       : "+ head_3014.getPenyakit_3014());
    }
    // Main program
    public static void main(String[] args) {
        Scanner input_3014 = new Scanner(System.in);
        int pilihan_3014;
        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533014 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3014 = input_3014.nextInt();
            input_3014.nextLine();
            if (pilihan_3014 == 1) {
                System.out.print("Masukkan Nama Pasien : ");
                String namaPasien_3014 = input_3014.nextLine();
                System.out.print("Masukkan Keluhan     : ");
                String penyakit_3014 = input_3014.nextLine();
                daftarkanPasien_3014(
                        namaPasien_3014,
                        penyakit_3014);
            } else if (pilihan_3014 == 2) {
                panggilPasien_3014();
            } else if (pilihan_3014 == 3) {
                tampilkanAntrian_3014();
            } else if (pilihan_3014 == 4) {
                System.out.print("Masukkan Nama Pasien yang dicari : ");
                String namaCari_3014 = input_3014.nextLine();
                cariPasien_3014(namaCari_3014);
            } else if (pilihan_3014 == 5) {
                cekStatusAntrian_3014();
            } else if (pilihan_3014 == 6) {
                System.out.println("Program selesai. Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_3014 != 6);
        input_3014.close();
    }  }
