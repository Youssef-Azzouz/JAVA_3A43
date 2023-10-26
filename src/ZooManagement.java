public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        if (!myZoo.isZooFull()) {
            Animal zebra = new Animal("ZebraFamily", "Zebro", 8, true);
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
        }

        Zoo zoo2 = new Zoo("Zoo 2", "Ville 2");
        Zoo zooAvecPlusDAnimaux = Zoo.comparerZoo(myZoo, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecPlusDAnimaux.getName());
    }

}
