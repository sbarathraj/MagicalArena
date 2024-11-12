package com.magicalarena;

public class Player {
    private final String name;
    private int health;
    private final int strength;
    private final int attackPower;

    public Player(String name, int health, int strength, int attackPower) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attackPower = attackPower;
    }

    public int rollAttack(int diceValue) {
        return attackPower * diceValue;
    }

    public int rollDefense(int diceValue) {
        return strength * diceValue;
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s [Health: %d, Strength: %d, Attack: %d]", name, health, strength, attackPower);
    }
}

