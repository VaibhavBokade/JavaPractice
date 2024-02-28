package org.example.map;

import org.example.map.MapProblem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("Employee_First_name","Kuldeep");
        map.put("Employee_Last_name", "Kamble");
        map.put("Employee_Age",25);
        Map<String, Object> modifiedMap = MapProblem.replace(map);

        for (Map.Entry<String,Object> value: modifiedMap.entrySet()) {
            System.out.println(value.getKey()+ " :: " + value.getValue());
        }

        LocalTime departureTime = MapProblem.getDepartureTime("Pune", "Yavatmal",LocalTime.of(7,0));
        System.out.println(departureTime);

        for(String key: map.keySet()) {
            Object value = map.get(key);
            System.out.println(key+"::"+value);
        }

        for(Object val : map.values()) {
            System.out.println(val);
        }
    }
}