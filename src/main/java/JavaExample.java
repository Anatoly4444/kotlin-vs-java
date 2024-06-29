import lombok.NonNull;

public class JavaExample {
    private static void method2(@NonNull String name) {
        System.out.println(name.toUpperCase());
    }

    public static void method1(String s) {
        // no compile time error
        method2(s);
    }
}
