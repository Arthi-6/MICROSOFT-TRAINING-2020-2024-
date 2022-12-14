class Solution {
    Map<Node, Node> map = new HashMap<Node, Node>();
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        if (map.containsKey(node))
            return map.get(node);
    
            Node temp = new Node(node.val, new ArrayList<Node>());
            map.put(node, temp);
            for (Node neighbor : node.neighbors) {
                temp.neighbors.add(cloneGraph(neighbor));
            }
        return map.get(node);
    }
}
