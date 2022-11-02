class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean[] visited = new boolean[100];
        boolean[] colour = new boolean[100];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(visited[i]==true){
               continue;
            }
            queue.add(i);
            visited[i] = true;
            colour[i] = true;
            while(!queue.isEmpty()){
                int val = queue.poll();
                for(Integer neighbor : graph[val]){
                    if(!visited[neighbor]){
                        queue.add(neighbor);
                        visited[neighbor] = true;
                        colour[neighbor] = !colour[val];
                    }
                    else if(colour[neighbor]==colour[val]){
                        return false;
                    } 
                }
            }
        }
        return true;
    }
}
