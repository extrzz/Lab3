package storyelements;

import interfaces.CombatInterface;

public class Rat extends Creature implements CombatInterface {
    private int strength;
    public Rat(String name, int strength){
        super(name, "Rat");
        this.strength = strength;
    }
    @Override
    public void damage(Creature opponent){
        System.out.println("Rat is ATTACKING!");
        opponent.applyDamage(strength);
    }
    public int getStrength(){
        return strength;
    }
}
