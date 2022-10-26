class MyHashSet {
	ArrayList<Integer> ar;
    public MyHashSet() {
        ar=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
            ar.add(key);
    }
    
    public void remove(int key) {
        if(contains(key))
            ar.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        for(int num:ar){
            if(num==key)
                return true;
        }
        return false;
    }
}
