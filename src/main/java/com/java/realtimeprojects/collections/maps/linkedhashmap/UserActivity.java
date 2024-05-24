package com.java.realtimeprojects.collections.maps.linkedhashmap;

import java.util.*;

public class UserActivity {
    private static Map<String, String> userActivityLogs = new HashMap<>();
    private static Map<String, List<String>> userDetailedActivityLogs = new HashMap<>();

    public void logActivity(String user, String activity) {
        userActivityLogs.put(user, activity);
    }

    public void displayActivityLogs() {

//        userActivityLogs.entrySet();
//        Set<String> keys = userActivityLogs.keySet();
//        Collection<String> values = userActivityLogs.values();

        for(Map.Entry<String, String> userActivityLog : userActivityLogs.entrySet()) {
            System.out.println(userActivityLog.getKey() + " :: "+ userActivityLog.getValue());
        }
    }

    public void logDetailedActivity(String user, String activity) {

        if(userDetailedActivityLogs.containsKey(user)) {
            List<String> userActivities = userDetailedActivityLogs.get(user);
            userActivities.add(activity);
        } else {
            List<String> userActivityList = new ArrayList<>();
            userActivityList.add(activity);
            userDetailedActivityLogs.put(user, userActivityList);
        }
    }

    public void displayDetailedActivityLogs(String user) {
        System.out.println("========================================================");
        if(userDetailedActivityLogs.containsKey(user)) {
            List<String> userActivityLogs = userDetailedActivityLogs.get(user);
            for(String activity : userActivityLogs) {
                System.out.println(user + ":: "+ activity);
            }
        } else {
            System.out.println("User not Found.");
        }

    }

    public void displayDetailedActivityLogs() {
        System.out.println("========================================================");
        for(Map.Entry<String, String> userActivityLog : userActivityLogs.entrySet()) {
            System.out.println(userActivityLog.getKey() + " :: "+ userActivityLog.getValue());
        }
    }

    public static void main(String[] args) {

        UserActivity userActivity = new UserActivity();

        userActivity.logActivity("User1", "Logged In");
        userActivity.logActivity("User2", "Viewed Profile");
        userActivity.logActivity("User1", "Logged Out");
        userActivity.logActivity("User4", "Updated Settings");

        userActivity.displayActivityLogs();

        userActivity.logDetailedActivity("User1", "Logged In");
        userActivity.logDetailedActivity("User1", "Viewed Profile");
        userActivity.logDetailedActivity("User1", "Visited Dashboard");
        userActivity.logDetailedActivity("User1", "Logged Out");

        userActivity.logDetailedActivity("User2", "Logged In");
        userActivity.logDetailedActivity("User3", "Viewed Profile");
        userActivity.logDetailedActivity("User4", "Visited Dashboard");
        userActivity.logDetailedActivity("User4", "Logged Out");

        userActivity.logDetailedActivity("User2", "Logged Out");
        userActivity.logDetailedActivity("User3", "Updated Settings");
        userActivity.logDetailedActivity("User4", "Logged In");

        userActivity.displayDetailedActivityLogs("User1");
        userActivity.displayDetailedActivityLogs("User2");
        userActivity.displayDetailedActivityLogs("User3");
        userActivity.displayDetailedActivityLogs("User4");
    }
}
