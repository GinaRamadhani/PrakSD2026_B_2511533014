package pekan9_2511533014;
import java.util.*;
public class GraphTraversal_2511533014 {
	    private Map<String, List<String>> graph_3014 = new HashMap<>();

	    // Menambahkan edge (graf tak berarah)
	    public void addEdge_3014(String node1_3014, String node2_3014) {
	        graph_3014.putIfAbsent(node1_3014, new ArrayList<>());
	        graph_3014.putIfAbsent(node2_3014, new ArrayList<>());
	        graph_3014.get(node1_3014).add(node2_3014);
	        graph_3014.get(node2_3014).add(node1_3014);
	    }

	    // Menampilkan graf awal
	    public void printGraph_3014() {
	        System.out.println("Graf Awal (Adjacency List):");
	        for (String node_3014 : graph_3014.keySet()) {
	            System.out.print(node_3014 + " -> ");
	            List<String> neighbors_3014 = graph_3014.get(node_3014);
	            System.out.println(String.join(", ", neighbors_3014));
	        }
	        System.out.println();
	    }

	    // DFS rekursif
	    public void dfs_3014(String start_3014) {
	        Set<String> visited_3014 = new HashSet<>();
	        System.out.println("Penelusuran DFS:");
	        dfsHelper_3014(start_3014, visited_3014);
	        System.out.println();
	    }
	    private void dfsHelper_3014(String current_3014, Set<String> visited_3014) {
	        if (visited_3014.contains(current_3014))
	            return;
	        visited_3014.add(current_3014);
	        System.out.print(current_3014 + " ");
	        for (String neighbor_3014 :
	                graph_3014.getOrDefault(current_3014, new ArrayList<>())) {
	            dfsHelper_3014(neighbor_3014, visited_3014);
	     }
	        }
	     // BFS iteratif
	        public void bfs_3014(String start_3014) {
	            Set<String> visited_3014 = new HashSet<>();
	            Queue<String> queue_3014 = new LinkedList<>();
	            queue_3014.add(start_3014);
	            visited_3014.add(start_3014);
	            System.out.println("Penelusuran BFS:");
	            while (!queue_3014.isEmpty()) {
	                String current_3014 = queue_3014.poll();
	                System.out.print(current_3014 + " ");
	                for (String neighbor_3014 :  graph_3014.getOrDefault(current_3014, new ArrayList<>())) {        
	                    if (!visited_3014.contains(neighbor_3014)) {
	                        queue_3014.add(neighbor_3014);
	                        visited_3014.add(neighbor_3014);
	                    }
	                }
	            }
	            System.out.println();
	        }
	        // Main
	        public static void main(String[] args_3014) {
	            GraphTraversal_2511533014 graph_3014 = new GraphTraversal_2511533014();

	            // Contoh graf: A-B, A-C, B-D, B-E
	            graph_3014.addEdge_3014("A", "B");
	            graph_3014.addEdge_3014("A", "C");
	            graph_3014.addEdge_3014("B", "D");
	            graph_3014.addEdge_3014("B", "E");

	            // Cetak graf awal
	            System.out.println("Graf Awal adalah:");
	            graph_3014.printGraph_3014();

	            // Lakukan penelusuran
	            graph_3014.dfs_3014("A");
	            graph_3014.bfs_3014("A");
	        }
	    }
	
	


