package com.kanni;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrangeChanllenges {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        long appleCount=apples.stream().map(e->Integer.sum(e, a)).filter(k-> (k >= s) &&  (k <=t) )
                .count();
        long orangeCount=oranges.stream().map(e->Integer.sum(e, b)).filter(k-> (k <= t) && (k >= s) )
                .count();
        System.out.println(appleCount);
        System.out.println(orangeCount);

    }


    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        int s = scanner.nextInt();

        int t = scanner.nextInt();

        int a =scanner.nextInt();

        int b = scanner.nextInt();

        int m = scanner.nextInt();

        int n = scanner.nextInt();

        List<Integer> apples =new ArrayList<>(m);
        List<Integer> oranges =new ArrayList<>(n);

        for (int i=0;i<m;i++)
        apples.add(scanner.nextInt());

        for (int i=0;i<n;i++)
            oranges.add(scanner.nextInt());

        AppleAndOrangeChanllenges.countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}