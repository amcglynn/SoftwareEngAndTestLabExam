package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    ArrayList<Song> songs = new ArrayList<Song>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        return songs.contains(song);
    }

    public void addSong(Song song) {
        if (songs.contains(song))
            throw new PlaylistException("Song already exists");
        else
            songs.add(song);
    }

    public void removeSong(Song song) {
        if (songs.contains(song)){
            songs.remove(song);
        }
        else throw new PlaylistException("Song not found");
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
