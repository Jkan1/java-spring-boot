package com.example.Java.App1;

import java.util.*;

/**
 *
 * @author kan
 */
public class DatabaseService {

    private HashMap<String, String> dataStore;

    public DatabaseService() {
        dataStore = new HashMap<>();
        dataStore.put("ronaldo", "Cristiano Ronaldo, Portugese Professional Football Player.");
        dataStore.put("messi", "Lionel Andres Messi, Argentine Professional Football Player.");
    }

    public String search(String q) {
        return dataStore.get(q);
    }
}
