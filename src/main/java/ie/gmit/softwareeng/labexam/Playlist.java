package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {

    private String playlistName;
    private List<Song> songList = new ArrayList<>();
    private int currentSong = 0;

    public Playlist(String playlistName) {
        this.playlistName=playlistName;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        return songList.contains(song);
    }

    public void addSong(Song song) {
        if (songList.contains(song)) throw new PlaylistException("Song already exists in the playlist");
       songList.add(song);
    }

    public void removeSong(Song song) {
        if (!songList.contains(song)) throw new PlaylistException("Song does not exists in the playlist");
        songList.remove(song);
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
        Song[] songArray = new Song[songList.size()];

        for (int i = 0; i < songList.size(); i++) {
            songArray[i] = songList.get(i);
        }
        return songArray;

    }

    public void shuffle() {
        Collections.shuffle(songList);
    }

    public Song getCurrentSong() {
        if (songList.isEmpty()) return null;
        return songList.get(currentSong);
    }

    public Song getNextSong() {
        if (currentSong+2 > songList.size()) return null;
        return songList.get(currentSong+1);
    }

    public void nextSong() {
        if (currentSong+2 > songList.size()) return;
        currentSong++;
    }

    public Song getPreviousSong() {
        if(currentSong-1 < 0) return null;
        return songList.get(currentSong-1);
    }

    public void previousSong() {
        if (currentSong-1 < 0) return;
        currentSong--;
    }

    public void goToIndex(int index) {
        if (index<0 || index> songList.size()-1) throw new IndexOutOfBoundsException();
        currentSong = index;
    }
}
