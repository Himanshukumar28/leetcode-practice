class MyHashMap {
    class Node {
        int key;
        int value;
        Node next;

        Node(int key , int value){
            this.key =key;
            this.value = value;
        }
    }
    private Node[] buckets;
    private int size = 1000;

    public MyHashMap() {
        buckets = new Node[size];
    }
    private int hash(int key) {
        return key % size;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        Node curr = buckets[index];

        // Check if key already exists
        while (curr != null) {

            if (curr.key == key) {
                curr.value = value;
                return;
            }

            curr = curr.next;
        }

        // Key doesn't exist → insert new node
        Node newNode = new Node(key, value);

        newNode.next = buckets[index];
        buckets[index] = newNode;
    }
    
    public int get(int key) {
        int index = hash(key);

        Node curr = buckets[index];

        while (curr != null) {

            if (curr.key == key) {
                return curr.value;
            }

            curr = curr.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);

        Node curr = buckets[index];
        Node prev = null;

        while (curr != null) {

            if (curr.key == key) {

                if (prev == null) {
                    // Removing first node
                    buckets[index] = curr.next;
                } else {
                    // Removing middle/last node
                    prev.next = curr.next;
                }

                return;
            }

            prev = curr;
            curr = curr.next;
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */