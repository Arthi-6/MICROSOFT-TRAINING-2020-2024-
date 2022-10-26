class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+ 1);
        
        PriorityQueue<Character> heap = new PriorityQueue<>((a, b)-> map.get(b) - map.get(a));
        
        for(char c : map.keySet()){
                heap.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!heap.isEmpty()){
            char c = heap.remove();
            int count = map.get(c);
            for(int i = 0; i < count; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
