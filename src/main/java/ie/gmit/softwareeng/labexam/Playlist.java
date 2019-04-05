package ie.gmit.softwareeng.labexam;

import java.util.*;


public class Playlist {

    public String name;
    public static int min;
    public static int max;

    public Playlist(String playlistName) {
        playlistName ="Test1";
    }

    public String getName() {
        String name = "Test Playlist";
        return name;
    }

    public boolean contains(Song song) {
        List<String> list = new ArrayList<>();
        if (list.contains(song)){
            return true;
        }
        return false;
    }

    public void addSong(Song song) {
        List<String> newSongs = new ArrayList<>();
        //Song song1 = new Song("Name", "Title");
        //newSongs.add();
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void removeSong(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getNumberOfSongs() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Song getSongAt(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void clear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void reverse() {
        List<String> list = new ArrayList<>();
        Collections.reverse(list);
    }

    public Song[] getAllSongs() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void shuffle() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Song getCurrentSong() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Song getNextSong() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void nextSong() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Song getPreviousSong() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void previousSong() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void goToIndex(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
