// 재귀 형태로 DFS 구현
public class dfs {
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

    static void dfs(int v) {
        visited[v] = true;

        sb.append(v + " ");

        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        dfs(1);
        System.out.println(sb);
    }
}

// Stack 자료구조로 DFS 구현