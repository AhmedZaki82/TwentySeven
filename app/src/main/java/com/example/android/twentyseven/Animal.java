package com.example.android.twentyseven;

/**
 * Created by Tsultrim on 2/12/18.
 */

public class Animal {

    private String animalName;
    private String animalColor;
    private int speed;
    private int power;

    public Animal(String animalName, String animalColor, int speed, int power) {


        if (speed < 0) {

            throw new IllegalArgumentException("The speed of the Animal object must be greater" +
                    " than 0");
        }

        if (power < 0) {

            throw new IllegalArgumentException("The power of the Animal object must be greater" +
                    " than 0");
        }


        this.animalName = animalName;
        this.animalColor = animalColor;
        this.speed = speed;
        this.power = power;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int overAllPower() {

        return getPower() * getSpeed();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %d%n%s: %d%n%s: %d",
                "The Animal name",getAnimalName(), "The Animal color",getAnimalColor(),
                "The Animal speed", getSpeed(), "The Animal power", getPower(),
                "The overall power of the animal is", overAllPower());
    }
}
