public class Main {
    public static void main(String[] args) {
        Animal[] animals =
                {CreateObject("Bird"),
                        CreateObject("Fish"),
                        CreateObject("Earth_water")};
for (Animal animal: animals){
    animal.print();
}
    }

    public static Animal CreateObject(String className) {
        switch (className) {
            case "Bird":
                return new Bird(12 , " sparrow ", 34);
            case "Fish":
                return new Fish(2 , " shark ", 60);
            case "Earth_water":
                return new Earth_water(40 , " tourtale ", "grass");
        }
        return null;
    }
}