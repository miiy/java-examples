package basic.src.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append(1);
        sb.append(false);
        System.out.println(sb);

        sb.append("c").append("d");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
