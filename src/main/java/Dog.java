public class Dog extends Animal {
    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        this.setName(name);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + this.getName() + '\'' + ", age=" + this.getAge() + '}' + "Dog{" + "breed='" + breed + '\'' + '}';
    }
}
