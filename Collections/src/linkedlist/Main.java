package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var list = new LinkedList<String>();
        list.add("canada");
        list.add(0,"America");
        System.out.println(list);

        addElements(list);
        System.out.println(list);

        System.out.println("PlayList Songs");
        LinkedList<Song> playList = new LinkedList<>();

        var stereoHearts = new Song("StereoHearts", 4.00);
        var Dandelions = new Song("Dandelions", 3.00);
        var Maroon5 = new Song("Maroon5", 5.00);


        var album1 = new Album("Album01","artist01");
        album1.addSong("StereoHearts", 4.00);
        album1.addSong("Dandelions", 3.00);
        album1.addSong("Maroon5", 5.00);

        album1.addToPlayList("StereoHearts", playList);
        album1.addToPlayList("Dandelions", playList);
        album1.addToPlayList("Maroon5", playList);

        boolean addSong = album1.addToPlayList(1, playList);
        System.out.println("add 5th Song : "+ addSong);
        for(Song s : playList){
            System.out.println(s);
        }

    }

    public static void addElements(LinkedList<String> list){
        list.addFirst("Russia");
        list.addLast("Japan");

//        Queue methods
        list.offer("Europe");
        list.offerFirst("Italy");
        list.offerLast("Australia");

//        Stack methods

    }


}
