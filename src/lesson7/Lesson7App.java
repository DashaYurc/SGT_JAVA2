package lesson7;

import lv.darja.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {

    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escaped plan", 100);
        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Elon", 100, 3,
                new ArrayList<String>());

        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        peopleSpaceShip.addCargo();
        peopleSpaceShip.addCargo(200);
        System.out.println(peopleSpaceShip);

        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);

        //UPCASTING
        SpaceShip  castedSpaceship = (SpaceShip) peopleSpaceShip;

        //DOWNCASTING
        PeopleSpaceShip castedPeopleSpaceship = (PeopleSpaceShip) spaceShip;
    }

    public static void printInfoAboutSpaceShip( SpaceShip spaceShip){
        System.out.println("I have a spaceship: "+ spaceShip);
    }
}
