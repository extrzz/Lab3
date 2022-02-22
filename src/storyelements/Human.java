package storyelements;

import exceptions.MissingNameException;

public class Human extends Creature {
    private final int intelligence;
    public int money;
    public Human(String name, int intelligence, int money) throws MissingNameException {
        super(name, "Human");
        if ("".equals(name)){
            throw new MissingNameException("Name of the character is missing.");
        }
        this.intelligence = intelligence;
        this.money = money;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public void giveAdvice(){
        if (intelligence == 1) {
        System.out.println(name+" says, that you need to use "+ Items.CLAY.getItem());
        }
        if (intelligence == 2) {
            System.out.println(name+" says, that you need to use "+Items.GRATED_RAW_POTATO.getItem());
        }
        if (intelligence == 3) {
            System.out.println(name+" says, that you need to use "+Items.STEWED_CABBAGE.getItem());
        }
        if (intelligence == 4) {
            System.out.println(name+" says, that you need to use "+Items.HORSERADISH.getItem());
        }
    }
    public void sitOnSomething(){
        System.out.println(getName()+" decided to take a sit.");
    }
    public void talkToSomeone(){
        System.out.println(getName()+" is talking with someone");
    }
    public int getMoney(){
        return money;
    }
}

