import java.util.LinkedList;

public class HashTable {

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        int index = hash(key); // 0,1,2,3
        // Entries
        // | 0 |->null
        // | 1 |-> [Entry->Entry] <- linked list
        // | 2 |
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }
        // update entry with same key eg: 89
        LinkedList<Entry> bucket = entries[index];
        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        Entry entry = new Entry(key, value);
        bucket.addLast(entry); //| 0 |->[Entry]
    }

    private int hash(int key) {
        return key % entries.length;
    }

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
