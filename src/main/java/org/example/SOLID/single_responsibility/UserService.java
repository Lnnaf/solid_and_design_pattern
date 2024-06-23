package org.example.SOLID.single_responsibility;

import org.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    public static UserService INSTANCE;
    private static Map<Integer, User> DATABASE = new HashMap<>();

    public static UserService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserService();
        }
        return INSTANCE;
    }

    public User getUser (int id) {
        return DATABASE.get(id);
    }

    public User createUser (User user) {
        DATABASE.put(user.getId(), user);
        return user;
    }

}
