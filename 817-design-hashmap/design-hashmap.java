class MyHashMap {
private HashMap<Integer, Integer> set;
    public MyHashMap() {
        set = new HashMap<>();

    }
    
    public void put(int key, int value) {
        set.put(key,value);
        
    }
    
    public int get(int key) {
    return set.containsKey(key) ? set.get(key) : -1;
    }
    
    public void remove(int key) {
        set.remove(key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */