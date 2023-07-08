package com.government.AdharCard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdharUsers {
    public AdharUsers() {
    }

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String fatherName;
    private String motherName;
    private int phNo;
    private int AdharNo;

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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public int getAdharNo() {
        return AdharNo;
    }

    public void setAdharNo(int adharNo) {
        AdharNo = adharNo;
    }

    @Override
    public String toString() {
        return "AdharUsers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", phNo=" + phNo +
                ", AdharNo=" + AdharNo +
                '}';
    }
}
