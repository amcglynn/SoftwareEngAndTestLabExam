package ie.gmit.softwareeng.labexam;

public class Playlist {
    String playlistName;

    public Playlist(String playlistName) {
        this.playlistName = "Test Playlist";
    }

    public String getName() {
        //throw new PlaylistException("Not implemented yet");
        return playlistName;
    }

    public boolean contains(Song song) {
        //throw new PlaylistException("Not implemented yet");
        return false;
    }

    public String addSong(Song song) {
        throw new PlaylistException("Not implemented yet");
        //song = new Song("Led Zeppelin", "Communication Breakdown");
        //this.playlistName = addSong(song);
        //playlistName = addSong(song);
        //playlistName.contains(song);
        //return null;
    }//Come back to

    public void removeSong(Song song) {
        throw new PlaylistException("Not implemented yet");
    }

    public int getNumberOfSongs() {
        throw new PlaylistException("Not implemented yet");
    }

    public Song getSongAt(int index) {
        throw new PlaylistException("Not implemented yet");
    }

    public void clear() {
        throw new PlaylistException("Not implemented yet");
    }

    public void reverse() {
        throw new PlaylistException("Not implemented yet");
    }

    public Song[] getAllSongs() {
        throw new PlaylistException("Not implemented yet");
    }

    public void shuffle() {
        throw new PlaylistException("Not implemented yet");
    }

    public Song getCurrentSong() {
        throw new PlaylistException("Not implemented yet");
    }

    public Song getNextSong() {
        throw new PlaylistException("Not implemented yet");
    }

    public void nextSong() {
        throw new PlaylistException("Not implemented yet");
    }

    public Song getPreviousSong() {
        throw new PlaylistException("Not implemented yet");
    }

    public void previousSong() {
        throw new PlaylistException("Not implemented yet");
    }

    public void goToIndex(int index) {
        throw new PlaylistException("Not implemented yet");
    }
}
