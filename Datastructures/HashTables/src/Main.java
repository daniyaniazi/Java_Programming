import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "Jill");
        map.put(3, "Mike");
        map.put(1, "Jhon"); //overwrite
        map.remove(2);
        String mapValue = map.get(1);
        System.out.println(mapValue);
        System.out.println(map);
        System.out.println(map.containsKey(2)); // O(1)
        System.out.println(map.containsValue("Mike")); //O(n)

        // for (var item : map); //error - for loops canot run on hashmap
        for (Object item : map.keySet()) {
            System.out.println(item); //O(n)
        }

//       SETS
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 4, 5, 5, 3, 24, 3, 4, 3, 6};

        for (int num:numbers) {
        set.add(num);
        }
        System.out.println(set);
    }
}