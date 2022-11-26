import java.util.LinkedList;

public class HashTableLL {

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {

        Entry entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }
        LinkedList<Entry> bucket = getOrCreateBucket(key);
        System.out.println(bucket);
        bucket.add(new Entry(key, value));
//        int index = hash(key); // 0,1,2,3
//        // Entries
//        // | 0 |->null
//        // | 1 |-> [Entry->Entry] <- linked list
//        // | 2 |
//        if (entries[index] == null) {
//            entries[index] = new LinkedList<>();
//        }
//        // update entry with same key eg: 89
//        LinkedList<Entry> bucket = entries[index];
//        for (Entry entry : bucket) {
//            if (entry.key == key) {
//                entry.value = value;
//                return;
//            }
//        }
//        Entry entry = new Entry(key, value);
//        bucket.addLast(entry); //| 0 |->[Entry]
    }

    private int hash(int key) {
        return key % entries.length;
    }

    public String get(int key) {

        Entry entry = getEntry(key);
        return (entry == null) ? null : entry.value;

//        int index = hash(key);
//        LinkedList<Entry> bucket = entries[index];
//        if (bucket != null)
//            for (Entry entry : bucket)
//                if (entry.key == key)
//                    return entry.value;
//
//        return null;
    }

    public void remove(int key) {
        Entry entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);


//        int index = hash(key);
//        LinkedList<Entry> bucket = entries[index];
//        if (bucket == null)
//            throw new IllegalStateException();
//        for (Entry entry : bucket) {
//            if (entry.key == key) {
//                //REMOVE
//                bucket.remove(entry);
//                return;
//            }
//        }
//        throw new IllegalStateException();

    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if (bucket == null) {
            entries[index] = new LinkedList<Entry>();
            bucket = entries[index];
        }
        return bucket;
    }

    private Entry getEntry(int key) {
        LinkedList<Entry> bucket = getBucket(key);
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key == key) {
                    return entry;
                }
            }
        }
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
