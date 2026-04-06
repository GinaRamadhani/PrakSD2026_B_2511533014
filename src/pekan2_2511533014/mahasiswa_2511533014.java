package pekan2_2511533014;

public class mahasiswa_2511533014 {
	String nim;
	String nama;
	String prodi;
	mahasiswa_2511533014 (String nim, String nama, String prodi) {
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
	}
	@Override
	public String toString () {
		return "Nim: " + nim + ", Nama: " + nama + ", Prodi: " + prodi;
		
	}

}
