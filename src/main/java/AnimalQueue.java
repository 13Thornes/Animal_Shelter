public class AnimalQueue {
    private Animal[] animals;
    private int backOfQueue;
    private int numOfItems;
    int beginningOfQueue;

    public AnimalQueue(int size) {
        this.animals = new Animal[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.numOfItems = 0;

        System.out.println("The animal queue was successfully created with size of: " + size);
    }



    public Boolean isFull() {
        if (backOfQueue == animals.length-1) {
            return true;
        } else  {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return (numOfItems == 0);
    }

    public void enQueue(Animal animal) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            numOfItems++;
            animals[backOfQueue] = animal;
            System.out.println("Successfully inserted " + animal + " in the queue");
        } else {
            backOfQueue++;
            numOfItems++;
            animals[backOfQueue] = animal;
            System.out.println("Successfully inserted " + animal + " in the queue");

        }
    }

    public Animal deQueue () {
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return null;
        } else {
            Animal result = animals[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > backOfQueue) {
                beginningOfQueue = backOfQueue = -1;
            }
            numOfItems--;
            System.out.println(result + " was adopted");
            return result;
        }
    }

    //Peek
    public Animal peek(){
        if (!isEmpty()){
            System.out.println(animals[backOfQueue]);
            return animals[backOfQueue];

        } else {
            System.out.println("The Queue is empty");
            return null;
        }
    }
}
