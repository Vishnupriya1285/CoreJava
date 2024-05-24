package com.java.java8.staticmethods;

import java.util.List;
import java.util.stream.Collectors;

interface StringUtility
{
    static boolean isStringEmpty(String str)
    {
        return str!=null&&str.length()>0;
    }
    static List<String> filterLongStrings(List<String> inputStrList,int maxLength)
    {
        return inputStrList.stream().filter(s->s.length()<maxLength).collect(Collectors.toList());
    }
}
interface LoggerUtility
{
    static void printMessage(String str)
    {
        System.out.println("Message : "+str);
    }
}

public class StaticMethodInterfaceExample {
    public static void main(String[] args) {
        System.out.println(StringUtility.isStringEmpty("Vishnu"));
        System.out.println(StringUtility.isStringEmpty("Priya"));
        System.out.println(StringUtility.isStringEmpty(null));
        System.out.println(StringUtility.isStringEmpty(" "));
        System.out.println(StringUtility.isStringEmpty(""));

        LoggerUtility.printMessage("Vishnu");
        LoggerUtility.printMessage("Priya");

        List<String> strings=List.of("Apple","Banana","Orange","Peach","Pear");
        System.out.println(StringUtility.filterLongStrings(strings,5));

    }
}
