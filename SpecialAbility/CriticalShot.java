package SpecialAbility;

public class CriticalShot implements SpecialAbility{
    @Override
    public String getAbilityName(){
        return "Critical Shot";
    }

    @Override 
    public int useAbility(){
        return 18;
    }
}
