import SpecialAbility.FireBall;
import Weapon.MagicWand;

public class Mage extends Character {

    public Mage() {
        super("Mage", 90, 30, 15, new MagicWand(), new FireBall());
    }

    @Override
    public int attack() {
        return getAttackPower() + getWeaponDamage();
    }

}
