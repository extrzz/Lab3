package storyelements;

import interfaces.CombatInterface;

public class Animal extends Creature implements CombatInterface {
    private final int strength;
    private String neck = "His neck is GOOD";
    public Animal(String name, int strength){
        super(name, "Animal");
        this.strength = strength;
    }
    public void makeDream(String str){
        if (!"Rat".equals(str)){
            str = "something....";
        }
        CharacterDream dream = new CharacterDream(str);
        dream.setOwner(this);
        System.out.println(dream.dream(this));
    }
    @Override
    public void damage(Creature opponent) {
        opponent.applyDamage(this.strength);
    }
    public void makeDream() {
        System.out.println("is dreaming about something");
    }

    @Override
    public void applyDamage(int damage){
        super.applyDamage(damage);
        if (this.hp <= 50) this.setNeck("His neck is SWOLLEN!");
    }
    @Override
    public String getHp() {
        if (this.hp <= 50){
            return this.name+" needs to be HEALED";
        }
        else{
            return this.name+" is good for now";
        }
    }
    public void setNeck(String neck){
        this.neck = neck;
    }
    public String getNeck(){
        return neck;
    }
}
