package com.java.realtimeprojects.collections.utils;

import com.java.realtimeprojects.collections.model.Product;
import com.java.realtimeprojects.collections.model.ProductAppWithArrayList;
import com.java.realtimeprojects.collections.model.ProductV2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductUtility {
    public static List<Product> getProdutList()
    {
        Product product1=new Product(101,"Cooling Fan",19.99);
        Product product2=new Product(102,"Basket Ball",6.99);
        Product product3=new Product(103,"Keypad",59.99);
        Product product4=new Product(104,"Apple Airpods",219.99);
        Product product5=new Product(105,"Apple Pro Vision",99.99);
        Product product6=new Product(106,"Bluetooth Speaker",29.99);

        Product product7=new Product(101,"Cooling Fan",19.99);
        Product product8=new Product(103,"Keypad",59.99);
        Product product9=new Product(105,"Apple Pro Vision",99.99);
        Product product10=new Product(107,"Basket Ball Hoop",109.99);

        List<Product> productList=new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);

        return productList;
    }

    public static List<ProductV2> getProductV2List()
    {
        ProductV2 prod1=new ProductV2(101,"Apple Bluetooth Speaker",229.99,100,4.3, LocalDateTime.of(2019,9,15,11,33,00));
        ProductV2 prod2=new ProductV2(102,"Apple Airpods",299.99,200,3.8, LocalDateTime.of(2021,9,20,10,45,00));
        ProductV2 prod3=new ProductV2(103,"Logitech Mouse",110.99,900,4.5, LocalDateTime.of(2024,5,15,10,33,00));
        ProductV2 prod4=new ProductV2(104,"Keyboard",59.99,500,4.7, LocalDateTime.of(2018,11,25,11,33,00));
        ProductV2 prod5=new ProductV2(105,"MI Power Bank",209.99,80,3.6, LocalDateTime.of(2022,8,20,9,33,00));
        ProductV2 prod6=new ProductV2(106,"Stylus Pen",219.99,110,4.8, LocalDateTime.of(2018,7,29,11,33,00));
        ProductV2 prod7=new ProductV2(107,"Webcam",59.99,200,3.2, LocalDateTime.of(2023,3,11,11,33,00));
        ProductV2 prod8=new ProductV2(108,"Charger",69.99,100,4.4, LocalDateTime.of(2020,7,15,11,33,00));

//        List<ProductV2> productV2List=new ArrayList<>();
//        productV2List.add(prod1);
//        productV2List.add(prod2);
//        productV2List.add(prod3);
//        productV2List.add(prod4);
//        productV2List.add(prod5);
//        productV2List.add(prod6);
//        productV2List.add(prod7);
//        productV2List.add(prod8);
//
//        return productV2List;
        return List.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8);
    }

}
