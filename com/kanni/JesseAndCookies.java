package com.kanni;

import java.util.*;
import java.util.stream.Collectors;

//get it  from  google
public class JesseAndCookies {

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int i = cookies(9, Arrays.stream(arr).boxed().collect(Collectors.toList()));
        System.out.println(i);
    }

    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(A);
        int i = 0;
        while (queue.size() >= 2 && queue.peek() < k) {
            queue.add(queue.poll() + 2 * queue.poll());
            i++;
        }
        return queue.peek() >= k ? i : -1;
    }
}