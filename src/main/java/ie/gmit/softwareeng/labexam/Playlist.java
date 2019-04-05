package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String playlistName;
    private ArrayList<Song> songList;
    private int currentSongIndex;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        songList = new ArrayList<>();
        currentSongIndex = 0;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        return songList.contains(song);
    }

    public void addSong(Song song) {
        if(songList.contains(song)) throw new PlaylistException("Song already on playlist");
        else songList.add(song);
    }

    public void removeSong(Song song) {
        if(!songList.contains(song)) throw new PlaylistException("Song is not in playlist!");
        else songList.remove(song);
    }

    public int getNumberOfSongs() {
        return songList.size();
    }

    public Song getSongAt(int index) {
        return songList.get(index);
    }

    public void clear() {
        songList.clear();
    }

    public void reverse() {
        Collections.reverse(songList);
    }

    public Song[] getAllSongs() {
        Song[] result = new Song[songList.size()];
        for (int i = 0; i < songList.size(); i++) result[i] = songList.get(i);
        return result;
    }

    public void shuffle() {
        Collections.shuffle(songList);
    }

    public Song getCurrentSong() {
        if(songList.size() <= 0) return null;
        else return songList.get(currentSongIndex);
    }

    public Song getNextSong() {
        if(currentSongIndex >= songList.size()-1) return null;
        else return songList.get(currentSongIndex + 1);
    }

    public void nextSong() {
        if(currentSongIndex < songList.size()-1) currentSongIndex++;
        else throw new PlaylistException("At end of playlist!");
    }

    public Song getPreviousSong() {
        if(currentSongIndex <= 0) return null;
        else return songList.get(currentSongIndex - 1);
    }

    public void previousSong() {
        if (currentSongIndex >= 0) currentSongIndex--;
        else throw new PlaylistException("At start of playlist!");
    }

    public void goToIndex(int index) {
        if (index >= songList.size() || index < 0) throw new IndexOutOfBoundsException("Index out of bounds");
        else currentSongIndex = index;
    }
}
