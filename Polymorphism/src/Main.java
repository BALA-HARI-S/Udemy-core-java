public class Main {
    public static void main(String[] args) {
        var onePiece = Movie.getMovie("doc", "one piece");
        onePiece.watchMovie();


        var bossBaby = new Comedy("Boss Baby");
        bossBaby.watchMovie();
        bossBaby.watchComedy();

        System.out.println("Coding Exercise : 38 : Composition");
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("My Room", wall1, wall2, wall3,
                wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
