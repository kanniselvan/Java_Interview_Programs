package com.kanni;

import java.util.*;

public class CountSentence {

    public static void main(String arg[]){


        List<String> sentence=new ArrayList<>();

        sentence.add("he is fine");
        sentence.add("she was fine");
        sentence.add("it is wel");
        sentence.add("it was lew");

        List<String> words=new ArrayList<>();
        words.add("is");   words.add("si");
        words.add("it");  words.add("wel");
        words.add("ti");  words.add("elw");

        List<Long> countOfWays=countSentence(words,sentence);
        System.out.println("No of way to form sentence :"+ countOfWays);
    }


    private static List<Long> countSentence(List<String> words, List<String> sentence) {
        List<Long> result=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.size();i++){
            int count=0;
            for(int j=0;j<words.size();j++){
                if(anagram(words.get(i),words.get(j)))
                    count++;
            }
            map.put(words.get(i),count);
        }
        System.out.println(sentence);
        System.out.println(map);

        sentence.stream().forEach(e->{
            String[] sen=e.split("\\s+");
            long temp=1;
            if(null!=sen && sen.length>0){
                for(int k=0;k<sen.length;k++){
                 //   System.out.println(sen[k]);
                    int val=map.getOrDefault(sen[k],1);
                    temp=temp*val;
                }

            }
            result.add(temp);
        });

        return result;
    }

    private static boolean anagram(String str1, String str2) {
        if(null!=str1 && null!=str2 && str1.trim().length()>0 && str2.trim().length()>0){
            str1=str1.replaceAll("\\s+","");
            str2=str2.replaceAll("\\s+","");
            if(str1.length() != str2.length()){
                return false;
            }else{
                char[] char1=str1.toLowerCase().toCharArray();
                char[] char2=str2.toLowerCase().toCharArray();
                Arrays.sort(char1);
                Arrays.sort(char2);
                return Arrays.equals(char1,char2);
            }
        }
        return false;
    }
}
