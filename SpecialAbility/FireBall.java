package SpecialAbility;

public class FireBall implements SpecialAbility{
    @Override
    public String getAbilityName(){
        return "Fire Ball";
    }

    @Override 
    public int useAbility(){
        return 25;
    }
}
