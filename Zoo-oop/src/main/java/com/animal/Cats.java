package com.animal;

import java.time.ZonedDateTime;

public class Cats extends BaseAnimal {
    private String medicine;

    public Cats(ZonedDateTime feedSchedule, String medicine) {
        super.setFeedSchedule(feedSchedule);
        super.setMedicine(medicine);
    }

    @Override
    public void feed() {
        System.out.println("Feeding cats at " + super.getFeedSchedule());
    }

    @Override
    public void takeMedicine(String medicine) {
        System.out.println("Cats take " + super.getMedicine() + " medicine at " + super.getDosage() + " dosage.");
    }
}
