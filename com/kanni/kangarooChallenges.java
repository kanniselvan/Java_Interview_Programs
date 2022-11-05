package com.kanni;

import java.io.*;
import java.util.Scanner;

public class kangarooChallenges {
    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String result="NO";

        for(int i=1;i<10000;i++){

            if((x1+(i*v1))==(x2+(i*v2))){
                result="YES";
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);

        int x1 = scanner.nextInt();

        int v1 =scanner.nextInt();

        int x2 = scanner.nextInt();

        int v2 = scanner.nextInt();

        String result = kangarooChallenges.kangaroo(x1, v1, x2, v2);

        System.out.println(result);
        scanner.close();
    }
}

