public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String movieType = this.getClass().getName();
        System.out.println(title + " is a " + movieType + " film.");

    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(2),
                "Pleasant Scene",
                "Something Bad Happens");
    }
}
class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(2),
                "Comedy Scene",
                "Something funnier Happens");

    }

    public void watchComedy(){
        System.out.println("Watching Comedy");
    }
}
