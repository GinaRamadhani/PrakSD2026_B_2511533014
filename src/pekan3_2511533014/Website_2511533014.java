package pekan3_2511533014;
public class Website_2511533014 {
	
	    private String judul_3014;
	    private String url_3014;
	    // Constructor
	    public Website_2511533014(String judul, String url) {
	        this.judul_3014 = judul;
	        this.url_3014 = url;
	    }
	    // Getter
	    public String getJudul_3014() {
	        return judul_3014;
	    }

	    public String getUrl_3014() {
	        return url_3014;
	    }

	    // Setter
	    public void setJudul_3014(String judul) {
	        this.judul_3014 = judul;
	    }

	    public void setUrl_3014(String url) {
	        this.url_3014 = url;
	    }

	    // toString untuk menampilkan data
	    @Override
	    public String toString() {
	        return "Judul: " + judul_3014 + "\nURL: " + url_3014;
	    }
	}


