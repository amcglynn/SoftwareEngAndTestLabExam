package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;

    private List<Song> songs = new ArrayList<>();

    public Playlist(String playlistName) {
        name = playlistName;
    }

    public String getName() {
        return name;
    }

    public boolean contains(Song song) {
        return songs.contains(song);
    }

    public void addSong(Song song) {
        if(contains(song)) {
            throw new PlaylistException(song.getTitle() + " is already in playlist");
        }
        songs.add(song);
    }

    public void removeSong(Song song) {
        if(songs.contains(song)) {
            songs.remove(song);
        } else {
            throw new PlaylistException(song.getTitle() + " does not exist in playlist");
        }
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
