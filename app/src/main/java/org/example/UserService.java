package org.example;

public class UserService {
    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public User createUser(String Username, String Password, PasswordRepo pwdRepo){
        return null;
    }

    
}
