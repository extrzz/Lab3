package storyelements;

import exceptions.FreeJobPositionException;
import interfaces.CombatInterface;

public class Main {

    public static void main(String[] args) {
        Human Neznayka = new Human("Neznayka", 33, 5);
        Neznayka.creationMsg(Neznayka.getName());
        Building.Hotel Typichok = new Building.Hotel("Dryaningskiy Typichok", Neznayka.getMoney());
        Typichok.locationInfo();
        Typichok.roomFinder(Typichok.availableMoney);
        Typichok.roomStatus();
        Animal Kozlik = new Animal("Kozlik", 10);
        Kozlik.creationMsg(Kozlik.getName());
        Kozlik.makeDream(Kozlik.getName());
        Rat Rat = new Rat("Vicious Rat", 50);
        Rat.creationMsg(Rat.getName());
        Kozlik.makeDream(Rat.getName());
        System.out.println(Kozlik.getNeck());
        System.out.println(Kozlik.getHp());
        CombatInterface masterHit = new CombatInterface() {
            @Override
            public void damage(Creature opponent) {
                opponent.applyDamage(Rat.getStrength()*2);
                System.out.printf("%s is attacking X2!%n", Rat.getName());
            }
        };
        masterHit.damage(Kozlik);
        System.out.println(Kozlik.getNeck());
        System.out.println(Kozlik.getHp());
        Neznayka.work();
        for (int i = 1; i<=4;i++){
            String name = "Stranger №"+i;
            Human Stranger = new Human(name, i,0);
            Stranger.giveAdvice();
        }
        Building Building = new Building("Dog Sitter Agency");
        Building.WorkPlace WorkPlace = Building.new WorkPlace("Sitter for dogs");
        Neznayka.sitOnSomething();
        Neznayka.talkToSomeone();
        try {
            WorkPlace.workInfo();
        } catch (FreeJobPositionException e){
            System.out.println(e.getMessage());
        }
    }
}
