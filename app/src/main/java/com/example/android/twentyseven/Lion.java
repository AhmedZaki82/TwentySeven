package com.example.android.twentyseven;

/**
 * Created by Tsultrim on 2/12/18.
 */

public class Lion extends Cat {

    private boolean brave;
    private int fightingPower;

    public Lion(String animalName, String animalColor, int speed, int power, boolean brave, int fightingPower) {
        super(animalName, animalColor, speed, power);
        this.brave = brave;
        this.fightingPower = fightingPower;
    }

    public boolean getBrave() {
        return brave;
    }

    public void setBrave(boolean brave) {
        this.brave = brave;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %b%n%s: %d",super.toString(),"Is our Lion brave?",getBrave(),
                "The fighting power of our Lion is", getFightingPower());
    }
}
