package com.animal;

import java.time.ZonedDateTime;

public abstract class BaseAnimal {
    protected String name;
    protected java.lang.Double weight;
    protected Integer age;
    protected Double dosage;
    protected ZonedDateTime feedSchedule;
    protected String medicine;


    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.lang.Double getWeight() {
        return weight;
    }

    public void setWeight(java.lang.Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public ZonedDateTime getFeedSchedule() {
        return feedSchedule;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public void setFeedSchedule(ZonedDateTime feedSchedule) {
        this.feedSchedule = feedSchedule;
    }

    public abstract void feed();
    public abstract void takeMedicine(String medicine);
}
