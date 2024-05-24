package com.java.realtimeprojects.collections.sets.treeset;

import com.java.realtimeprojects.collections.model.Product;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class TreeSetComparatorExample {
    public static void main(String[] args) {
        TreeSet<String> productTreeSet=new TreeSet<>();
        productTreeSet.add("Product 04");
        productTreeSet.add("Product 10");
        productTreeSet.add("Apple Airpods");
        productTreeSet.add("Product 07");
        productTreeSet.add("Product 01");

        System.out.println(productTreeSet);
        System.out.println("Sorting the products in the descending order::");

        //Comparator<String> descComparator=(productName1,productName2)->productName2.compareTo(productName1);
        Comparator<String> descComparator=new Comparator<String>() {
            @Override
            public int compare(String productName1, String productName2) {
                return productName2.compareTo(productName1);
            }
        };

        TreeSet<String> descProductsTreeSet=new TreeSet<>(descComparator);
        descProductsTreeSet.addAll(productTreeSet);
        System.out.println(descProductsTreeSet);

        Comparator<String> lengthComparator= new Comparator<String>() {
            @Override
            public int compare(String prod1, String prod2) {
                int compare=(prod1.length())-(prod2.length());
                if(compare==0)
                    return 1;
                return compare;
            }
        };
        Comparator<String> lengthComparator1= (prod1,prod2)->(prod1.length()-prod2.length())==0?1:prod2.length()-prod1.length();
        TreeSet<String> lengthProductsTreeSet=new TreeSet<>(lengthComparator);
        lengthProductsTreeSet.addAll(productTreeSet);
        System.out.println(lengthProductsTreeSet);
    }
    }

