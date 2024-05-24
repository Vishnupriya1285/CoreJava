package com.java.realtimeprojects.collections.sets;

import com.java.realtimeprojects.collections.model.Product;
import com.java.realtimeprojects.collections.utils.ProductUtility;

import java.util.*;

public class RemoveDuplicateProductsFromProducts {
    public static void main(String[] args) {
        List<Product> productList= ProductUtility.getProdutList();

        System.out.println("The list of products before removing the duplicates::");
        System.out.println(productList);

        System.out.println();
        System.out.println("The list of products after removing the duplicates using HashSet::"+"\n");
        Set<Product> productSet=new HashSet<>(productList);
        for(Product e:productSet)
            System.out.println(e);
        System.out.println("\n"+"==========================================================================="+"\n");
        System.out.println("The count of each Product using HashMap::");

        Map<Product,Integer> productMap=new HashMap<>();
        for(Product p:productList)
        {
            if(productMap.containsKey(p))
            {
                int counter=productMap.get(p);
                counter++;
                productMap.put(p,counter);
            }else
                productMap.put(p,1);
        }
        System.out.println(productMap);
    }
}
