import SpecialAbility.CriticalShot;
import Weapon.Bow;

public class Archer extends Character {

    public Archer() {
        super("Archer", 130, 15, 15, new Bow(), new CriticalShot());
    }

    @Override
    public int attack() {
        return getAttackPower() + getWeaponDamage();
    }

}
