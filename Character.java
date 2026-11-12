import SpecialAbility.SpecialAbility;
import Weapon.Weapon;

public abstract class Character {

    private String charName;
    private int health;
    private int attackPower;
    private int defense;
    private Weapon weapon;
    private SpecialAbility specialAbility;

    private int specialCount = 3;

    public Character(String name, int health, int attackPower,int defense, Weapon weapon, SpecialAbility specialAbility) {
        this.charName = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.weapon = weapon;
        this.specialAbility = specialAbility;
    }

    public abstract int attack();

    public int specialAttack(){
        if (specialCount <= 0) {
            System.out.println("No special attacks left!");
            return -1;
        }

        specialCount--;

        System.out.println(charName + " uses " + specialAbility.getAbilityName() + "!");
        System.out.println("Special attacks left: " + specialCount);
        System.out.println();

        return getAttackPower() + specialAbility.useAbility() + getWeaponDamage();
    }

    public void takeDamage(int incomingDamage) {

        int actualDamage = Math.max(0, incomingDamage - defense);
        health = Math.max(0, health - actualDamage);
        System.out.println(charName + " received " + actualDamage + " damage!");
        System.out.println("Remaining Health of " + charName +": " + health);
        System.out.println();
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getCharName() {
        return charName;
    }

    public String getWeapon() {
        return weapon.getWeaponName();
    }

    public int getDefense() {
        return defense;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getWeaponDamage(){
        return weapon.getDamageBonus();
    }

    public void displayDetails() {
        System.out.println("\nCharacter Details");
        System.out.println("Name: " + charName);
        System.out.println("Weapon: " + weapon.getWeaponName());
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
    }
}
