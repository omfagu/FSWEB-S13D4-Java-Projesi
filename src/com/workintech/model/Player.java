package com.workintech.model;

//error prune(hataya açık)
public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void checkHealth(int healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }

        checkHealth(healthRemain);
    }

    public void restoreHealth(int healthPotion) {
        int healthRemain = healthPercentage + healthPotion;
        //int newHealth = healthPercentage + healthPotion;
        checkHealth(healthRemain);
    }

    @Override
    public String toString() {
        return "Name: " + name + " HeathPercentage: " + healthPercentage +
                " Weapon: " + (weapon.getDamage() + " - " + weapon.getAttackSpeed() +
                " Damage Deal: " + (weapon.getAttackSpeed() * weapon.getDamage()));
    }
}