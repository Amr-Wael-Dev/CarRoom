package com.example.carroom;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private boolean isLoggedIn;

    User() {
        this.id = this.name = this.email = this.password = "";
        this.isLoggedIn = false;
    }

    User(String name, String email, String password, boolean isLoggedIn) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
