package SpecialAbility;

public class HeavyStrike implements SpecialAbility{
    @Override
    public String getAbilityName(){
        return "Heavy Strike";
    }

    @Override 
    public int useAbility(){
        return 20;
    }
}
