package com.java.realtimeprojects.collections.sets;

import java.util.*;

public class RemoveDuplicatesFromSentence {
    public static void main(String[] args) {
        String text="This sentence is a sample text to remove the duplicates from the given texts " +
                "using Set which removes duplicates and to count the frequency of words.";
        String[] strArr=text.split(" ");
        System.out.println("The words in the given stentence before removing the duplicates are::");
        System.out.println(Arrays.toString(strArr));
        //another approcah to print string array
//        for(String s:strArr)
//            System.out.println(s);
   //     System.out.println("After removing duplicates:::");
        //Anoter approach to add a string array to the HashSet
//        Set<String> strTextSet=new HashSet<>();
//        for(String s:strArr)
//            strTextSet.add(s);
//        System.out.println(strTextSet);


        System.out.println("The words in the given stentence after removing the duplicates are::");
        Set<String> stringSet=new HashSet<>(List.of(strArr));
        System.out.println(stringSet);

        System.out.println("==============================================================================================");
        System.out.println("The frequency of the words in the given text:::");
        Map<String,Integer> wordFreqMap=new HashMap<>();
//        for(String s:strArr)
//        {
//            int counter=0;
//            if(wordFreqMap.get(s)==null)
//            {
//                counter=1;
//                wordFreqMap.put(s,counter);
//            }
//            else
//            {
//                counter=wordFreqMap.get(s)+1;
//                wordFreqMap.put(s,counter);
//            }
//        }
        //Another approach(Bharath's logic)
        for(String s:strArr)
        {
            if(wordFreqMap.containsKey(s))
            {
                int counter=wordFreqMap.get(s);
                counter++;
                wordFreqMap.put(s,counter);
            }else
                wordFreqMap.put(s,1);
        }
        System.out.println(wordFreqMap);

        System.out.println("==============================================================================================");
        System.out.println("The frequency of the words in the given text in Sorting order using Comparator:::");

        //Using Java 8 Lambda expression for the implementation of the Functional Inerface Comparator
        Comparator<String> compareFreq=(s2,s1)->s1.compareTo(s1);
        //TreeMap internally uses the sorting as Ascending order. We are change it into Descending by using Comparator
        Map<String,Integer> wordFreqSortTreeMap=new TreeMap<>(new ValueCompare(wordFreqMap));
        wordFreqSortTreeMap.putAll(wordFreqMap);
        System.out.println(wordFreqSortTreeMap);
    }
}

class ValueCompare implements Comparator<String>
{
    private Map<String,Integer> map;
    public ValueCompare(Map<String,Integer> map)
    {
        this.map=map;
    }
    @Override
    public int compare(String o1, String o2) {
        int count=map.get(o2).compareTo(map.get(o1));
        if(count==0)
            return 1;
        return count;
    }
}