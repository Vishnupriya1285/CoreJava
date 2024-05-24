package org.example.interviewprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagramExample {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();

        System.out.println(listOfAnagrams(str));
        System.out.println(listOfAnagrams1(str));

    }
        public static List<List<String>> listOfAnagrams(String[] str)
        {
            Map<String,List<String>> map1=new HashMap<>();
            for(String s:str)
            {
                char[] charArr=new char[26];
                for(char c:s.toCharArray())
                    charArr[c-'a']++;
                String key=new String(charArr);
                if(!map1.containsKey(key))
                {
                    map1.put(key,new ArrayList<>());
                }
                map1.get(key).add(s);
            }
            return new ArrayList<>(map1.values());

        }
        //Another way
        public static List<List<String>> listOfAnagrams1(String[] str)
        {
            Map<String,List<String>> map1=new HashMap<>();
            for(String s:str)
            {
                int[] count=new int[26];
                for(char c:s.toCharArray())
                    count[c-'a']++;
                StringBuilder sb=new StringBuilder();
               for(int i=0;i<26;i++)
                {
                    sb.append(count[i]);
                    sb.append("#");
                }
               String key=sb.toString();
               if(!map1.containsKey(key))
               {
                   map1.put(key,new ArrayList<>());
               }
                map1.get(key).add(s);
            }
            return new ArrayList<>(map1.values());

        }
}
