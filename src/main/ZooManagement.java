package main;

import entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(entities.Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

        // Instruction 21 :
        //Terrestrial hamster = new Terrestrial();
        //Aquatic shark = new Aquatic();
        //Dolphin dolphin = new Dolphin();
        //Penguin penguin = new Penguin();

        // Instruction 22 :
        Terrestrial hamster = new Terrestrial("Mammal", "Hamster", 5, true, 4);
        Aquatic shark = new Aquatic("Fish", "Shark", 10, true, "Ocean");
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 8, true, "Ocean", 20.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 50.0f);

        // Instruction 23 :
        System.out.println(hamster.toString());
        System.out.println(shark.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());

        // Instruction 24 :
        shark.swim(); // Affiche "This aquatic animal is swimming."
        dolphin.swim(); // Affiche "This dolphin is swimming."
        penguin.swim(); // Affiche "This aquatic animal is swimming."

    }

}
