package basic.src.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> tags = new LinkedList<>();
        tags.add("java");
        tags.add("javascript");
        System.out.println(tags);

        tags.addFirst("c");
        System.out.println(tags);

        tags.addLast("c++");
        System.out.println(tags);

        tags.removeFirst();
        System.out.println(tags);

        tags.removeLast();
        System.out.println(tags);

        System.out.println(tags.getFirst());
        System.out.println(tags.getLast());

        for (int size = tags.size(), i = 0; i < size; i++) {
            System.out.println(tags.get(i));
        }

        for (String i: tags) {
            System.out.println(i);
        }
    }
}
