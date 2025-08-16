package com.example.landregistrationbangladesh2.modelClass;


import java.time.LocalDate;

public class LandRegistration {
    private int id;
    private String name;
    private String address;
    private int phoneNo;
    private LocalDate dob;
    private String status;
    private String location;
    private int measure;
    private LocalDate applicationDate;

    public LandRegistration(int id, String name, String address, int phoneNo, LocalDate dob, String location, int measure, LocalDate applicationDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.location = location;
        this.measure = measure;
        this.applicationDate = applicationDate;
        this.status = "N/A";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMeasure() {
        return measure;
    }

    public void setMeasure(int measure) {
        this.measure = measure;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    @Override
    public String toString() {
        return "LandRegistration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                ", dob=" + dob +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                ", measure=" + measure +
                ", applicationDate=" + applicationDate +
                '}';
    }
}
