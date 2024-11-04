public class Main {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("Sammy", 8, "Husky");
//        Dog dog2 = new Dog("James", 2, "Black Lab");
//        DogQueue dogQueue = new DogQueue(2);
//
//        dogQueue.enQueue(dog1);
//        dogQueue.enQueue(dog2);
//
//        dogQueue.peek();
//
//        dogQueue.deQueue();
//
//        dogQueue.peek();

        Cat cat1 = new Cat("Felix", 3, "Tabby", "Orange");
        Cat cat2 = new Cat("Kitters", 5, "Bombay", "Black");

        CatQueue catQueue = new CatQueue(2);

        catQueue.enQueue(cat1);
        catQueue.enQueue(cat2);

        catQueue.peek();

        catQueue.deQueue();

        catQueue.peek();

    }
}
