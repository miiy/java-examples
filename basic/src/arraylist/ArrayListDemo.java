package basic.src.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add(123);
        list.add(false);
        System.out.println(list);
        list.add(1, "java");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
//        list2.add(123);
        System.out.println(list2);

        System.out.println('\n');
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
