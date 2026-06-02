package pekan8_2511533014;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class BubleSortGUI_2511533014 extends JFrame { 
	    private static final long serialVersionUID = 1L;

	    private int[] array_3014;
	    private JLabel[] labelArray_3014;
	    private JButton stepButton_3014, resetButton_3014, setButton_3014;
	    private JTextField inputField_3014;
	    private JPanel panelArray_3014;
	    private JTextArea stepArea_3014;

	    private int i_3014, j_3014;
	    private boolean sorting_3014 = false;
	    private int stepCount_3014 = 1;

	    public BubleSortGUI_2511533014() {
	        setTitle("Buble Sort: Langkah per Langkah");
	        setSize(750, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());

	        // Panel input
	        JPanel inputPanel_3014 = new JPanel(new FlowLayout());
	        inputField_3014 = new JTextField(30);
	        setButton_3014 = new JButton("Set Array");

	        inputPanel_3014.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	        inputPanel_3014.add(inputField_3014);
	        inputPanel_3014.add(setButton_3014);

	        // Panel array visual
	        panelArray_3014 = new JPanel(new FlowLayout());

	        // Panel kontrol
	        JPanel controlPanel_3014 = new JPanel();
	        stepButton_3014 = new JButton("Langkah Selanjutnya");
	        resetButton_3014 = new JButton("Reset");
	        stepButton_3014.setEnabled(false);

	        controlPanel_3014.add(stepButton_3014);
	        controlPanel_3014.add(resetButton_3014);

	        // Area teks log langkah
	        stepArea_3014 = new JTextArea(8, 40);
	        stepArea_3014.setEditable(false);
	        stepArea_3014.setFont(new Font("Monospaced", Font.PLAIN, 14));
	        JScrollPane scrollPane_3014 = new JScrollPane(stepArea_3014);

	        // Tambahkan panel ke frame
	        add(inputPanel_3014, BorderLayout.NORTH);
	        add(panelArray_3014, BorderLayout.CENTER);
	        add(controlPanel_3014, BorderLayout.SOUTH);
	        add(scrollPane_3014, BorderLayout.EAST);

	        // Event tombol
	        setButton_3014.addActionListener(e -> setArrayFromInput_3014());
	        stepButton_3014.addActionListener(e -> performStep_3014());
	        resetButton_3014.addActionListener(e -> reset_3014());
	    }

	    private void setArrayFromInput_3014() {
	        String text_3014 = inputField_3014.getText().trim();
	        if (text_3014.isEmpty()) return;
	        String[] parts_3014 = text_3014.split(",");
	        array_3014 = new int[parts_3014.length];
	        try {
	            for (int k_3014 = 0; k_3014 < parts_3014.length; k_3014++) {
	                array_3014[k_3014] = Integer.parseInt(parts_3014[k_3014].trim());
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this,
	                    "Masukkan hanya angka yang dipisahkan dengan koma",
	                    "Error",
	                    JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        i_3014 = 0; 
	        j_3014 = 0;
	        stepCount_3014 = 1;
	        sorting_3014 = true;
	        stepButton_3014.setEnabled(true);
	        stepArea_3014.setText("");
	        panelArray_3014.removeAll();
	        labelArray_3014 = new JLabel[array_3014.length];
	        for (int k_3014 = 0; k_3014 < array_3014.length; k_3014++) {
	            labelArray_3014[k_3014] = new JLabel(String.valueOf(array_3014[k_3014]));
	            labelArray_3014[k_3014].setFont(new Font("Arial", Font.BOLD, 24));
	            labelArray_3014[k_3014].setOpaque(true);
	            labelArray_3014[k_3014].setBackground(Color.WHITE);
	            labelArray_3014[k_3014].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            labelArray_3014[k_3014].setPreferredSize(new Dimension(50, 50));
	            labelArray_3014[k_3014].setHorizontalAlignment(SwingConstants.CENTER);
	            panelArray_3014.add(labelArray_3014[k_3014]);
	        }

	        panelArray_3014.revalidate();
	        panelArray_3014.repaint();
	    }

	    private void performStep_3014() {
	        if (i_3014 < array_3014.length && sorting_3014) {
	            int key_3014 = array_3014[i_3014];
	            j_3014 = i_3014 - 1;

	            StringBuilder stepLog_3014 = new StringBuilder();
	            stepLog_3014.append("Langkah ").append(stepCount_3014)
	                    .append(": Memasukkan ").append(key_3014).append("\n");
	            while (j_3014 >= 0 && array_3014[j_3014] > key_3014) {
	                array_3014[j_3014 + 1] = array_3014[j_3014];
	                j_3014--;
	            }
	            array_3014[j_3014 + 1] = key_3014;
	            updateLabels_3014();
	            stepLog_3014.append("Hasil: ").append(arrayToString_3014(array_3014)).append("\n\n");
	            stepArea_3014.append(stepLog_3014.toString());
	            i_3014++;
	            stepCount_3014++;
	        }
	        if (i_3014 == array_3014.length) {
	            sorting_3014 = false;
	            stepButton_3014.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	    private void updateLabels_3014() {
	        for (int k_3014 = 0; k_3014 < array_3014.length; k_3014++) {
	            labelArray_3014[k_3014].setText(String.valueOf(array_3014[k_3014]));
	        }
	    }
	    private void reset_3014() {
	        inputField_3014.setText("");
	        panelArray_3014.removeAll();
	        panelArray_3014.revalidate();
	        panelArray_3014.repaint();
	        stepArea_3014.setText("");
	        stepButton_3014.setEnabled(false);
	        sorting_3014 = false;
	        i_3014 = 0;
	        j_3014 = 0;
	        stepCount_3014 = 1;
	    }

	    private String arrayToString_3014(int[] arr_3014) {
	        StringBuilder sb_3014 = new StringBuilder();
	        for (int k_3014 = 0; k_3014 < arr_3014.length; k_3014++) {
	            sb_3014.append(arr_3014[k_3014]);
	            if (k_3014 < arr_3014.length - 1) sb_3014.append(", ");
	        }
	        return sb_3014.toString();
	    }

	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(() -> {
	            BubleSortGUI_2511533014 gui_3014 = new BubleSortGUI_2511533014();
	            gui_3014.setVisible(true);
	        });
	    }
	
	
	}


