package com.example.landregistrationbangladesh2.modelClass;

import java.time.LocalDate;

public class Payment {
    private int applicationId;
    private float regFee;
    private String name;
    private int mobile;
    private LocalDate paymentDate;
    private String method;

    public Payment(int applicationId, float regFee, String name, int mobile, LocalDate paymentDate, String method) {
        this.applicationId = applicationId;
        this.regFee = regFee;
        this.name = name;
        this.mobile = mobile;
        this.paymentDate = paymentDate;
        this.method = method;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public float getRegFee() {
        return regFee;
    }

    public void setRegFee(float regFee) {
        this.regFee = regFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "applicationId=" + applicationId +
                ", regFee=" + regFee +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", paymentDate=" + paymentDate +
                ", method='" + method + '\'' +
                '}';
    }
}
