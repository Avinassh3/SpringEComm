package com.lti.project.model;

public class RetailerSignUp {
    private int rId;
    private String uName;
    private String uEmail;
    private String uPassword;
    private int uPhone;

    public RetailerSignUp(int rId, String uName, String uEmail, String uPassword, int uPhone) {
        this.rId = rId;
        this.uName = uName;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uPhone = uPhone;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
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

    public int getuPhone() {
        return uPhone;
    }

    public void setuPhone(int uPhone) {
        this.uPhone = uPhone;
    }
}
