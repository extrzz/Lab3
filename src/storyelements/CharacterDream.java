package storyelements;

import interfaces.DreamInterface;

public class CharacterDream implements DreamInterface {
    private Creature owner;
    private String target;
    public CharacterDream(String target){
        this.setTarget(target);
    }
    @Override
    public String dream(Creature owner){
        return this.owner.name+" dreaming about "+ this.getTarget();
    }
    public void setOwner(Creature owner){
        this.owner = owner;
    }
    public String getTarget(){
        return target;
    }
    public void setTarget(String target){
        this.target = target;
    }
}
