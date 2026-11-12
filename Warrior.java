import SpecialAbility.HeavyStrike;
import Weapon.Sword;

public class Warrior extends Character {

    public Warrior() {
        super("Warrior", 150, 25, 10, new Sword(), new HeavyStrike());
    }

    @Override
    public int attack() {
        return getAttackPower() + getWeaponDamage();
    }

}
