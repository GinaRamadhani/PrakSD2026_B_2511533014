package pekan2_2511533014;
import java.util.ArrayList;

	public class Musik_2511533014 {
		private String judul_3014;
		private String penyanyi_3014;
		private int durasi_3014;
		
		public Musik_2511533014 (String judul_3014, String penyanyi_3014, int durasi_3014) {
			this.judul_3014 = judul_3014;
			this.penyanyi_3014 = penyanyi_3014;
			this.durasi_3014 = durasi_3014;
		}
		
		public String getJudul_3014() {return judul_3014;}
		public String getPenyanyi_3014() {return penyanyi_3014;}
		public int getDurasi_3014() {return durasi_3014;}
		
		public void setJudul_3014(String judul_3014) {this.judul_3014 = judul_3014;}
		public void setPenyanyi_3014(String penyanyi_3014) {this.penyanyi_3014 = penyanyi_3014;}
		public void setDurasi_3014(int durasi_3014) {this.durasi_3014 = durasi_3014;}
		
		public void tampilakanInfoMusik_3014() {
			System.out.println("Judul Lagu : " + judul_3014);
			System.out.println("Penyanyi   : " + penyanyi_3014);
			System.out.println("Durasi     : " + durasi_3014 + " detik");
		}

	}

