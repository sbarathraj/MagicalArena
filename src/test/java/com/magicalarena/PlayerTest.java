package com.magicalarena;



import com.magicalarena.Player;


import junit.framework.TestCase;

public class PlayerTest extends TestCase {

    private Player player;

    // JUnit 3 setup method
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        player = new Player("Test Player", 100, 5, 10); // Initialize player object before each test
    }

    // Test for takeDamage method
    public void testTakeDamage() {
        player.takeDamage(20);
        assertEquals("Player health should decrease by damage taken", 80, player.getHealth());
        player.takeDamage(80);
        assertEquals("Player health should not go below zero", 0, player.getHealth());
        assertFalse("Player should be considered dead when health is 0", player.isAlive());
    }

    // Test for rollAttack method
    public void testRollAttack() {
        int attackDamage = player.rollAttack(5); // Simulate an attack roll of 5
        assertEquals("Attack damage should be attackPower * dice roll", 50, attackDamage);
    }

    // Test for rollDefense method
    public void testRollDefense() {
        int defenseStrength = player.rollDefense(3); // Simulate a defense roll of 3
        assertEquals("Defense strength should be strength * dice roll", 15, defenseStrength);
    }
}
