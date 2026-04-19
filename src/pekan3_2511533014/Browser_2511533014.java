package pekan3_2511533014;
import java.util.Scanner;
import java.util.Stack;
	
public class Browser_2511533014 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stack<Website_2511533014> history = new Stack<>();
	        int pilihan;

	        do {
	            System.out.println("\n=== Browser History NIM: 2511533014 ===");
	            System.out.println("1. Kunjungi Website (Push)");
	            System.out.println("2. Tombol Back (Pop)");
	            System.out.println("3. Lihat Halaman Aktif (Peek)");
	            System.out.println("4. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan = sc.nextInt();
	            sc.nextLine();

	            switch (pilihan) {

	                // PUSH
	                case 1:
	                    System.out.print("Masukkan Judul: ");
	                    String judul = sc.nextLine();

	                    System.out.print("Masukkan URL: ");
	                    String url = sc.nextLine();

	                    history.push(new Website_2511533014(judul, url));
	                    System.out.println("Berhasil mengunjungi halaman!");
	                    break;

	                // POP
	                case 2:
	                    if (!history.isEmpty()) {
	                        Website_2511533014 keluar = history.pop();
	                        System.out.println("Kembali dari halaman:");
	                        System.out.println(keluar.getJudul_3014());
	                    } else {
	                        System.out.println("History kosong, tidak bisa kembali.");
	                    }
	                    break;

	                // PEEK
	                case 3:
	                    if (!history.isEmpty()) {
	                        System.out.println("Halaman saat ini:");
	                        System.out.println(history.peek());
	                    } else {
	                        System.out.println("Belum ada halaman yang dibuka.");
	                    }
	                    break;

	                // KELUAR
	                case 4:
	                    System.out.println("Keluar dari program.");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid.");
	            }

	        } while (pilihan != 4);

	        sc.close();
	    }
	}

