package com.magicalarena;

import com.magicalarena.Dice;



import junit.framework.TestCase;

public class DiceTest extends TestCase {
    
    private Dice dice;

    // JUnit 3 setup method
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dice = new Dice(); // Initialize the dice object before each test
    }

    // JUnit 3 test method
    public void testRollInRange() {
        for (int i = 0; i < 100; i++) { // Run the roll multiple times to test randomness
            int roll = dice.roll();
            assertTrue("Dice roll should be between 1 and 6", roll >= 1 && roll <= 6);
        }
    }
}
