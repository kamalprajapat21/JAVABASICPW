/*
 * In Java, HashMap is part of the Java Collections Framework and is found in the java.util package. It provides the basic implementation of the Map interface in Java. HashMap stores data in (key, value) pairs. Each key is associated with a value, and you can access the value by using the corresponding key.

Internally uses Hashing (similar to Hashtable in Java).
Not Synchronized (unlike Hashtable in Java) and hence faster for most of the cases.
Allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.
Duplicate Elements not allowed in HashMap, if you try to insert the duplicate key in HashMap, it will replace the element of the corresponding key. 
HashMap uses keys in same way as Array uses index.
HashMap allows for efficient key-based retrieval, insertion, and removal with average O(1) time complexity.

A HashMap is a data structure that is used to store and retrieve values based on keys. Some of the key characteristics of a hashmap include:

Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved. However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.
Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, which is the measure of how full the hashmap can be before it is resized.
 */

import java.util.*;
class Demo1{
    public static void main(String []args){
        HashMap<Integer,String> hm = new HashMap<>();
            hm.put(1, "Kamal");
            hm.put(2, "Kumar");
            hm.put(3, "Prajapat");

            ///Iterartation ((FOR EACH LOOP))
           for( Map.Entry<Integer,String> e : hm.entrySet()){
System.out.println(e.getKey() + ":"+ e.getValue());
            }
        }
    }
