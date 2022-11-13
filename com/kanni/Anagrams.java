package com.kanni;

public class Anagrams {
    public static void main(String[] args) {

        String first = "deal";
        String second = "lead";
        Anagrams nm = new Anagrams();
        System.out.println(nm.approach2(first,second));
    }

    boolean approach2(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            int m[] = new int[26];
            int n[] = new int[26];
            for (char c : a.toCharArray()) {
                m[c - 'a']++;
            }

            for (char c : b.toCharArray()) {
                n[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (m[i] != n[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
