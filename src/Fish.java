public class Fish extends  Animal{
    private int speed;

    public Fish(int age, String name, int speed) {
        super(age, name);
        this.speed = speed;
    }


    @Override
    public void print() {
        System.out.println("age "+ getAge() + "name: " + getName() + "speed: " + speed);
    }
}
