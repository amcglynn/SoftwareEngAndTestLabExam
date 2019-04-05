package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;

public class Playlist {

    String playlistName;
    //Playlist playlist;
    public ArrayList<Song> playlist;




    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song){
        playlist = new ArrayList<Song>();
        return false;
    }


    public void addSong(Song song) {
        playlist.add(song);

        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void removeSong(Song song) {
        playlist.remove(song);
    }

    public int getNumberOfSongs() {
        return playlist.size();
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

    public String goToIndex(int index) {
        return playlist.get(index).getArtist();
    }
}
