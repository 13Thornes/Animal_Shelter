public class Cat extends Animal {
    private String breed;
    private String color;

    public Cat(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
        this.setAge(age);
        this.setName(name);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + this.getName() + '\'' + ", age=" + this.getAge() + '}' + "Cat{" + "breed='" + breed + "color='" + color + '\'' + '}';
    }
}
