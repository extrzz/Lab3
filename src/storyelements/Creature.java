package storyelements;

public abstract class Creature {
    protected String name;
    protected Status status = Status.GOOD;
    public String type;
    protected int hp = 100;
    public Creature(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void updateStatus(){
        if (this.hp <=25){
            setStatus(Status.HARDLY_INJURED);
        }
        else if (this.hp <=50){
            setStatus(Status.INJURED);
        }
        else if (this.hp <=90){
            setStatus(Status.ALRIGHT);
        }
        System.out.println(this.getStatus());
    }
    public void applyDamage(int damage){
         setHp(this.hp - damage);
         updateStatus();
    }
    public void creationMsg(String name){
        System.out.println("Character "+name+" is created.");
    }
    public void setHp(int health){
        this.hp = health;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public String getStatus(){
        return String.format("%s %s", this.name,this.status.getStatus());
    }
    public String getHp() {
        return Integer.toString(this.hp);
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return String.format("%s %s ", this.getClass() ,this.name);
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    @Override
    public boolean equals(Object o){
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Creature cr = (Creature) o;
        return cr.name.equals(name);
    }
}
