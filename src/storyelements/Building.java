package storyelements;

import exceptions.FreeJobPositionException;

public class Building {
    protected String name;
    public Building(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    class WorkPlace {
        public String name;
        public int salary = 15;
        public String position;
        public WorkPlace(String position){
            this.position = position;
        }

        public void workInfo() throws FreeJobPositionException {
            if (!isThereAFreeJobPosition()){
                throw new FreeJobPositionException("No free job positions for now. Comeback later!");
            }
            else {
                System.out.println("Work name:\n" + Building.this.name + "\nJob position:\n" + position + "\nSalary:\n" + salary + "\n");
            }
        }
        public boolean isThereAFreeJobPosition(){
            return Math.random() >= 0.5;
        }
    }
    static class Hotel {
        public final String name;
        public int availableMoney;
        public int roomFloor;
        public String pollutionlevel;
        public String insectcount;
        public Hotel(String name, int availableMoney){
            this.availableMoney = availableMoney;
            this.name = name;
        }
        public void roomFinder(int availableMoney){
            class Room {
                Room(){
                    this.roomNumber = availableMoney*10;
                }
                private int roomNumber;
                public int getRoomNumber(){
                    return roomNumber;
                }
                public void setRoomNumber(int roomNumber){
                    this.roomNumber = roomNumber;
                }
            }
            switch(availableMoney){
                case 10:
                    roomFloor = -2;
                    setPollutionlevel("A little bit of pollution, still okay to live");
                    setInsectcount("A few insects crawl around, but not that bad");
                    break;
                case 5:
                    roomFloor = -4;
                    setPollutionlevel("Everything in this room incredible polluted.");
                    setInsectcount("Hundreds of insects were found under the bed");
                    break;
                case 2:
                    roomFloor = -7;
                    setPollutionlevel("Cannot walk in the room cause of trash");
                    setInsectcount("A thousand insect blocking the door, so nobody can walk in the room");
                    break;
            }
        }
        public void roomStatus(){
            System.out.println("Room conditions:\n"+getInsectcount()+ "\n"+getPollutionlevel()+"\n");
        }
        public void setPollutionlevel(String pollutionlevel) {
            this.pollutionlevel = pollutionlevel;
        }
        public void setInsectcount(String insectcount){
            this.insectcount = insectcount;
        }
        public String getPollutionlevel(){
            return this.pollutionlevel;
        }
        public String getInsectcount(){
            return this.insectcount;
        }
        public String getName(){
            return this.name;
        }
        public void locationInfo(){
            System.out.println("Hotel name:\n"+getName());
        }
    }
}
