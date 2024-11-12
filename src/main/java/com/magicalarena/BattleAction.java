package com.magicalarena;

public interface BattleAction {
	void execute(Player attacker, Player defender, Dice dice);
}
