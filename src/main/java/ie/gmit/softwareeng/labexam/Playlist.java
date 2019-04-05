package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String playlistName;
    ArrayList<Song> songs = new ArrayList<Song>();
    Song currentSong;
    boolean firstSong = true;

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
        else{
            songs.add(song);
            if (firstSong){
                currentSong = songs.get(0);
                firstSong = false;
            }
        }

    }

    public void removeSong(Song song) {
        if (songs.contains(song)){
            songs.remove(song);
        }
        else throw new PlaylistException("Song not found");
    }

    public int getNumberOfSongs() {
        return songs.size();
    }

    public Song getSongAt(int index) {
        return songs.get(index);
    }

    public void clear() {
        songs.clear();
    }

    public void reverse() {
        Collections.reverse(songs);
    }

    public Song[] getAllSongs() {
        Song[] allSongs = new Song[songs.size()];
        int i = 0;
        for ( Song song: songs){
            allSongs[i] = song;
            i++;
        }
        return allSongs;
    }

    public void shuffle() {
        Collections.shuffle(songs);
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public Song getNextSong() {

        return (songs.size() > songs.indexOf(currentSong) + 1) ? (songs.get(songs.indexOf(currentSong) + 1)) : null;
    }

    public void nextSong() {
        currentSong  = songs.get(songs.indexOf(currentSong) + 1);
    }

    public Song getPreviousSong() {
        return ( songs.size() > 1 && 0 >= songs.indexOf(currentSong) - 1) ? (songs.get(songs.indexOf(currentSong) - 1)) : null;
    }

    public void previousSong() {
        currentSong  = songs.get(songs.indexOf(currentSong) - 1);
    }

    public void goToIndex(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
