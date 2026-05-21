package pekan7_2511533014;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MahasiswaGUI_2511533014 extends JFrame {

    class Mahasiswa_3014 {
        private String nama_3014, nim_3014, prodi_3014;

        public Mahasiswa_3014(String nama_3014, String nim_3014, String prodi_3014) {
            this.nama_3014 = nama_3014;
            this.nim_3014 = nim_3014;
            this.prodi_3014 = prodi_3014;
        }

        public String getNama_3014() { return nama_3014; }
        public String getNim_3014() { return nim_3014; }
        public String getProdi_3014() { return prodi_3014; }

        @Override
        public String toString() {
            return nama_3014;
        }
    }

    ArrayList<Mahasiswa_3014> data_3014 = new ArrayList<>();

    JTextField txtNama_3014, txtNim_3014, txtProdi_3014;
    JComboBox<String> cmbSort_3014;
    JTable tabel_3014;
    DefaultTableModel model_3014;
    JTextArea areaProses_3014;
    JButton btnTambah_3014, btnHapus_3014, btnSort_3014;

    public MahasiswaGUI_2511533014() {

        setTitle("Sorting Mahasiswa");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panelInput_3014 = new JPanel(new GridLayout(6,2));

        panelInput_3014.add(new JLabel("Nama"));
        txtNama_3014 = new JTextField();
        panelInput_3014.add(txtNama_3014);

        panelInput_3014.add(new JLabel("NIM"));
        txtNim_3014 = new JTextField();
        panelInput_3014.add(txtNim_3014);

        panelInput_3014.add(new JLabel("Program Studi"));
        txtProdi_3014 = new JTextField();
        panelInput_3014.add(txtProdi_3014);

        panelInput_3014.add(new JLabel("Pilih Sorting"));

        String pilihan_3014[] = {
                "Insertion Sort",
                "Selection Sort",
                "Bubble Sort"
        };

        cmbSort_3014 = new JComboBox<>(pilihan_3014);
        panelInput_3014.add(cmbSort_3014);

        btnTambah_3014 = new JButton("Tambah");
        btnHapus_3014 = new JButton("Hapus");
        btnSort_3014 = new JButton("Mulai Sorting");

        panelInput_3014.add(btnTambah_3014);
        panelInput_3014.add(btnHapus_3014);
        panelInput_3014.add(btnSort_3014);

        add(panelInput_3014, BorderLayout.NORTH);

        model_3014 = new DefaultTableModel();
        model_3014.addColumn("Nama");
        model_3014.addColumn("NIM");
        model_3014.addColumn("Prodi");

        tabel_3014 = new JTable(model_3014);

        JScrollPane scrollTabel_3014 =
                new JScrollPane(tabel_3014);

        areaProses_3014 = new JTextArea(5,20);
        areaProses_3014.setEditable(false);

        JScrollPane scrollProses_3014 =
                new JScrollPane(areaProses_3014);

        JSplitPane split_3014 =
                new JSplitPane(
                        JSplitPane.VERTICAL_SPLIT,
                        scrollTabel_3014,
                        scrollProses_3014
                );

        split_3014.setDividerLocation(350);

        add(split_3014, BorderLayout.CENTER);

        aksiButton_3014();
    }

    void aksiButton_3014() {

        btnTambah_3014.addActionListener(e -> {

            String nama_3014 = txtNama_3014.getText();
            String nim_3014 = txtNim_3014.getText();
            String prodi_3014 = txtProdi_3014.getText();

            Mahasiswa_3014 mhs_3014 =
                    new Mahasiswa_3014(
                            nama_3014,
                            nim_3014,
                            prodi_3014);

            data_3014.add(mhs_3014);

            model_3014.addRow(new Object[]{
                    nama_3014,
                    nim_3014,
                    prodi_3014
            });

            txtNama_3014.setText("");
            txtNim_3014.setText("");
            txtProdi_3014.setText("");
        });

        btnHapus_3014.addActionListener(e -> {
            int baris_3014 = tabel_3014.getSelectedRow();

            if(baris_3014 != -1){
                data_3014.remove(baris_3014);
                model_3014.removeRow(baris_3014);
            }
        });

        btnSort_3014.addActionListener(e -> {

            ArrayList<Mahasiswa_3014> temp_3014 =
                    new ArrayList<>(data_3014);

            String pilih_3014 =
                    cmbSort_3014.getSelectedItem().toString();

            areaProses_3014.setText("");

            if(pilih_3014.equals("Insertion Sort"))
                insertionSort_3014(temp_3014);

            else if(pilih_3014.equals("Selection Sort"))
                selectionSort_3014(temp_3014);

            else
                bubbleSort_3014(temp_3014);
        });
    }

    void insertionSort_3014(ArrayList<Mahasiswa_3014> list_3014) {

        areaProses_3014.append("=== INSERTION SORT ===\n");

        for(int i=1;i<list_3014.size();i++){

            Mahasiswa_3014 key = list_3014.get(i);
            int j=i-1;

            while(j>=0 &&
                    list_3014.get(j)
                    .getNama_3014()
                    .compareToIgnoreCase(key.getNama_3014())>0){

                list_3014.set(j+1,list_3014.get(j));
                j--;
            }

            list_3014.set(j+1,key);

            areaProses_3014.append(
                    "Langkah "+i+" : "+
                    ambilNama_3014(list_3014)+"\n");
        }
    }

    void selectionSort_3014(ArrayList<Mahasiswa_3014> list_3014){

        areaProses_3014.append("\n=== SELECTION SORT ===\n");

        for(int i=0;i<list_3014.size()-1;i++){

            int min=i;

            for(int j=i+1;j<list_3014.size();j++){

                if(list_3014.get(j)
                        .getNama_3014()
                        .compareToIgnoreCase(
                        list_3014.get(min)
                        .getNama_3014())<0)
                    min=j;
            }

            Mahasiswa_3014 temp=list_3014.get(i);

            list_3014.set(i,list_3014.get(min));
            list_3014.set(min,temp);

            areaProses_3014.append(
                    "Pass "+(i+1)+" : "+
                    ambilNama_3014(list_3014)+"\n");
        }
    }

    void bubbleSort_3014(ArrayList<Mahasiswa_3014> list_3014){

        areaProses_3014.append("\n=== BUBBLE SORT ===\n");

        for(int i=0;i<list_3014.size()-1;i++){

            for(int j=0;j<list_3014.size()-i-1;j++){

                if(list_3014.get(j)
                        .getNama_3014()
                        .compareToIgnoreCase(
                        list_3014.get(j+1)
                        .getNama_3014())>0){

                    Mahasiswa_3014 temp =
                            list_3014.get(j);

                    list_3014.set(j,list_3014.get(j+1));
                    list_3014.set(j+1,temp);
                }
            }

            areaProses_3014.append(
                    "Pass "+(i+1)+" : "+
                    ambilNama_3014(list_3014)+"\n");
        }
    }

    String ambilNama_3014(ArrayList<Mahasiswa_3014> list_3014){

        String hasil_3014="[";

        for(int i=0;i<list_3014.size();i++){

            hasil_3014 += list_3014.get(i).getNama_3014();

            if(i!=list_3014.size()-1)
                hasil_3014 += ", ";
        }

        return hasil_3014+"]";
    }

    public static void main(String[] args) {
        new MahasiswaGUI_2511533014().setVisible(true);
    }
}