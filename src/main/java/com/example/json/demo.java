package com.example.json;

public class demo {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private address address;
    private String[] languages;

    public com.example.json.address getAddress() {
        return address;
    }

    public void setAddress(com.example.json.address address) {
        this.address = address;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }

    public demo() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return active;
    }
}
