package com.example.demo.Model.bean;

import java.util.Date;

public class MedicalRecord {
    private int recordId;
    private int patientId;
    private Date date;
    private String doctor;
    private String diagnosis;
    private String treatment;

    // Constructors, Getters, and Setters


    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    // Example constructor
    public MedicalRecord(int recordId, int patientId, Date date, String doctor, String diagnosis, String treatment) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.date = date;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    // Example getters and setters for each field
    // ...
}
