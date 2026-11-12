package Weapon;
public class Bow implements Weapon{
    private int damageBonus = 8;

    @Override
    public int getDamageBonus(){
        return damageBonus;
    }

    @Override
    public String getWeaponName(){
        return "Sword";
    }
}
