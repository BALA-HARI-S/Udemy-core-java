public class Main {
    public static void main(String[] args) {
        var onePiece = Movie.getMovie("doc", "one piece");
        onePiece.watchMovie();


        var bossBaby = new Comedy("Boss Baby");
        bossBaby.watchMovie();
        bossBaby.watchComedy();


    }
}
