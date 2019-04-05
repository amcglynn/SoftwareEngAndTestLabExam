package ie.gmit.softwareeng.labexam;

public class Playlist {

    public String playlistName;
    public String name;
    public String song;
    public String songAt;
    public String allSongs;
    //ArrayList<Song>;


    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.song = song;
        this.songAt = songAt;
        this.allSongs = allSongs;

    }
    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Song addSong(Song song) {
        return song;
    }

    public void removeSong(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getNumberOfSongs() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getSongAt(int index) {
        return songAt;
    }

    public void clear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void reverse() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getAllSongs() {
        return allSongs;
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
