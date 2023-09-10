public abstract class Animal implements Printable{
    private int age;
    private String name;
    public abstract void print();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
