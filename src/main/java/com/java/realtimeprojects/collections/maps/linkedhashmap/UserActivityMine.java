package com.java.realtimeprojects.collections.maps.linkedhashmap;

import java.util.*;

public class UserActivityMine {
    private static Map<String,String> userActivityLog=new LinkedHashMap<>();

    private static Map<String,List<String>> userDetailedActivityLog=new HashMap<>();
    public void userActivityLog(String user,String activity)
    {
        userActivityLog.put(user,activity);
    }
    public void displayActivityLogs()
    {
        for(Map.Entry<String,String> logEntry:userActivityLog.entrySet())
            System.out.println(logEntry.getKey()+" :: "+logEntry.getValue());
    }
    public void userDetailedActivityLog(String user,String activity)
    {
        if(userDetailedActivityLog.containsKey(user))
        {
            List<String> userActivitiesList=userDetailedActivityLog.get(user);
            userActivitiesList.add(activity);
        }else{

            List<String> userActivitiesList=new ArrayList<>();
            userActivitiesList.add(activity);
            userDetailedActivityLog.put(user,userActivitiesList);
        }
    }
    public void displayDetailedActivtiyLogs(String user)
    {
        System.out.println("===============================================");
        if(userDetailedActivityLog.containsKey(user))
        {
            List<String> userActivitiesList=userDetailedActivityLog.get(user);
            for(String s: userActivitiesList)
                System.out.println(user+" :: "+s);
        }
        else{
            System.out.println(user+" not found!");
        }
    }
    public static void main(String[] args) {

        UserActivityMine userActivity = new UserActivityMine();

        userActivity.userActivityLog("User1", "Logged In");
        userActivity.userActivityLog("User2", "Viewed Profile");
        userActivity.userActivityLog("User1", "Logged Out");
        userActivity.userActivityLog("User4", "Updated Settings");

        userActivity.displayActivityLogs();

        userActivity.userDetailedActivityLog("User1", "Logged In");
        userActivity.userDetailedActivityLog("User1", "Viewed Profile");
        userActivity.userDetailedActivityLog("User1", "Visited Dashboard");
        userActivity.userDetailedActivityLog("User1", "Logged Out");

        userActivity.userDetailedActivityLog("User2", "Logged In");
        userActivity.userDetailedActivityLog("User3", "Viewed Profile");
        userActivity.userDetailedActivityLog("User4", "Visited Dashboard");
        userActivity.userDetailedActivityLog("User4", "Logged Out");

        userActivity.userDetailedActivityLog("User2", "Logged Out");
        userActivity.userDetailedActivityLog("User3", "Updated Settings");
        userActivity.userDetailedActivityLog("User4", "Logged In");

        userActivity.displayDetailedActivtiyLogs("User1");
        userActivity.displayDetailedActivtiyLogs("User2");
        userActivity.displayDetailedActivtiyLogs("User3");
        userActivity.displayDetailedActivtiyLogs("User4");
    }
}
