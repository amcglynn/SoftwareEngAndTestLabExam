package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;

public class Playlist {

    String LabExamHits;
    ArrayList<Song> playlist = new ArrayList<Song>();


    public Playlist(String playlistName) {

        LabExamHits = playlistName;
    }
    public String getName() {
        //throw new UnsupportedOperationException("Not implemented yet");
        return LabExamHits;
    }

    public boolean contains(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");

    }

    public void addSong(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
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
        throw new UnsupportedOperationException("Not implemented yet");
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
