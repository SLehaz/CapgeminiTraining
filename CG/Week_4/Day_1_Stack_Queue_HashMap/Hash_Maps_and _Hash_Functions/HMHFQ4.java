class MyHashMap {
    private static class Entry {
        String key;
        int value;
        Entry next;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 1000;
    private Entry[] table = new Entry[SIZE];

    private int hash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(String key, int value) {
        int idx = hash(key);
        Entry head = table[idx];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = table[idx];
        table[idx] = newEntry;
    }

    public Integer get(String key) {
        int idx = hash(key);
        Entry head = table[idx];

        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }

        return null;
    }

    public void remove(String key) {
        int idx = hash(key);
        Entry head = table[idx];
        Entry prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) table[idx] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("apple", 5);
        map.put("banana", 3);
        System.out.println(map.get("apple"));
        map.remove("apple");
        System.out.println(map.get("apple"));
    }
}