# ⚔️ Battle Arena Game

A console-based turn-based battle game developed using **Core Java and Object-Oriented Programming (OOP)**. Choose your character, fight randomly generated enemies, use special abilities, and track your battle history and overall scores.

## 🎮 Features

- **Character Selection:** Choose between Warrior, Mage, and Archer.
- **Turn-Based Combat:** Fight enemies using normal and special attacks.
- **Special Abilities:** Each character has a unique special ability with limited uses.
- **Weapon System:** Different weapons provide additional attack damage.
- **Random Enemies:** An enemy character is randomly selected for every match.
- **Damage Calculation:** Character defense reduces incoming damage.
- **Multiple Matches:** Play multiple battles in one session.
- **Battle History:** View the results of all completed matches.
- **Scoreboard:** Track wins, losses, and total matches for each character.

## 🧙 Characters

| Character | Health | Attack Power | Defense | Weapon |
|---|---:|---:|---:|---|
| Warrior | 150 | 25 | 10 | Sword |
| Mage | 90 | 30 | 15 | Magic Wand |
| Archer | 130 | 15 | 15 | Bow |

Each character has a unique special ability and can use special attacks up to three times per match.

## 🛠️ Technologies Used

- Java
- Java Collections Framework
  - ArrayList
  - HashMap
- Random
- Scanner

## 🧠 Java Concepts Practiced

This project helped me apply the following Core Java concepts:

- Classes and Objects
- Encapsulation
- Abstraction
- Inheritance
- Runtime Polymorphism
- Interfaces
- Constructors
- Method Overriding
- Collections Framework
- Exception Handling
- Basic Multiclass Project Design

## 📂 Project Structure

The project is organized into separate classes for game management, characters, weapons, special abilities, battle results, and scoreboard functionality.

Key classes include:

- `Game` – Main entry point and overall game flow.
- `Character` – Abstract base class for all characters.
- `Warrior`, `Mage`, `Archer` – Character implementations.
- `Weapon` – Weapon interface and its implementations.
- `SpecialAbility` – Special ability interface and implementations.
- `BattleArena` – Manages individual battles.
- `BattleResult` – Stores the result of a completed match.
- `ScoreBoard` – Tracks character wins, losses, and matches.

## ▶️ How to Run

### Prerequisites

- Java Development Kit (JDK) installed.
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java support.

### Steps

1. Clone this repository.
2. Open the project in your Java IDE.
3. Locate `Game.java`.
4. Run the `main()` method.
5. Select your character and start battling!

## 📊 Game Statistics

After completing your matches, the game displays:

- Battle history with player, enemy, and winner details.
- Total wins for each character.
- Total losses for each character.
- Total matches played by each character.

**Note:** Battle history and scoreboard data are currently maintained in memory and are reset when the application is restarted.

## 🚀 Future Improvements

- Integrate a database using SQL and JDBC to persist battle history and scores.
- Add more characters, weapons, and special abilities.
- Improve the console interface and user experience.
- Add player profiles and persistent game statistics.

---

**Built as a hands-on Core Java learning project to practice Object-Oriented Programming and Java Collections.**