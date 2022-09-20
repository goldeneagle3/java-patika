package com.animal;

import java.time.ZonedDateTime;

public class Horses extends BaseAnimal {
    private String medicine;

    public Horses(ZonedDateTime feedSchedule,String medicine) {
        super.setFeedSchedule(feedSchedule);
        super.setMedicine(medicine);
    }

    @Override
    public void feed() {
        System.out.println("Feeding horses at " + super.getFeedSchedule());
    }

    @Override
    public void takeMedicine(String medicine) {
        System.out.println("Horses take " + super.getMedicine() + " medicine at " + super.getDosage() + " dosage.");
    }
}
