import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static StringBuilder sb = new StringBuilder();

    static boolean[] visited = new boolean[9];

    static int[][] graph =
            {
                    {},
                    {2,3,8},
                    {1,7},
                    {1,4,5},
                    {3,5},
                    {3,4},
                    {7},
                    {2,6,8},
                    {1,7}
            };

    static Queue<Integer> queue = new LinkedList<Integer>();

    static void bfs(int start) {
        queue.offer(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            sb.append(v + " ");
            for (int i : graph[v]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs(1);
        System.out.println(sb);
    }
}