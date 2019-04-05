package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;

public class Playlist {

    String Playlistname;
    ArrayList<Song> array = new ArrayList<Song>();
    public Playlist(String playlistName) {
        this.Playlistname = playlistName;
    }

    public String getName() {
        return Playlistname;
    }

    public boolean contains(Song song) {
        if(array.contains(song))
        {
            return true;
        }
        else
            return false;
    }

    public void addSong(Song song) {
        if (array.contains(song)){
            throw new PlaylistException("Song already in");
        }
        else
        {
            array.add(song);
        }
    }

    public void removeSong(Song song) {
        if (array.contains(song))
        {
            array.remove(song);
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
