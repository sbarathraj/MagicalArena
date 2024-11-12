package com.magicalarena;


import static org.mockito.Mockito.when;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;



import junit.framework.TestCase; // Import JUnit 3 TestCase class
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ArenaTest extends TestCase {
    
    private Dice dice; // No need to mock, you can directly use Dice class in JUnit 3

    private Player playerA;
    private Player playerB;
    private Arena arena;

    // JUnit 3 setup method
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dice = Mockito.mock(Dice.class); // Create a mock Dice object
        MockitoAnnotations.initMocks(this); // Initialize mocks
        
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        arena = new Arena(playerA, playerB);
    }

    // JUnit 3 test method
    public void testBattleEndsWhenOnePlayerHealthIsZero() {
        // Mocking dice rolls to ensure damage is applied
        Mockito.when(dice.roll()).thenReturn(6);  // Mock dice to always return 6 (maximum value)

        // Run the battle
        arena.startBattle();

        // Verify that one player's health reaches 0
        assertTrue("One player's health should reach 0", 
            playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }
    
    // You can add more test methods here as needed

}
