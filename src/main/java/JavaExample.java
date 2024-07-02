import lombok.NonNull;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class JavaExample {
    private static void method2(@NonNull String name) {
        System.out.println(name.toUpperCase());
    }

    public static void method1(String s) {
        // no compile time error
        method2(s);
    }

    public static void runAsync() {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> task(1));
        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> task(2));
        CompletableFuture<Integer> integerCompletableFuture = task1.thenCombine(task2, Integer::sum);
        integerCompletableFuture.thenAccept(i -> System.out.println("Result is " + i));
    }

    private static int task(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Java Task " + i + " Done");
        return i;
    }
}
