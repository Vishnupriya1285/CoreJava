package org.example.interviewprep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        //find the index of lot
        String exampleOfIndexOf = "Lets check between lots4355e2fwtwtwerwr and l and lot";
        String keyword = "lot";
        //int index=exampleOfIndexOf.indexOf("lot");
        int index=0;
        if(exampleOfIndexOf.endsWith("t"))
           index=exampleOfIndexOf.indexOf("lot");
        System.out.println(index);

//        Pattern pattern = Pattern.compile("\\b"+Pattern.quote(keyword)+"\\b");
//        Matcher matcher = pattern.matcher(exampleOfIndexOf);

//        if(matcher.find()) {
//            int index = matcher.start();
//            System.out.println("Index "+ index);
//        } else {
//            System.out.println("Keyword:: "+ keyword + "  Not Found");
//        }


    }
}
