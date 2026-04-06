package pekan2_2511533014;

public class DaftarKataDriver_2511533014 {
	
	public static void main (String [] args) {
	DaftarKata_2511533014 al = new DaftarKata_2511533014();
	
	
	//Menambah elemen (akhir)
	al.tambah_2511533014("Kami");
	al.tambah_2511533014("Informatika");
	
	// Menyisipkan elemen pada index 1
	al.tambahPada_2511533014(1, "mahasiswa_2511533014");
	
	//Cetak isi awal
	System.out.println("Awal          : " + al);
	
	//Mengubah elemen (index 1)
	al.ubahElemen_2511533014(1, "Departemen");
	System.out.println("Setelah Ubah: " + al);
	
	//Menghapus elemen (hapus index 0)
	String terhapus = al.hapusElemen_2511533014(0);
	System.out.println("Terhapus   : " + terhapus);
	System.out.println("Setelah Hapus: " + al);
	
	//Iterasi pada ArrayList (cetak setiap elemen)
	System.out.print ("Iterasi:");
	al.iterasiCetak_2511533014();
	System.out.println();
}
}
