package com.java.realtimeprojects.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class RecentlyViewedItemsWithLinkedHashSet {
    public static void main(String[] args) {
        Set<String> recentyViewedItemsSet=new LinkedHashSet<>();
        recentyViewedItemsSet.add("iphone 15");
        recentyViewedItemsSet.add("airpods 2nd generation");
        recentyViewedItemsSet.add("charger");
        recentyViewedItemsSet.add("Solar lights");
        recentyViewedItemsSet.add("birthday decorations");
        recentyViewedItemsSet.add("Birthday banner");
        recentyViewedItemsSet.add("Solar lights");
        System.out.println("You recently viewed:"+recentyViewedItemsSet);
    }
}
