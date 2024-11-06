public class Dog extends Animal {

    private String breed;


    public Dog(String name, int age, String breed, String type) {
        super(name, age, type);
        this.breed = breed;
        this.setName(name);
        this.setType(type);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + this.getName() + '\'' + ", age=" + this.getAge() + ", type=" + this.getType()  + ", breed='" + breed + '\'' + '}';
    }
}
