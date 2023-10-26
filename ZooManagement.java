//Instruction 3
import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {
        //Instruction 1
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);

        //Instruction 2
        /*
         1/ Modifiez la variable d'environnement PATH et ajoutez le chemin du répertoire Java
         2/ Lancez l'invite de commande(cmd) et naviguer vers le chemin du fichier ZooManagement.java
         3/ Lancez l'instruction "javac ZooManagement.java"
         4/ Lancez l'instruction "java ZooManagement"
         */

        System.out.println("-------------------------------------------------------------");
        //Instruction 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCagesSaisie;
        //Etape optionelle
        zm1.zooName = "notMyZoo";
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);
        //Instruction 5
        /* Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo(25);
        myZoo.name = "myZoo";
        myZoo.city = "VilleDuZoo";
        myZoo.nbrCages = 20; */

        //Instruction 7
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        Zoo myZoo = new Zoo("myZoo", "VilleDuZoo", 20);

        //Instruction 8
        myZoo.displayZoo();

        /*System.out.println(myZoo);
        System.out.println(myZoo.toString());*/

        //Instruction 10
        boolean ajoutReussi = myZoo.addAnimal(lion);
        if (ajoutReussi) {
            System.out.println("L'animal a été ajouté avec succès au zoo.");
        }

        /*for (int i = 0; i < 22; i++) {
            boolean ajout = myZoo.addAnimal(new Animal("Famille" + i, "Animal" + i, i, true));
            if (ajout) {
                System.out.println("Animal " + i + " ajouté avec succès.");
            } else {
                System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            }
        }*/
        //Instruction 11
        Animal chien = new Animal("Dalmacien", "Chien", 5, true);
        boolean ajoutReussi2 = myZoo.addAnimal(chien);
        if (ajoutReussi2) {
            System.out.println("L'animal a été ajouté avec succès au zoo.");
        }
        Animal chien2 = new Animal("Dalmacien", "Chien", 5, true);
        boolean ajoutReussi3 = myZoo.addAnimal(chien);
        if (ajoutReussi3) {
            System.out.println("L'animal a été ajouté avec succès au zoo.");
        }



        int indiceAnimal = myZoo.searchAnimal(chien2);

        if (indiceAnimal != -1) {
            System.out.println("Le nouvel animal a été trouvé à l'indice " + (indiceAnimal +1) + " dans le zoo.");
        } else {
            System.out.println("Le nouvel animal n'a pas été trouvé dans le zoo.");
        }

        myZoo.displayAnimals();

        //Instruction 13
        boolean suppressionReussie = myZoo.removeAnimal(lion);

        if (suppressionReussie) {
            System.out.println("L'animal a été supprimé avec succès du zoo.");
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo ou la suppression a échoué.");
        }


        myZoo.displayAnimals();


    }
}
//Instruction 5
 class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal() {}
    //Instruction 6
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    //Instruction 9
    public String toString() {
        return "Famille : " + family + "\nNom : " + name + "\nÂge : " + age + "\nEst un mammifère : " + isMammal;
    }

}
class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    //Instruction 10
    int animalCount;

    public Zoo(int maxAnimals) {
        this.animals = new Animal[maxAnimals];
    }
    //Instruction 6
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        //Instruction 10
        this.animalCount = 0;
    }
    //Instruction 8
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages dans le zoo : " + nbrCages);
    }
    //Instruction 9
    public String toString() {
        return "Nom du zoo : " + name + "\nVille du zoo : " + city + "\nNombre de cages dans le zoo : " + nbrCages;
    }
    //Instruction 10
    /*public boolean addAnimal(Animal animal) {

        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            return false;
        }
    }*/
    //Instruction 12
    public boolean addAnimal(Animal animal) {

        if (animalCount < animals.length) {

            if (!animalExists(animal)) {
                animals[animalCount] = animal;
                animalCount++;
                return true;
            } else {
                System.out.println("L'animal existe déjà dans le zoo. Impossible d'ajouter.");
                return false;
            }
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    private boolean animalExists(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            Animal existingAnimal = animals[i];
            if (existingAnimal != null && existingAnimal.name.equals(animal.name)) {
                return true;
            }
        }
        return false;
    }

    //Instruction 11
    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animalToFind) {
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animals[i];
            if (animal != null && animal.name.equals(animalToFind.name)) {
                return i;
            }
        }
        return -1;
    }
    //Instruction 13
    public boolean removeAnimal(Animal animalToRemove) {
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animals[i];
            if (animal != null && animal.name.equals(animalToRemove.name)) {

                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }

}
