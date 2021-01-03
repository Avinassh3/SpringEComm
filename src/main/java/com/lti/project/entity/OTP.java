package com.lti.project.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OTP implements Serializable {

    @Id
    @Column(name = "otp_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name="otp_value")
    private  int value;

    public OTP() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
