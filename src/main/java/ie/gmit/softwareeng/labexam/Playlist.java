package ie.gmit.softwareeng.labexam;

import java.util.Collections;
import java.util.ArrayList;

public class Playlist {
    ArrayList<Song> playlist;
    String playlistName;
    int songIndex;

    public Playlist(String ledZeppelin) {
        playlistName = ledZeppelin;
        playlist = new ArrayList<>();
        songIndex = 0;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        // Returns true if this list contains the specified element
        return playlist.contains(song);
    }

    public void addSong(Song song) {
        if(playlist.contains(song)) throw new PlaylistException("Song in playlist");
        else playlist.add(song);        // Inserts the specified element at the specified position in this list
    }

    public void removeSong(Song song) {
        if(!playlist.contains(song)) throw new PlaylistException("Song not in playist");
        else playlist.remove(song);     // Removes the element at the specified position in this list
    }

    public int getNumberOfSongs() {
        // Returns the number of elements in this list
        return playlist.size();
    }

    public Song getSongAt(int index) {
        return playlist.get(index);
    }

    public void clear() {
        // Removes all of the elements from this list
        playlist.clear();
    }

    public void reverse() {
        // Reverses the order of the elements in the specified list
        Collections.reverse(playlist);
    }

    public Song[] getAllSongs() {
        Song[] results = new Song[playlist.size()];
        for (int i = 0; i < playlist.size(); i++) results[i] = playlist.get(i);
        return results;
    }

    public void shuffle() {
        // Randomly permutes the specified list using a default source of randomness
        Collections.shuffle(playlist);
    }

    public Song getCurrentSong() {
        if(playlist.size() <= 0) return null;
        else return playlist.get(songIndex);
    }

    public Song getNextSong() {
        if(songIndex >= playlist.size()-1) throw new UnsupportedOperationException("Not implemented yet");
        else throw new UnsupportedOperationException("Not implemented yet");
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