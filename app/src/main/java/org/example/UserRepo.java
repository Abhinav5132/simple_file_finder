package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private final List<User> users = new ArrayList<>();

    public void saveUser(User user) {
        if(user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if (users.contains(user)){
            throw new IllegalArgumentException("User already exists");
        }
        users.add(user);
    }

    public User findByUsername(String Username) {
        User user_s = null;
        for (User user: users) {
            if (user.getUsername().equals(Username)) {
                user_s = user;
            }
        }
        return user_s;
    }

    public int count() {
        return users.size();
    }
}
