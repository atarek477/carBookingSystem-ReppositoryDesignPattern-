package com.mycompany.app.user;


import java.util.UUID;

public class User {

    private UUID uuid;
    private String userName;

    public User(String userName) {
        this.userName = userName;
        this.uuid= UUID.randomUUID();
    }

    public User(UUID uuid, String userName) {
        this.uuid = uuid;
        this.userName = userName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", userName='" + userName + '\'' +
                '}';
    }
}
