public class Cat extends Animal {
    private String breed;
    private String color;

    public Cat(String name, int age, String type, String breed, String color) {
        super(name, age, type);
        this.breed = breed;
        this.color = color;
        this.setAge(age);
        this.setName(name);
        this.setType(type);
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
        return "Animal{" + "name='" + this.getName() + '\'' + ", age=" + this.getAge() + ", type=" + this.getType() + ", breed='" + breed + "', color='" + color + '\'' + '}';
    }
}
