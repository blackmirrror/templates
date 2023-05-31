package task1;

import task1.Comparator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student1 = scanner.nextInt();
        int student2 = scanner.nextInt();

        Comparator<Integer> comparator = Integer::compareTo;
        int res = comparator.compare(student1, student2);

        if (res == 0) System.out.println("equals");
        else if (res == -1) System.out.println("first less");
        else System.out.println("first more");
    }
}