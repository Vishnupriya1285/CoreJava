package com.java.realtimeprojects.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class UserPreferences {
    Map<String,String> preferenceSettings=new HashMap<>();
    public String getPreferenceSettings(String key) {
        return preferenceSettings.get(key);
    }
    public void setPreferenceSettings(String key, String value) {
         preferenceSettings.put(key,value);
     }
    @Override
    public String toString() {
        return "UserPreferences{" +
                "preferenceSettings=" + preferenceSettings +
                '}';
    }

    public static void main(String[] args) {
        UserPreferences userPreferences = new UserPreferences();
        userPreferences.setPreferenceSettings("theme", "dark");
        userPreferences.setPreferenceSettings("language", "english");
        userPreferences.setPreferenceSettings("font", "calibri");

        System.out.println(userPreferences);

    }
}
