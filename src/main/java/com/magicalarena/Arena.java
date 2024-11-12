package com.magicalarena;

public class Arena {
    private final Player player1;
    private final Player player2;
    private final Dice dice;
    private final BattleAction battleAction;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
        this.battleAction = new AttackAction();
    }

    public void startBattle() {
        System.out.println("=== Starting Battle in the Magical Arena ===");
        System.out.println(player1);
        System.out.println(player2);

        while (player1.isAlive() && player2.isAlive()) {
            playRound();
        }

        System.out.println("\n=== Battle Concluded ===");
        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    private void playRound() {
        if (player1.getHealth() <= player2.getHealth()) {
            battleAction.execute(player1, player2, dice);
        } else {
            battleAction.execute(player2, player1, dice);
        }
        System.out.println(player1.getHealth() + " - " + player2.getHealth()); // Debugging line
    }

}
