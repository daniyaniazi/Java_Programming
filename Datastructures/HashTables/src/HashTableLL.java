import java.util.LinkedList;

public class HashTableLL {

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

    public String get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if (bucket != null)
            for (Entry entry : bucket)
                if (entry.key == key)
                    return entry.value;

        return null;
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
