package ie.gmit.softwareeng.labexam;

import java.util.*;

public class Playlist {
    private List<Song> songList = new ArrayList<>();
    private String playlistName;
    private int songIndex = 0;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        return songList.stream().anyMatch(s -> s.equals(song));
    }

    public void addSong(Song song) {
        if(contains(song)) {
            throw new PlaylistException("Song is already in " + this.getName());
        }
        songList.add(song);
    }

    public void removeSong(Song song) {
        if(!contains(song)) {
            throw new PlaylistException("Song does not exist in " + this.getName());
        }
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
        Song[] songs = new Song[songList.size()];

        for(int index = 0; index < songList.size(); index++) {
            songs[index] = songList.get(index);
        }

        return songs;
    }

    public void shuffle() {
        int totalSongs = songList.size();

        Random random = new Random();
        for (int tempIndex = 0; tempIndex < totalSongs; tempIndex++) {
            Song currentSong = this.getSongAt(tempIndex);
            int randomIndex = tempIndex + random.nextInt(totalSongs - tempIndex);

            songList.set(tempIndex, this.getSongAt(tempIndex));
            songList.set(randomIndex, currentSong);
        }
    }

    public Song getCurrentSong() {
        if(songList.isEmpty()) {
            return null;
        }
        return this.getSongAt(songIndex);
    }

    public Song getNextSong() {
        if(songIndex+1 >= songList.size())
            return null;

        return this.getSongAt(songIndex+1);
    }

    public void nextSong() {
        if(songIndex > songList.size())
            return;

        songIndex++;
    }

    public Song getPreviousSong() {
        if(songIndex <= 0)
            return null;

        return this.getSongAt(songIndex-1);
    }

    public void previousSong() {
        if(songIndex <= 0)
            return;

        songIndex--;
    }

    public void goToIndex(int index) {
        if(!this.contains(getSongAt(index)))
            throw new IndexOutOfBoundsException("Song index does not exist.");

        songIndex = index;
    }
}
