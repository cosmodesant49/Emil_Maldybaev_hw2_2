public class Earth_water extends Animal {
    private String food;

    public Earth_water(int age, String name, String food) {
        super(age, name);
        this.food = food;
    }


    @Override
    public void print() {
        System.out.println("age "+ getAge() + "name: " + getName() + "food: "+ food);
    }
}
