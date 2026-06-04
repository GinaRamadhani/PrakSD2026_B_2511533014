package pekan8_2511533014;
import java.util.Scanner;
public class Sorting_2511533014 {
    Lagu_2511533014[] dataLagu_3014 = new Lagu_2511533014[20];
    int jumlahData_3014 = 3;
    void inputData_3014() {
        dataLagu_3014[0] = new Lagu_2511533014(
                "Mio Cristo Piange Diamanti",
                "Caparezza",
                270);
        dataLagu_3014[1] = new Lagu_2511533014(
                "La Rumba Del Perdon",
                "Juanes",
                252);
        dataLagu_3014[2] = new Lagu_2511533014(
                "La Perla",
                "Calle 13",
                196);
    }

    int partition_3014(Lagu_2511533014 arr_3014[], int low_3014, int high_3014) {
        int pivot_3014 = arr_3014[high_3014].durasi_3014;
        int i_3014 = low_3014 - 1;
        for (int j_3014 = low_3014; j_3014 < high_3014; j_3014++) {
            if (arr_3014[j_3014].durasi_3014 < pivot_3014) {
                i_3014++;
                Lagu_2511533014 temp_3014 = arr_3014[i_3014];
                arr_3014[i_3014] = arr_3014[j_3014];
                arr_3014[j_3014] = temp_3014;
            }
        }

        Lagu_2511533014 temp_3014 = arr_3014[i_3014 + 1];
        arr_3014[i_3014 + 1] = arr_3014[high_3014];
        arr_3014[high_3014] = temp_3014;

        return i_3014 + 1;
    }

    void quickSort_3014(Lagu_2511533014 arr_3014[],
            int low_3014,
            int high_3014) {
        if (low_3014 < high_3014) {
            int pi_3014 = partition_3014(arr_3014,
                    low_3014,
                    high_3014);
            quickSort_3014(arr_3014,
                    low_3014,
                    pi_3014 - 1);
            quickSort_3014(arr_3014,
                    pi_3014 + 1,
                    high_3014);
        }
    }

    void tampilData_3014() {
        for (int i_3014 = 0; i_3014 < jumlahData_3014; i_3014++) {
            System.out.println((i_3014 + 1) + ". "
                    + dataLagu_3014[i_3014].judul_3014
                    + " - "
                    + dataLagu_3014[i_3014].durasi_3014
                    + " detik");
        }
    }

    public static void main(String[] args) {
        Scanner input_3014 = new Scanner(System.in);
        Sorting_2511533014 data_3014 =
                new Sorting_2511533014();
        data_3014.inputData_3014();
        System.out.println(
                "=== Sorting Playlist NIM: 2511533014 ===");
        System.out.print(
                "Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilihan_3014 = input_3014.nextInt();
        System.out.println("\nData Sebelum Sorting:");
        data_3014.tampilData_3014();
        if (pilihan_3014 == 2) {
            data_3014.quickSort_3014(
                    data_3014.dataLagu_3014,
                    0,
                    data_3014.jumlahData_3014 - 1);
            System.out.println(
                    "\nData Setelah Quick Sort (Durasi Asc):");
            data_3014.tampilData_3014();
        } else {
            System.out.println(
                    "\nAlgoritma belum diimplementasikan.");
        }

        input_3014.close();
    }
}