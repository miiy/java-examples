package basic.src.hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("hello");
        System.out.println(words);

        System.out.println(words.size());

        System.out.println(words.contains("hello"));

        for (String i : words) {
            System.out.println(i);
        }


        words.remove("hello");
        System.out.println(words);

        words.clear();
        System.out.println(words);
    }
}
