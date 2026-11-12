package Weapon;
public class MagicWand implements Weapon{
    private int damageBonus = 15;

    @Override
    public int getDamageBonus(){
        return damageBonus;
    }

    @Override
    public String getWeaponName(){
        return "Magic Wand";
    }
}
