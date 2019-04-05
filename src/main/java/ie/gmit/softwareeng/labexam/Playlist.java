package ie.gmit.softwareeng.labexam;

public class Playlist {
    String playlistName;
    public Playlist(String playlistName) {
        this.playlistName=playlistName;
    }

    public String getName() {
        return playlistName;
    }

    public boolean contains(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addSong(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void removeSong(Song song) {
        throw new UnsupportedOperationException("Not implemented yet");
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
