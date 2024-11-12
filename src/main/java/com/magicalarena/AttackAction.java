package com.magicalarena;

public class AttackAction implements BattleAction {
    public void execute(Player attacker, Player defender, Dice dice) {
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();

        int attackDamage = attacker.rollAttack(attackRoll);
        int defenseStrength = defender.rollDefense(defenseRoll);

        int damage = Math.max(0, attackDamage - defenseStrength);
        defender.takeDamage(damage);

        System.out.printf("%s attacks %s | Attack Roll: %d, Damage: %d | Defense Roll: %d, Defense: %d | %s Health: %d\n",
                attacker.getName(), defender.getName(), attackRoll, attackDamage, defenseRoll, defenseStrength,
                defender.getName(), defender.getHealth());
    }
}
