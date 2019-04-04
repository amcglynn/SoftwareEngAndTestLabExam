package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private final String playlistName;
    private List<Song> songs;

    private int currentSong;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        songs = new ArrayList<>();
        currentSong = 0;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        return songs.contains(song);
    }

    public void addSong(Song song) {
        if (songs.contains(song)) {
            throw new PlaylistException("Song already in playlist");
        }
        songs.add(song);
    }

    public void removeSong(Song song) {
        if (!songs.contains(song)) {
            throw new PlaylistException("Song not in playlist");
        }
        songs.remove(song);
    }

    public int getNumberOfSongs() {
        return songs.size();
    }

    public Song getSongAt(int i) {
        return songs.get(i);
    }

    public void clear() {
        songs.clear();
    }


    public void reverse() {
        Collections.reverse(songs);
    }

    public Song[] getAllSongs() {
        Song[] songArray = new Song[songs.size()];
        return songs.toArray(songArray);
    }

    public void shuffle() {
        Collections.shuffle(songs);
    }

    public Song getCurrentSong() {
        if (songs.size() == 0) {
            return null;
        }

        return songs.get(currentSong);
    }

    public Song getNextSong() {
        if ((currentSong + 1) >= songs.size()) {
            return null;
        }
        return songs.get(currentSong + 1);
    }

    public void nextSong() {
        currentSong++;
    }

    public Song getPreviousSong() {
        if (currentSong == 0) {
            return null;
        }
        return songs.get(currentSong - 1);
    }

    public void previousSong() {
        currentSong--;
    }

    public void goToIndex(int i) {
        if (i < 0 || i >= songs.size()) {
            throw new IndexOutOfBoundsException("No song at index " + i);
        }

        currentSong = i;
    }
}
