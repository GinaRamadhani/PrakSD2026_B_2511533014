package pekan9_2511533014;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class PetaFTI_2511533014 extends JFrame {
    private JComboBox<String> startBox_3014, goalBox_3014;
    private JTextArea hasilArea_3014;
    private GraphPanel_3014 graphPanel_3014;
    private Map<String, List<String>> graph_3014 = new HashMap<>();
    public PetaFTI_2511533014() {
    	getContentPane().setBackground(new Color(192, 192, 192));
        setTitle("Pencarian Jalur Menggunakan BFS dan DFS");
        setSize(900, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initGraph_3014();

        JPanel top_3014 = new JPanel();
        startBox_3014 = new JComboBox<>(graph_3014.keySet().toArray(new String[0]));
        goalBox_3014 = new JComboBox<>(graph_3014.keySet().toArray(new String[0]));

        JButton bfsBtn_3014 = new JButton("BFS");
        bfsBtn_3014.setBackground(new Color(0, 128, 6));
        JButton dfsBtn_3014 = new JButton("DFS");
        dfsBtn_3014.setBackground(new Color(244, 146, 11));
        JButton resetBtn_3014 = new JButton("RESET");
        resetBtn_3014.setBackground(new Color(242, 36, 13));

        top_3014.add(new JLabel("Lokasi Awal"));
        top_3014.add(startBox_3014);
        top_3014.add(new JLabel("Lokasi Tujuan"));
        top_3014.add(goalBox_3014);
        top_3014.add(bfsBtn_3014);
        top_3014.add(dfsBtn_3014);
        top_3014.add(resetBtn_3014);

        graphPanel_3014 = new GraphPanel_3014();

        hasilArea_3014 = new JTextArea(8, 40);
        hasilArea_3014.setEditable(false);

        getContentPane().add(top_3014, BorderLayout.NORTH);
        getContentPane().add(graphPanel_3014, BorderLayout.CENTER);
        getContentPane().add(new JScrollPane(hasilArea_3014), BorderLayout.SOUTH);

        bfsBtn_3014.addActionListener(e -> runBFS_3014());
        dfsBtn_3014.addActionListener(e -> runDFS_3014());
        resetBtn_3014.addActionListener(e -> {
            graphPanel_3014.reset_3014();
            hasilArea_3014.setText("");
        });
    }
    private void addEdge_3014(String a, String b) {
        graph_3014.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
        graph_3014.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
    }
    private void initGraph_3014() {
        addEdge_3014("Gerbang FTI", "Kantin");
        addEdge_3014("Kantin", "Musholla");
        addEdge_3014("Musholla", "Lab Algoritma");
        addEdge_3014("Lab Algoritma", "Lab AI&DS");
        addEdge_3014("Lab AI&DS", "Aula");
        addEdge_3014("Aula", "Perpustakaan");
        addEdge_3014("Perpustakaan", "Akademik");
        addEdge_3014("Akademik", "Dekanat");
        addEdge_3014("Dekanat", "Ruang Dosen");
        addEdge_3014("Ruang Dosen", "Lab Algoritma");
        addEdge_3014("Dekanat", "Aula");
        addEdge_3014("Perpustakaan", "Lab Algoritma");
        addEdge_3014("Kantin", "Aula");
        addEdge_3014("Musholla", "Perpustakaan");
        addEdge_3014("Ruang Dosen", "Lab AI&DS");
    }
    private void runBFS_3014() {
        search_3014(true);
    }
    private void runDFS_3014() {
        search_3014(false);
    }
    private void search_3014(boolean bfs_3014) {
        String start_3014 = (String) startBox_3014.getSelectedItem();
        String goal_3014 = (String) goalBox_3014.getSelectedItem();

        Set<String> visited_3014 = new LinkedHashSet<>();
        Map<String, String> parent_3014 = new HashMap<>();

        if (bfs_3014) {
            Queue<String> q = new LinkedList<>();
            q.add(start_3014);
            visited_3014.add(start_3014);

            while (!q.isEmpty()) {
                String cur = q.poll();
                if (cur.equals(goal_3014)) break;

                for (String n : graph_3014.get(cur)) {
                    if (!visited_3014.contains(n)) {
                        visited_3014.add(n);
                        parent_3014.put(n, cur);
                        q.add(n);
                    }
                }
            }
        } else {
            Stack<String> st = new Stack<>();
            st.push(start_3014);
            visited_3014.add(start_3014);

            while (!st.isEmpty()) {
                String cur = st.pop();
                if (cur.equals(goal_3014)) break;

                for (String n : graph_3014.get(cur)) {
                    if (!visited_3014.contains(n)) {
                        visited_3014.add(n);
                        parent_3014.put(n, cur);
                        st.push(n);
                    }
                }
            }
        }

        List<String> path_3014 = new ArrayList<>();
        String cur_3014 = goal_3014;
        while (cur_3014 != null) {
            path_3014.add(cur_3014);
            cur_3014 = parent_3014.get(cur_3014);
        }
        Collections.reverse(path_3014);

        hasilArea_3014.setText(
                "Metode : " + (bfs_3014 ? "BFS" : "DFS") + "\n\n" +
                "Jalur : " + String.join(" -> ", path_3014) + "\n\n" +
                "Node Dikunjungi : " + visited_3014 + "\n\n" +
                "Jumlah Node Dieksplorasi : " + visited_3014.size()
        );

        graphPanel_3014.updateVisited_3014(visited_3014, goal_3014);
    }

    class GraphPanel_3014 extends JPanel {
        Map<String, Point> pos_3014 = new HashMap<>();
        Set<String> visited_3014 = new HashSet<>();
        String goal_3014 = "";

        GraphPanel_3014() {
            pos_3014.put("Gerbang FTI", new Point(120, 300));
            pos_3014.put("Kantin", new Point(220, 260));
            pos_3014.put("Musholla", new Point(320, 220));
            pos_3014.put("Lab Algoritma", new Point(430, 180));
            pos_3014.put("Lab AI&DS", new Point(580, 220));
            pos_3014.put("Aula", new Point(650, 120));
            pos_3014.put("Perpustakaan", new Point(500, 80));
            pos_3014.put("Akademik", new Point(320, 80));
            pos_3014.put("Dekanat", new Point(180, 120));
            pos_3014.put("Ruang Dosen", new Point(300, 150));
        }

        void updateVisited_3014(Set<String> v, String g) {
            visited_3014 = v;
            goal_3014 = g;
            repaint();
        }

        void reset_3014() {
            visited_3014.clear();
            goal_3014 = "";
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.GRAY);
            for (String a : graph_3014.keySet()) {
                for (String b : graph_3014.get(a)) {
                    Point p1 = pos_3014.get(a);
                    Point p2 = pos_3014.get(b);
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }

            for (String node : pos_3014.keySet()) {
                Point p = pos_3014.get(node);

                if (node.equals(goal_3014))
                    g.setColor(Color.RED);
                else if (visited_3014.contains(node))
                    g.setColor(Color.GREEN);
                else
                    g.setColor(Color.LIGHT_GRAY);

                g.fillOval(p.x - 25, p.y - 25, 50, 50);
                g.setColor(Color.BLACK);
                g.drawOval(p.x - 25, p.y - 25, 50, 50);
                g.drawString(node, p.x - 35, p.y - 30);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PetaFTI_2511533014().setVisible(true));
    }
}

