package pekan1_2511533014;

public class MobilDriver_2511533014 {
	
	    // Array statis dengan kapasitas 100
	    private static Mobil_2511533014[] daftarMobil = new Mobil_2511533014[100];
	    private static int jumlahMobil = 0; // Penanda indeks

	    public static void main(String[] args) {
	        System.out.println("=== Program Driver Mobil Array (NIM: 2511533014) ===\n");

	        // 1. Tambah Mobil
	        tambahMobil(new Mobil_2511533014("Avanza", 2020, 1300, 150000000, "Toyota"));
	        tambahMobil(new Mobil_2511533014("Brio", 2021, 1200, 160000000, "Honda"));
	        tambahMobil(new Mobil_2511533014("Xpander", 2022, 1500, 250000000, "Mitsubishi"));

	        System.out.println("\n--- Daftar Mobil Awal ---");
	        tampilkanSemua();

	        // 2. Edit Harga (Mutator)
	        System.out.println("\n[Sistem] Mengubah harga mobil pertama...");
	        daftarMobil[0].setHarga(155000000);

	        // 3. Hapus Mobil (Misal hapus indeks ke-1 / Brio)
	        hapusMobil(1);

	        System.out.println("\n--- Daftar Mobil Akhir ---");
	        tampilkanSemua();
	    }

	    // Method Tambah Mobil ke Array
	    public static void tambahMobil(Mobil_2511533014 m) {
	        if (jumlahMobil < daftarMobil.length) {
	            daftarMobil[jumlahMobil] = m;
	            jumlahMobil++;
	            System.out.println("[Sistem] Berhasil menambah: " + m.getNama());
	        } else {
	            System.out.println("[Error] Array penuh!");
	        }
	    }

	    // Method Hapus Mobil (Logika Geser Elemen)
	    public static void hapusMobil(int index) {
	        if (index >= 0 && index < jumlahMobil) {
	            System.out.println("[Sistem] Menghapus mobil: " + daftarMobil[index].getNama());
	            
	            // Menggeser elemen setelahnya ke kiri agar tidak ada lubang (null)
	            for (int i = index; i < jumlahMobil - 1; i++) {
	                daftarMobil[i] = daftarMobil[i + 1];
	            }
	            daftarMobil[jumlahMobil - 1] = null; // Hapus duplikat di akhir
	            jumlahMobil--; // Kurangi counter
	        } else {
	            System.out.println("[Error] Indeks tidak ditemukan!");
	        }
	    }

	    // Method Selektor untuk menampilkan semua
	    public static void tampilkanSemua() {
	        if (jumlahMobil == 0) {
	            System.out.println("Data kosong.");
	        } else {
	            for (int i = 0; i < jumlahMobil; i++) {
	                daftarMobil[i].infoMobil();
	            }
	        }
	    }
	}

