package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SynchronizedList<Integer> list = new SynchronizedList<>();
        SemaphoreMap<Integer, Integer> map = new SemaphoreMap<>();
        ArrayList<Integer> unsafeList = new ArrayList<>(1000);
        HashMap<Integer, Integer> unsafeMap = new HashMap<>(1000);

        new Thread(() -> {
            for (int i = 0; i < 499; i++) {
                list.add(i);
                map.put(i, i + 1);
                unsafeList.add(i);
                unsafeMap.put(i, i + 1);
            }
        }).start();

        new Thread(() -> {
            for (int i = 499; i < 1000; i++) {
                list.add(i);
                map.put(i, i + 1);
                unsafeList.add(i);
                unsafeMap.put(i, i + 1);
            }        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SynchronizedList size = " + list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("SemaphoreMap size = " + map.size());
        for (Map.Entry entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();

        System.out.println("ArrayList size = " + unsafeList.size());
        System.out.println("HashMap size = " + unsafeMap.size());
    }
}
