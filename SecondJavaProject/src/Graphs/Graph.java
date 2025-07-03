package Graphs;

import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.*;

public class Graph {

    public static void printDFSHelper(int edges[][], int sv, boolean visited[]) {
        System.out.println(sv);
        visited[sv] = true;
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                printDFSHelper(edges, i, visited);
            }
        }
    }

    public static void printDFS(int edges[][]) {
        boolean visited[] = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                printDFSHelper(edges, i, visited);
            }
        }
    }

    public static void printBFSHelper(int edges[][], int sv, boolean visited[]) {
        int n = edges.length;
        QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();
        q.enqueue(sv);
        visited[sv] = true;
        while (!q.isEmpty()) {
            int front;
            try {
                front = q.dequeue();
            } catch (Exception e) {
                return;
            }
            System.out.println(front);
            for (int i = 0; i < n; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    q.enqueue(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void printBFS(int edges[][]) {
        boolean visited[] = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                printBFSHelper(edges, i, visited);
            }
        }
    }

    public static boolean hashPathDFS(int[][] edges, int sv, int ev) {
        boolean[] visited = new boolean[edges.length];
        return hashPathDFS(edges, sv, ev, visited);
    }

    public static boolean hashPathDFS(int[][] edges, int sv, int ev, boolean[] visited) {
        if (sv == ev) return true;
        visited[sv] = true;
        for (int i = 0; i < edges.length; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                if (hashPathDFS(edges, i, ev, visited))
                    return true;
            }
        }
        return false;
    }

    public static boolean hashPathBFS(int[][] edges, int sv, int ev) {
        boolean[] visited = new boolean[edges.length];
        return hashPathBFS(edges, sv, ev, visited);
    }

    public static boolean hashPathBFS(int[][] edges, int sv, int ev, boolean[] visited) {
        if (sv == ev) return true;

        QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();
        q.enqueue(sv);
        visited[sv] = true;

        while (!q.isEmpty()) {
            int front;
            try {
                front = q.dequeue();
            } catch (Exception e) {
                return false;
            }
            if (front == ev) return true;
            for (int i = 0; i < edges.length; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    q.enqueue(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }

    public static List<Integer> getPathDFS(int[][] edges, int sv, int ev) {
        boolean[] visited = new boolean[edges.length];
        return getPathDFS(edges, sv, ev, visited);
    }

    public static List<Integer> getPathDFS(int[][] edges, int sv, int ev, boolean[] visited) {
        if (sv == ev) {
            List<Integer> path = new ArrayList<>();
            path.add(ev);
            return path;
        }
        visited[sv] = true;
        for (int i = 0; i < edges.length; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                List<Integer> path = getPathDFS(edges, i, ev, visited);
                if (path != null) {
                    path.add(0, sv);
                    return path;
                }
            }
        }
        return null;
    }

    public static List<Integer> getPathBFS(int[][] edges, int sv, int ev) {
        boolean[] visited = new boolean[edges.length];
        Map<Integer, Integer> parentMap = new HashMap<>();
        QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();

        q.enqueue(sv);
        visited[sv] = true;
        parentMap.put(sv, -1);

        while (!q.isEmpty()) {
            int front;
            try {
                front = q.dequeue();
            } catch (Exception e) {
                return null;
            }

            if (front == ev) {
                // Reconstruct the path
                List<Integer> path = new ArrayList<>();
                int current = ev;
                while (current != -1) {
                    path.add(0, current);
                    current = parentMap.get(current);
                }
                return path;
            }

            for (int i = 0; i < edges.length; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    q.enqueue(i);
                    visited[i] = true;
                    parentMap.put(i, front);
                }
            }
        }
        return null;
    }

    public static boolean isConnected(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        dfs(edges, 0, visited);
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }
    private static void dfs(int[][] edges, int sv, boolean[] visited) {
        visited[sv] = true;
        for (int i = 0; i < edges.length; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                dfs(edges, i, visited);
            }
        }
    }

    public static boolean isConnectedBFS(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();
        q.enqueue(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int front;
            try {
                front = q.dequeue();
            } catch (Exception e) {
                return false;
            }
            for (int i = 0; i < edges.length; i++) {
                if (edges[front][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.enqueue(i);
                }
            }
        }
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }

    public static List<List<Integer>> getAllConnectedComponents(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        List<List<Integer>> allComponents = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                collectComponentDFS(edges, i, visited, component);
                allComponents.add(component);
            }
        }
        return allComponents;
    }
    private static void collectComponentDFS(int[][] edges, int sv, boolean[] visited, List<Integer> component) {
        visited[sv] = true;
        component.add(sv);
        for (int i = 0; i < edges.length; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                collectComponentDFS(edges, i, visited, component);
            }
        }
    }

    public static List<List<Integer>> getAllConnectedComponentsBFS(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        List<List<Integer>> allComponents = new ArrayList<>();

        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                List<Integer> components = new ArrayList<>();
                QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();
                q.enqueue(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    try {
                        int front = q.dequeue();
                        components.add(front);
                        for (int j = 0; j < edges.length; j++) {
                            if (edges[front][j] == 1 && !visited[j]) {
                                q.enqueue(j);
                                visited[j] = true;
                            }
                        }
                    } catch (Exception e) {

                    }
                }
                Collections.sort(components);
                allComponents.add(components);
            }
        }
        return allComponents;
    }

    public static void main(String[] args) {
        int n;
        int e;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        e = s.nextInt();
        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        System.out.println("-----------------------");
        printDFS(edges);
        System.out.println("-----------------------");
        printBFS(edges);
        System.out.println("SV : ");
        int sv = s.nextInt();
        System.out.println("EV : ");
        int ev = s.nextInt();
        System.out.println(sv + " hasPathDFS with " + ev + " : " + hashPathDFS(edges, sv, ev));
        System.out.println(sv + " hasPathBFS with " + ev + " : " + hashPathBFS(edges, sv, ev));
        System.out.println("Get PathsDFS From " + sv + " to " + ev + " : " + getPathDFS(edges, sv, ev));
        System.out.println("Get PathsBFS From " + sv + " to " + ev + " : " + getPathBFS(edges, sv, ev));
        System.out.println("Graph isConnectedDFS : " + isConnected(edges));
        System.out.println("Graph isConnectedBFS : " + isConnectedBFS(edges));
    }
}
