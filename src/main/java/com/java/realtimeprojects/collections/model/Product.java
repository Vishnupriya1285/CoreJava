package com.java.realtimeprojects.collections.model;

import java.util.Objects;

public class Product {
    protected int itemId;
    protected String itemName;
    protected Double itemPrice;

    public Product(int itemId, String itemName, Double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getItemId() == product.getItemId() && Double.compare(product.getItemPrice(), getItemPrice()) == 0 && Objects.equals(getItemName(), product.getItemName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemId(), getItemName(), getItemPrice());
    }
}
