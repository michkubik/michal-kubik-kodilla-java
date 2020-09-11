package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(123001, "john", 'm', 1990, 7, 31, 25));
        userList.add(new ForumUser(123002, "steve", 'm', 1976, 10, 2, 26));
        userList.add(new ForumUser(123003, "ann", 'm', 1980, 9, 11, 10));
        userList.add(new ForumUser(123004, "sue", 'f', 2003, 4, 21, 4));
        userList.add(new ForumUser(123005, "eve", 'm', 2001, 6, 5, 36));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
