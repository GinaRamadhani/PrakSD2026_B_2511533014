package pekan2_2511533014;
import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511533014{

    // 1. Method untuk menampilkan menu
    public static void tampilkanMenu_2511533014() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
        System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("5. Keluar");
    }

    // 2. Method untuk tambah mahasiswa
    public static void tambahmahasiswa_2511533014(ArrayList<mahasiswa_2511533014> list, Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();

        list.add(new mahasiswa_2511533014(nim, nama, prodi));
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }
    // 3. Method untuk tampilkan semua data
    public static void tampilSemuamahasiswa_2511533014(ArrayList<mahasiswa_2511533014> list) {
    	if (list.isEmpty()) {
    		System.out.println ("Daftar mahasiswa kosong:");
    		for (mahasiswa_2511533014 mhs : list) {
    			System.out.println (mhs);
    			
    		}
    	}
    }
    // 4. Method untuk hapus mahasiswa_2511533014 berdasarkan NIM
    public static void hapusmahasiswa_2511533014 (ArrayList<mahasiswa_2511533014> list, Scanner sc) {
    	System.out.print ("Masukkan NIM yang akan dihapus: ");
    	String nimHapus = sc.nextLine ();
    	boolean removed = list.removeIf(mhs -> mhs.nim.equals (nimHapus));
    	
    	if (removed) {
    		System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus.");
    	} else {
    		System.out.println("NIM tidak ditemukan.");
    	}
    }
    	// 5. Method untuk cari mahasiswa berdasarkan NIM
        public static void cariMahasiswa_2511533014(ArrayList<mahasiswa_2511533014> list, Scanner sc) {
            System.out.print("Masukkan NIM yang dicari: ");
            String nimCari = sc.nextLine();
            boolean ditemukan = false;

            for (mahasiswa_2511533014 mhs : list) {
                if (mhs.nim.equals(nimCari)) {
                    System.out.println("Hasil Pencarian: " + mhs);
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("NIM tidak ada.");
            }
        }
        public static void main(String[] args) {
            ArrayList<mahasiswa_2511533014> mahasiswaList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                tampilkanMenu_2511533014();
                System.out.print("Pilih menu: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        tambahmahasiswa_2511533014(mahasiswaList, scanner);
                        break;
                    case 2:
                        tampilSemuamahasiswa_2511533014(mahasiswaList);
                        break;
                    case 3:
                        hapusmahasiswa_2511533014(mahasiswaList, scanner);
                        break;
                    case 4:
                        cariMahasiswa_2511533014(mahasiswaList, scanner);
                        break;
                    case 5:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (choice != 5);
            scanner.close();
            
    
    		
    			
    		
    	
    	}
    }



