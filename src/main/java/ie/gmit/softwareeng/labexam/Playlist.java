package ie.gmit.softwareeng.labexam;


import java.util.ArrayList;



public class Playlist {

    String playlistName;
    ArrayList<String> myList = new ArrayList<String>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        //ArrayList<String> myList = new ArrayList<String>();
        //add to the array
        //myList.add(playlistName);
    }

    public String getName() {
        return playlistName;
    }


    public boolean contains(Song song) {
        //String title = "Good Times Bad Times";
        //System.out.println(song.getTitle());
        if(myList.contains(song.getTitle()) ){
            System.out.println("Song in playlist");

            return true;
        }
        else {
            System.out.println("Song not in playlist");

            return false;
        }
    }


    public void addSong(Song song) {
        System.out.println("Adding: " + song.getTitle() );
        myList.add(song.getTitle());
    }



    public void removeSong(Song song) {
        System.out.println("Removing: " + song.getTitle() );
        myList.remove(song.getTitle());
    }

    public int getNumberOfSongs() {
        System.out.println("No of songs: " + myList.size() );

        return myList.size();
    }

    public Song getSongAt(int index) {
        //throw new UnsupportedOperationException("Not implemented yet");
        Object s= myList.get(index);

        //return s;
        throw new UnsupportedOperationException("Not done yet");
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
        myList.indexOf(index);
    }
}
