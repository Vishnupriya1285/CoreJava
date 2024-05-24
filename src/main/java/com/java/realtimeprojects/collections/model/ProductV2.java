package com.java.realtimeprojects.collections.model;

import java.time.LocalDateTime;
import java.util.Comparator;

public class ProductV2 extends Product implements Comparable<ProductV2> {
    protected Integer quantity;
    protected Double rating;
    protected LocalDateTime productAddedDate;

    public ProductV2(int itemId, String itemName, double itemPrice, Integer quantity, Double rating, LocalDateTime productAddedDate) {
        super(itemId, itemName, itemPrice);
        this.quantity = quantity;
        this.rating = rating;
        this.productAddedDate = productAddedDate;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public LocalDateTime getProductAddedDate() {
        return productAddedDate;
    }
    public void setProductAddedDate(LocalDateTime productAddedDate) {
        this.productAddedDate = productAddedDate;
    }
    @Override
    public String toString() {
        return "ProductV2{" +
                "quantity=" + quantity +
                ", rating=" + rating +
                ", productAddedDate=" + productAddedDate +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    @Override
    public int compareTo(ProductV2 o) {
        return o.getRating().compareTo(this.getRating());
    }
}

