package pekan5_2511533014;

public class Pasien_2511533014 {

    // Atribut pasien
    private String namaPasien_3014;
    private String penyakit_3014;
    private int nomorAntrian_3014;

    // Pointer next
    Pasien_2511533014 next_3014;

    // Constructor
    public Pasien_2511533014(String namaPasien, String penyakit, int nomorAntrian) {
        this.namaPasien_3014 = namaPasien;
        this.penyakit_3014 = penyakit;
        this.nomorAntrian_3014 = nomorAntrian;
        this.next_3014 = null;
    }
    // Getter nama pasien
    public String getNamaPasien_3014() {
        return namaPasien_3014;
    }
    // Getter penyakit
    public String getPenyakit_3014() {
        return penyakit_3014;
    }
    // Getter nomor antrian
    public int getNomorAntrian_3014() {
        return nomorAntrian_3014;
    }
    // Getter next
    public Pasien_2511533014 getNext_3014() {
        return next_3014;
    }
    // Setter nama pasien
    public void setNamaPasien_3014(String namaPasien) {
        this.namaPasien_3014 = namaPasien;
    }
    // Setter penyakit
    public void setPenyakit_3014(String penyakit) {
        this.penyakit_3014 = penyakit;
    }
    // Setter nomor antrian
    public void setNomorAntrian_3014(int nomorAntrian) {
        this.nomorAntrian_3014 = nomorAntrian;
    }
    // Setter next
    public void setNext_3014(Pasien_2511533014 next) {
        this.next_3014 = next;
    } }
