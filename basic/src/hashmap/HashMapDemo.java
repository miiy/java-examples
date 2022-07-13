package basic.src.hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> tags = new HashMap<>();
        tags.put(2, "java");
        tags.put(5, "javascript");
        System.out.println(tags);
        System.out.println(tags.size());
        System.out.println(tags.get(2));

        for (Integer k: tags.keySet()) {
            System.out.println("key:" + k + " value:" + tags.get(k));
        }
        for(String v: tags.values()) {
            System.out.println(v);
        }

        tags.remove(2);
        System.out.println(tags);
        tags.clear();
        System.out.println(tags);

        HashMap<String, String> tags2 = new HashMap<>();
        tags2.put("one", "java");
        tags2.put("two", "javascript");
        System.out.println(tags2);
    }
}
