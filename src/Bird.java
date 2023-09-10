public class Bird extends Animal {
    private int sizeOfWing;

    public Bird(int age, String name, int sizeOfWing) {
        super(age, name);
        this.sizeOfWing = sizeOfWing;
    }

    @Override
    public void print() {
        System.out.println("age "+ getAge() + "name: " + getName() +"size of wing" + sizeOfWing);
    }
}
