/*
HashSet
HashSet uses a hash table for storage and provides constant-time performance for basic operations like add, remove, and contains.
*/

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate, will not be added

        System.out.println("Unique names: " + uniqueNames);
    }
}
