public class DogQueue {
    private Dog[] dogArr;
    private int backOfQueue;
    private int numOfItems;
    int beginningOfQueue;

    public DogQueue(int size) {
        this.dogArr = new Dog[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.numOfItems = 0;

        System.out.println("The queue is successfully created with size of: " + size);
    }



    public Boolean isFull() {
        if (backOfQueue == dogArr.length-1) {
            return true;
        } else  {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return (numOfItems == 0);
    }

    public void enQueue(Dog dog) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            numOfItems++;
            dogArr[backOfQueue] = dog;
            System.out.println("Successfully inserted " + dog + " in the queue");
        } else {
            backOfQueue++;
            numOfItems++;
            dogArr[backOfQueue] = dog;
            System.out.println("Successfully inserted " + dog + " in the queue");

        }
    }

    public Dog deQueue () {
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return null;
        } else {
            Dog result = dogArr[beginningOfQueue];
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
    public Dog peek(){
        if (!isEmpty()){
            System.out.println(dogArr[backOfQueue]);
            return dogArr[backOfQueue];

        } else {
            System.out.println("The Queue is empty");
            return null;
        }
    }
}
