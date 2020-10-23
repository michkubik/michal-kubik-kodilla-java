package com.kodilla.good.patterns.challanges;

//interfejs tworzenia użytkownika (?)

public class User {

    String name;
    String userName;

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }
}
