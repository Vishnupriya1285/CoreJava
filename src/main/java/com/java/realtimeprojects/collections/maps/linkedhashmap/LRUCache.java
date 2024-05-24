package com.java.realtimeprojects.collections.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int CAPACITY;
    public LRUCache(int capacity)
    {
        super(capacity,0.7f,true);
        this.CAPACITY=capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > CAPACITY;
    }
    public static void main(String[] args) {
        LRUCache<String, Integer> cache = new LRUCache<>(3);

        cache.put("Apple IPhones", 5);
        cache.put("Samsung", 15);
        cache.put("Vision Pro", 10);
        cache.put("Xbox", 7);
        System.out.println(cache);
        cache.put("banana", 90);
        System.out.println(cache);

        cache.get("banana");
        cache.get("Xbox");
        cache.get("Vision Pro");

        cache.get("Samsung");
        System.out.println(cache);
    }
}
