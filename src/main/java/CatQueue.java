public class CatQueue {
    private Cat[] catArr;
    private int backOfQueue;
    private int numOfItems;
    int beginningOfQueue;

    public CatQueue(int size) {
        this.catArr = new Cat[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.numOfItems = 0;

        System.out.println("New cat queue was successfully created with size of: " + size);
    }



    public Boolean isFull() {
        if (backOfQueue == catArr.length-1) {
            return true;
        } else  {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return (numOfItems == 0);
    }

    public void enQueue(Cat cat) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            numOfItems++;
            catArr[backOfQueue] = cat;
            System.out.println("Successfully inserted " + cat + " in the queue");
        } else {
            backOfQueue++;
            numOfItems++;
            catArr[backOfQueue] = cat;
            System.out.println("Successfully inserted " + cat + " in the queue");

        }
    }

    public Cat deQueue () {
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return null;
        } else {
            Cat result = catArr[beginningOfQueue];
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
    public Cat peek(){
        if (!isEmpty()){
            System.out.println(catArr[backOfQueue]);
            return catArr[backOfQueue];

        } else {
            System.out.println("The Queue is empty");
            return null;
        }
    }
}
