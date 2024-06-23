package org.example.SOLID.single_responsibility;

import org.example.model.User;

// User controller do not have logic method, this is responsibility of service classes
public class UserController {
    private final UserService userService = UserService.getInstance();

    public User getUser(Integer id) {
        return userService.getUser(id);
    }
    public User createUser(User user) {
        return userService.createUser(user);
    }
}
