package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.Collections;
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
        return songs.size();
    }

    public Song getSongAt(int index) {
        return songs.get(index);
    }

    public void clear() {
        songs.removeAll(songs);
    }

    public void reverse() {
        Collections.reverse(songs);
    }

    public Song[] getAllSongs() {
        Song[] array = new Song[songs.size()];
        for(int index = 0; index < songs.size(); index++) {
            array[index] = songs.get(index);
        }
        return array;
    }

    public void shuffle() {
        Collections.shuffle(songs);
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
