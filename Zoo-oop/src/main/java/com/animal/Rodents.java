package com.animal;

import java.time.ZonedDateTime;

public class Rodents extends BaseAnimal {
    private String medicine;

    public Rodents(ZonedDateTime feedSchedule, String medicine) {
        super.setFeedSchedule(feedSchedule);
        super.setMedicine(medicine);
    }

    @Override
    public void feed() {
        System.out.println("Feeding rodents at " + super.getFeedSchedule());
    }

    @Override
    public void takeMedicine(String medicine) {
        System.out.println("Rodents take " + super.getMedicine() + " medicine at " + super.getDosage() + " dosage.");
    }
}
