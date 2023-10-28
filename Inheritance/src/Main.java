public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal", "Huge", 400);
        doAnimalStuff(animal, "Fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Medium");

        Dog yorkie = new Dog("Yorkie", 310);
        doAnimalStuff(yorkie, "Fast");

        Dog retriever = new Dog("Golden Retriever", 100, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "Slow");

        Dog wolf = new Dog("wolf", 200);
        doAnimalStuff(wolf, "Fast");

        Fish goldie = new Fish("Goldfish", 10.15, 2 , 3);
        doAnimalStuff(goldie, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________________");
    }
}
