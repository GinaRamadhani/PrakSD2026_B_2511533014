package pekan1_2511533014;

public class Mobil_2511533014 {
	
	    private String nama;
	    private int tahun;
	    private int cc;
	    private double harga;
	    private String merk;

	    public Mobil_2511533014(String nama, int tahun, int cc, double harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }

	    // Selektor (Getter)
	    public String getNama() { return nama; }
	    public double getHarga() { return harga; }

	    // Mutator (Setter)
	    public void setHarga(double harga) { this.harga = harga; }

	    public void infoMobil() {
	        System.out.println("- " + nama + " (" + merk + "), " + tahun + " [" + cc + "cc] - Rp" + harga);
	    }
	}


