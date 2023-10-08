package com.workintech.model;

public class PlayerMain {
    public static void main(String[] args) {
        Player player1 = new Player("Dogan",
                1000, Weapon.SWORD);
        System.out.println(player1);
        player1.loseHealth(80);
        System.out.println(player1);
        player1.restoreHealth(1000);
        System.out.println(player1);
        player1.loseHealth(50);
        System.out.println(player1);

        player1.restoreHealth(1000);
    }
}