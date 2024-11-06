public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Sammy", 8, "Husky", "Dog");
        Dog dog2 = new Dog("James", 2, "Black Lab", "Dog");
        Dog dog3 = new Dog("Bailey", 9, "Beagle", "Dog");
        Dog dog4 = new Dog("Precious", 13, "Terrier Mix", "Dog");

        Cat cat1 = new Cat("Tazzy", 3, "Cat", "Tabby", "Orange");
        Cat cat2 = new Cat("Kitters", 5, "Cat", "Bombay", "Black");
        Cat cat3 = new Cat("Baby", 2, "Cat", "Ragdoll", "Grey");
        Cat cat4 = new Cat("Sparkle", 1, "Cat", "Tabby", "Brown");

        AnimalShelter shelter = new AnimalShelter();

        shelter.addAnimal(dog1);
        shelter.addAnimal(cat1);
        shelter.addAnimal(dog2);
        shelter.addAnimal(cat2);
        shelter.addAnimal(dog3);
        shelter.addAnimal(cat3);
        shelter.addAnimal(dog4);
        shelter.addAnimal(cat4);

        shelter.printAnimals();

        shelter.adoptOldestAnimal();
        shelter.printAnimals();

        shelter.adoptOldestDog();
        shelter.printAnimals();

        shelter.adoptOldestCat();
        shelter.printAnimals();
    }
}
