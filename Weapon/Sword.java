package Weapon;
public class Sword implements Weapon{
    private int damageBonus = 10;

    @Override
    public int getDamageBonus(){
        return damageBonus;
    }

    @Override
    public String getWeaponName(){
        return "Sword";
    }
}
