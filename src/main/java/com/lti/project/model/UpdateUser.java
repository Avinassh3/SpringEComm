package com.lti.project.model;

public class UpdateUser {
    private int uId;
    private String uName;
    private String uEmail;
    private String uPassword;
    private String uAddress;
    private int uMobile;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public int getuMobile() {
        return uMobile;
    }

    public void setuMobile(int uMobile) {
        this.uMobile = uMobile;
    }
}
