package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    String playlistName;
    List<Song> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName=playlistName;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        return playlist.contains(song);
    }

    public void addSong(Song song) {
        if (playlist.contains(song)) throw new PlaylistException("Song already exists in the playlist");
       playlist.add(song);
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
