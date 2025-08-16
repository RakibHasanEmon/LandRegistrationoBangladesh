package com.example.landregistrationbangladesh2.modelClass;

import java.time.LocalDate;

public class Mutation {
    private int id;
    private String nameO;
    private String nameN;
    private String address;
    private int mobile;
    private LocalDate dob;
    private LocalDate applicationDate;

    public Mutation(int id, String nameO, String nameN, String address, int mobile, LocalDate dob, LocalDate applicationDate) {
        this.id = id;
        this.nameO = nameO;
        this.nameN = nameN;
        this.address = address;
        this.mobile = mobile;
        this.dob = dob;
        this.applicationDate = applicationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameO() {
        return nameO;
    }

    public void setNameO(String nameO) {
        this.nameO = nameO;
    }

    public String getNameN() {
        return nameN;
    }

    public void setNameN(String nameN) {
        this.nameN = nameN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    @Override
    public String toString() {
        return "Mutation{" +
                "id=" + id +
                ", nameO='" + nameO + '\'' +
                ", nameN='" + nameN + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", dob=" + dob +
                ", applicationDate=" + applicationDate +
                '}';
    }
}
