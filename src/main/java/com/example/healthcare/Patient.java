package com.example.healthcare;

public class Patient {
    private int id;
    private String name;
    private String dob;
    private String address;
    private String phone;

    // Constructor
    public Patient(String name, String dob, String address, String phone) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Similarly, add getters and setters for the other fields
}
