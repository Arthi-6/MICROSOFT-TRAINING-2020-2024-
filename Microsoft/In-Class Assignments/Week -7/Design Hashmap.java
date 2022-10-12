class MyHashMap {
    public class Node{
        int key;
        int value;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    ArrayList<Node>[] arr;
    public MyHashMap(){
        arr = new ArrayList[1000001];
    }
    
    public void put(int key, int value) {
        int index=key/100;
        if(arr[index]==null){
            arr[index] = new ArrayList<Node>();
            arr[index].add(new Node(key,value));
            return;
        }
        else{
           for(Node e : arr[index]){
               if(e.key==key){
                   e.value=value;
                   return;
               }
           } 
           arr[index].add(new Node(key,value));
        }
    }
    
    public int get(int key) {
        int index = key/100;
        if(arr[index]==null){
            return -1;
        }
        for(Node e : arr[index]){
            if(e.key==key){
                return e.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key/100;
        if(arr[index]==null){
            return;
        }
        for(Node e: arr[index]){
            if(e.key==key){
                arr[index].remove(e);
                return;
            }
        }
    }
}
