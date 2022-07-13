package basic.src.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        Swimming s1 = () -> {
            System.out.println("1 swimming...");
        };
        go(s1);

        go(() -> {
            System.out.println("2 swimming...");
        });
    }

    public static void go(Swimming s) {
        System.out.println("begin");
        s.swim();
        System.out.println("finish");
    }
}

@FunctionalInterface
interface Swimming {
    void swim();
}