import java.util.LinkedList;
import java.util.Iterator;

class Graph {
  private int V;
  private LinkedList<Integer> adj[];
  Graph(int v) {
    V=v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      adj[i] = new LinkedList();
    }
  }

  public void insert(int v, int w) {
    adj[v].add(w);
  }

  public void bfs(int s){
    boolean[] visited = new boolean[V];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[s]=true;
    queue.add(s);
    while(queue.size()!=0){
      s=queue.poll();
      System.out.print(s+" ");
      Iterator <Integer> i = adj[s].listIterator();
      while(i.hasNext()){
        int n = i.next();
        if(!visited[n]){
          visited[n]=true;
          queue.add(n);
        }
      }
    }
  }
  public static void main(String[] args) {
    
    Graph g = new Graph(4);
 
        g.insert(0, 1);
        g.insert(0, 2);
        g.insert(1, 2);
        g.insert(2, 0);
        g.insert(2, 3);
        g.insert(3, 3);
        g.bfs(2);
  }
}
