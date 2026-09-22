package dev.coding_test.day01;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class day14_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

    }
}
