package com.java.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalCreationExample {
    public static void main(String[] args) {
        String str="Vishnu";
        List<String> list=List.of(str,"aaa","bb","ccc","ddd");
        List<String> list1=null;
        System.out.println(list);

        if(str!=null)
            System.out.println(str.toUpperCase());

        //What is Optional
        //Optional class is a container for a value(for an object) that may or may not contain null value.

        Optional<String> optionalStr=Optional.of(str);
        System.out.println(optionalStr);
        System.out.println(optionalStr.isEmpty());
        System.out.println(optionalStr.isPresent());

        Optional<List<String>> optionalListStr=Optional.ofNullable(list);

        Optional<List<String>> optionalListNull=Optional.ofNullable(list1);


        System.out.println(optionalListStr);
        //Converting optionalList into actual List
        //  if(optionalListStr.isPresent())
       // {
            List<String> actualList=optionalListStr.orElse(new ArrayList<>());
            System.out.println("This is the Actual List : "+actualList);
       // }

        List<String> actualNullList=optionalListNull.orElse(new ArrayList<>());
        System.out.println("This is the Actual Null List : "+actualNullList);


        System.out.println(Optional.empty());
        System.out.println(Optional.class);
        //System.out.println(Optional.of(null));

        System.out.println(Optional.ofNullable(null));
        System.out.println(Optional.ofNullable(null).isPresent());
        System.out.println(Optional.ofNullable(null).isEmpty());

        System.out.println(Optional.ofNullable(""));
        System.out.println(Optional.ofNullable("").isPresent());
        System.out.println(Optional.ofNullable("").isEmpty());

        Optional<String> optionalEmpty=Optional.empty();
        System.out.println(optionalEmpty);
        System.out.println(optionalEmpty.get());

    }
}
