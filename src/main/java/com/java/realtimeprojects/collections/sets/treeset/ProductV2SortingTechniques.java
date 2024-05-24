package com.java.realtimeprojects.collections.sets.treeset;

import com.java.realtimeprojects.collections.model.ProductV2;
import com.java.realtimeprojects.collections.utils.ProductUtility;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ProductV2SortingTechniques {
    public static void main(String[] args) {
        List<ProductV2> productV2List= ProductUtility.getProductV2List();

        TreeSet<ProductV2> productV2TreeSet=new TreeSet<>();
        //It throws an error because there is no default Comparator or Comparable implementation for Custom class ProductV2
        //To run this without getting exception is to implement the Comparable interfacr in the class ProductV2
        //We can write only one implementation for Comparable unlike Comparator for only basic one comparision
        productV2TreeSet.addAll(productV2List);
        System.out.println(productV2TreeSet);

        System.out.println("Sorting the products based on the rating::");
        Comparator<ProductV2> ratingComparator=(p1,p2)->p1.getRating().compareTo(p2.getRating());
        productV2TreeSet=new TreeSet<>(ratingComparator);
        productV2TreeSet.addAll(productV2List);
        //System.out.println(productV2TreeSet);
        for(ProductV2 p:productV2TreeSet)
            System.out.println(p);

        System.out.println("==================================================================");
        System.out.println("Sorting the products based on the Price(using Java 8)::");
        Comparator<ProductV2> priceComparator=(p1,p2)->p1.getItemPrice().compareTo(p2.getItemPrice());
        productV2TreeSet=new TreeSet<>(priceComparator);
        productV2TreeSet.addAll(productV2List);
        for(ProductV2 p:productV2TreeSet)
            System.out.println(p);

        //Before Java 8
        System.out.println("==================================================================");
        System.out.println("Sorting the products based on the Price(before Java 8)::");
        PriceComparator priceComparator1=new PriceComparator();
        productV2TreeSet=new TreeSet<>(priceComparator1);
        productV2TreeSet.addAll(productV2List);
        for(ProductV2 p:productV2TreeSet)
            System.out.println(p);

        //Before Java 8
        System.out.println("==================================================================");
        //Using Java 8
        Comparator<ProductV2> timeStampComparator=(p1,p2)->p1.getProductAddedDate().compareTo(p2.getProductAddedDate());
        System.out.println("Sorting the products based on the TimeStamp(before Java 8)::");
        TimeStampComparator timeStampComparator1=new TimeStampComparator();
        productV2TreeSet=new TreeSet<>(timeStampComparator);
        productV2TreeSet.addAll(productV2List);
        for(ProductV2 p:productV2TreeSet)
            System.out.println(p);
    }
}

class PriceComparator implements Comparator<ProductV2>
{

    @Override
    public int compare(ProductV2 product1, ProductV2 product2) {
        return product2.getItemPrice().compareTo(product1.getItemPrice());
    }
}

class TimeStampComparator implements Comparator<ProductV2> {

    @Override
    public int compare(ProductV2 product1, ProductV2 product2) {
        return product1.getProductAddedDate().compareTo(product2.getProductAddedDate());
    }
}