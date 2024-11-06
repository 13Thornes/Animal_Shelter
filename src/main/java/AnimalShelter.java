import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

private Queue<Animal> animals = new LinkedList<Animal>();

    public AnimalShelter() {
        this.animals = new LinkedList<>();
    }

    public Queue<Animal> getAnimals(){
        return animals;
    }

    public void setAnimals(Queue<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void  printAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Shelter is empty");
        } else {
            System.out.println("Animals available for adoption:");
            for(Animal animal: animals) {
                if(animal instanceof Dog) {
                    System.out.println("Name: " + animal.getName() + ", Type: " + animal.getType());
                } else if (animal instanceof Cat) {
                    System.out.println("Name: " + animal.getName() + ", Type: " + animal.getType());
                }
            }
            System.out.println();
        }
    }

    public void adoptOldestAnimal() {
        if (!animals.isEmpty()) {
            Animal oldestAnimal = animals.peek();
            animals.remove(oldestAnimal);
            System.out.println(oldestAnimal.getName() + " was adopted");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("No animals available");
            System.out.println();
        }

    }

    public void adoptOldestDog() {
        if (animals.isEmpty()){
            System.out.println("No animals available");
            System.out.println();
        }
        for(Animal animal: animals) {
            if (animal instanceof Dog) {
                animals.remove(animal);
                System.out.println();
                System.out.println(animal.getName() + " was adopted");
                System.out.println();
                break;
            }
        }
    }

    public void adoptOldestCat() {
        if (animals.isEmpty()){
            System.out.println("No animals available");
            System.out.println();
        }
        for(Animal animal: animals) {
            if (animal instanceof Cat) {
                animals.remove(animal);
                System.out.println();
                System.out.println(animal.getName() + " was adopted");
                System.out.println();
                break;
            }
        }
    }
}
