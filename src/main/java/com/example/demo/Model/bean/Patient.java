package com.example.demo.Model.bean;

import java.util.Date;

public class Patient {
    private int patientId;
    private String username;
    private String password;
    private String fullName;
    private Date dob;
    private String address;

    // Constructors, Getters, and Setters


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Example constructor
    public Patient(int patientId, String username, String password, String fullName, Date dob, String address) {
        this.patientId = patientId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
    }

}
