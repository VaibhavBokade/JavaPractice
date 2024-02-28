package org.example.map;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/*
create a method that takes map<String, object> as input and returns a map<String, Object>
and in return map key should be modified such that underscore should be replace with hypens
 */
public class MapProblem {
    //Day_Month_Years
    public static Map<String, Object> replace(Map<String, Object> inputMap) {
        Map<String, Object> modifiedMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String replacedKey = key.replaceAll("_", "-");
            modifiedMap.put(replacedKey, value);
        }
        return modifiedMap;
    }

    public static final Map<String, Integer> departureTime = new HashMap<>();
    static {
        departureTime.put("Pune-Nagpur", 390);
        departureTime.put("Pune-Yavatmal",300);
    }

    public static LocalTime getDepartureTime(String source, String destination, LocalTime arrivelTime) {
        String cityPair = source+"-"+destination;
        Integer orDefault = departureTime.getOrDefault(cityPair,0);
        return arrivelTime.plusMinutes(orDefault);
    }
}
