# Magical Arena Game

## Overview
This project implements a battle simulation between two players in a magical arena. The players take turns attacking each other, using dice rolls to calculate damage and defense. The game ends when a player's health reaches zero.

### Game Rules
- Each player has three attributes:
  - **Health**: Determines how much damage a player can take.
  - **Strength**: Multiplies with the defense dice roll to mitigate damage.
  - **Attack**: Multiplies with the attack dice roll to deal damage.
  
- Players attack in turns, with the one having the lower health attacking first.
- The attacking player rolls a dice, and the damage dealt is calculated as:
  ```
  Attack Damage = Attack * Attack Roll
  ```
- The defending player rolls a dice, and the damage defended is calculated as:
  ```
  Defense Strength = Strength * Defense Roll
  ```
- The damage taken is the difference between the attack damage and the defense strength.
- The game ends when any player’s health reaches zero.

## File Structure

```
MagicalArena/
│
├── com/
│   └── magicalarena/
│       ├── Player.java            # Represents each player's attributes and logic.
│       ├── Dice.java              # Dice class to simulate a roll.
│       ├── BattleAction.java      # Interface for battle actions.
│       ├── AttackAction.java      # Implements the action for attacking.
│       ├── Arena.java             # Manages the gameplay, rounds, and battle logic.
│       └── Main.java              # Entry point to initialize and start the game.
│
└── tests/
    └── com/
        └── magicalarena/
            ├── PlayerTest.java    # Unit tests for Player class
            ├── DiceTest.java      # Unit tests for Dice class
            ├── ArenaTest.java     # Unit tests for Arena class
            └── AttackActionTest.java # Unit tests for AttackAction class
```

## How to Run the Code

### Prerequisites
1. **Java 8 or higher**: The project is written in Java, so ensure that you have Java installed.
2. **IDE (Optional)**: You can use any IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code for easier project management.

### Running the Game

1. **Clone the Repository**:
   ```
   git clone <repository-url>
   cd MagicalArena
   ```

2. **Compile the Java files**:
   In your terminal, navigate to the root folder of the project and compile all the Java files using:
   ```
   javac com/magicalarena/*.java
   ```

3. **Run the Main class**:
   To start the game, run the `Main.java` file:
   ```
   java com.magicalarena.Main
   ```

### Unit Tests

The project includes unit tests that you can run to verify the behavior of the various components.

1. **Using JUnit**:
   The project is designed to work with JUnit for testing. Ensure JUnit is added as a dependency to your project.

2. **Running Tests**:
   If you are using an IDE, you can run the tests directly within the IDE. If using the terminal, you can run tests using Maven, Gradle, or your preferred Java testing framework.

   To run the tests using Maven, run the following command:
   ```
   mvn test
   ```

## How the Game Works

The `Main.java` file starts the game with two predefined players. The arena takes care of the battle flow, alternating turns between the two players, and handling damage calculations based on the dice rolls.

### Classes

1. **Player.java**: Contains player attributes like health, strength, and attack. It also contains methods for taking damage and checking if the player is alive.
2. **Dice.java**: Simulates the dice roll and returns a value between 1 and 6.
3. **BattleAction.java**: Interface that all battle actions (like attacking) must implement.
4. **AttackAction.java**: Implements the `BattleAction` interface and handles the logic of attacking, calculating damage, and applying it to the defender.
5. **Arena.java**: Orchestrates the gameplay, manages the turns, and checks win conditions.
6. **Main.java**: Initializes the players and arena, and starts the game.

## Example of Gameplay

For example, Player A has 50 health, 5 strength, and 10 attack, while Player B has 100 health, 10 strength, and 5 attack. When the game starts:

1. **Player A (50 health, 5 strength, 10 attack)** attacks first.
   - Player A rolls the attack dice: 5
   - Player B rolls the defense dice: 2
   - The attack damage: `10 * 5 = 50`
   - The defense strength: `10 * 2 = 20`
   - Player B’s health reduces by `50 - 20 = 30`, so Player B’s health becomes 70.

2. **Player B (100 health, 10 strength, 5 attack)** then attacks.
   - Player B rolls the attack dice: 4
   - Player A rolls the defense dice: 3
   - The attack damage: `5 * 4 = 20`
   - The defense strength: `5 * 3 = 15`
   - Player A’s health reduces by `20 - 15 = 5`, so Player A’s health becomes 45.

This process continues until one player's health reaches 0, declaring the other player the winner.

## Commit History

We follow a frequent commit strategy with small, incremental commits that reflect meaningful changes to the project. The commit messages include relevant information about the changes made to the codebase.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
