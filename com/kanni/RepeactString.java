package com.kanni;

import java.io.*;

public class RepeactString {

    public static long repeatedString(String s, long n) {
        if(s !=null && s.length()==1 ){
            if(s.charAt(0) == 'a')
                return n;
            else
                return 0;
        }
        long totalOcc = s.chars().map(e -> (char) e).filter(k -> k == 'a').count();

        long k = (n / s.length());
        int r = (int) (n % s.length());

        totalOcc = totalOcc * k;
        if (r > 0) {
            long temp = s.substring(0, r).chars()
                    .map(e -> (char) e)
                    .filter(m -> m == 'a').count();

            totalOcc = totalOcc + temp;
        }


        return totalOcc;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = RepeactString.repeatedString(s, n);

        System.out.println(result);


        bufferedReader.close();

    }

}
