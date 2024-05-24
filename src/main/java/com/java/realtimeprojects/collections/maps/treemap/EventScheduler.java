package com.java.realtimeprojects.collections.maps.treemap;

import java.util.Map;
import java.util.TreeMap;

public class EventScheduler {
    public static void main(String[] args) {
        Map<Long,String> eventScheduleMap=new TreeMap<>();

        eventScheduleMap.put(System.currentTimeMillis() + 120000, "Presentation");
        eventScheduleMap.put(System.currentTimeMillis() + 60000, "Meeting");
        eventScheduleMap.put(System.currentTimeMillis() + 300000, "Lunch");

        for(Map.Entry<Long,String> entry: eventScheduleMap.entrySet())
                System.out.println(entry.getValue()+" :: "+entry.getKey());

    }
}
