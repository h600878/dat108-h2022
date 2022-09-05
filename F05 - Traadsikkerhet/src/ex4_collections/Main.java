package ex4_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // En vanlig ArrayList<>()
        List<Integer> list = new ArrayList<>();
        Thread thread1 = new Thread(() -> list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Thread thread2 = new Thread(() -> list.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));

        // En trådsikker ArrayList<>()
        Collection<Integer> syncList = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread3 = new Thread(() -> syncList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Thread thread4 = new Thread(() -> syncList.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Vanlig ArrayList  : " + list);
        // Kan en ArrayList deles og brukes av flere tråder samtidig?

        System.out.println("Wrapped ArrayList : " + syncList);
        // Kan en Collections.synchronizedCollection(new ArrayList<>())
        // deles og brukes av flere tråder samtidig?
    }
}
