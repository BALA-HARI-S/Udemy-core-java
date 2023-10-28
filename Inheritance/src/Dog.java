public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog(){
        super("German Shepherd", "small", 100);
    }

    public Dog(String type, double weight){
        this(type, weight, "default shape", "default shape");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight <= 100 ? "Small" : (weight >= 300 ? "Huge" : "Medium"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makeNoise(){
        if (type == "wolf"){
            System.out.println("Wo Wooooo");
        }
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag tail");
        if(speed == "Slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof! ");
    }
    private void run(){
        System.out.println("Dog Running! ");
    }
    private void walk(){
        System.out.println("Dog walking! ");
    }
    private void wagTail(){
        System.out.println("Tail wagging! ");
    }



}
