package pekan6_2511533014;

public class Lagu_2511533014 {

    // Atribut class
     String judul_3014;
     String penyanyi_3014;
    Lagu_2511533014 next_3014;
    Lagu_2511533014 prev_3014;

    // Konstruktor
    public Lagu_2511533014(String judul_3014, String penyanyi_3014) {
        this.judul_3014 = judul_3014;
        this.penyanyi_3014 = penyanyi_3014;
        this.next_3014 = null;
        this.prev_3014 = null;
    }
    // Getter Judul
    public String getJudul_3014() {
        return judul_3014;
    }
    // Setter Judul
    public void setJudul_3014(String judul_3014) {
        this.judul_3014 = judul_3014;
    }
    // Getter Penyanyi
    public String getPenyanyi_3014() {
        return penyanyi_3014;
    }
    // Setter Penyanyi
    public void setPenyanyi_3014(String penyanyi_3014) {
        this.penyanyi_3014 = penyanyi_3014;
    }
}