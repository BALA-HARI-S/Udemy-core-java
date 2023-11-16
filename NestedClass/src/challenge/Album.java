package challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album{

    private String name;
    private String artist;

    private SongList songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return songs.add(new Song(title, duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song s = songs.findSong(trackNumber);
        if (s == null){
            return false;
        }
        songs.add(s);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song s = songs.findSong(title);
        if(s == null){
            return false;
        }
        playList.add(s);
        return true;
    }

    public class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            songs.add(song);
            return true;
        }
        private Song findSong(String title){
            for(Song s: songs){
                if(title == s.getTitle()){
                    return s;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber -1;
            if(index >= 0 && index <= songs.size()) {
                return songs.get(index);
            }
            return null;
        }

    }
}
