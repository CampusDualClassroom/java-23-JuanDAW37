package com.campusdual.classroom;

import javax.print.attribute.standard.PrinterLocation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> hashMap = new HashMap<>();

    public static Map<String, Person> createHashMap() {
        Person person = new Person();
        person = addMapValue(hashMap, "person", new Person("John", "Smith"));
        person = addMapValue(hashMap, "teacher", new Teacher("María", "Montessori", "Educación"));
        person = addMapValue(hashMap, "police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        person = addMapValue(hashMap, "doctor",new Doctor("Gregory", "House", "Nefrología e infectología"));
        return hashMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return hashMap.get("police");
    }

    public static void printMapValues(Map<String, Person> map) {
        for(Map.Entry<String, Person> datos: map.entrySet()){
            System.out.print("Key: " + datos.getKey() + " ");
            datos.getValue().getDetails();
        }
    }

    public static void main(String[] args){
        hashMap = createHashMap();
        Person person = addMapValue(hashMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(hashMap);
    }
    
}
