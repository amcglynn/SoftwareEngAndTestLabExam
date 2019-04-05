package ie.gmit.softwareeng.labexam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Playlist {
    private String pListName;
    ArrayList<Song> list = new ArrayList<Song>();

    public Playlist(String playlistName) {
        this.pListName = playlistName;
    }

    public String getName() {
        return this.pListName;
    }

    public boolean contains(Song song) {
        return(list.contains(song));
    }

    public void addSong(Song song) {
        if(list.contains(song)){
            throw null;
        }
        else {
            list.add(song);
        }
    }

    public void removeSong(Song song) {
        if(list.contains(song)){
            list.remove(song);
        }
        else{
            throw null;
        }
    }

    public int getNumberOfSongs() {
        return(list.size());
    }

    public Song getSongAt(int index) {
        return(list.get(index));
    }

    public void clear() {
        list.clear();
    }

    public void reverse() {
        Collections.reverse(list);
    }

    public Song[] getAllSongs() {
        return list.toArray(new Song[0]);
    }

    public void shuffle() {
        Collections.shuffle(list);
    }

    public Song getCurrentSong() {
        if(list.size()>=1) {
            return (list.get(0));
        }
        else{
            throw null;
        }
    }

    public Song getNextSong() {
        if(list.size()<=1){
            return null;
        }
        else{
            return(list.get(1));
        }
    }

    public void nextSong() {
        Song temp = list.get(0);
        System.out.println(temp);
        int aSize = list.size()-1;
        System.out.println(aSize);
        for(int i=0;i<=aSize;i++){
            list.set(i,list.get(i+1));
            System.out.println(i);
        }
        list.set(aSize,temp);
    }

    public Song getPreviousSong() {
        return list.get(list.size()-1);
    }

    public void previousSong() {
        int aSize = list.size()-1;
        System.out.println(aSize);
        Song temp = list.get(aSize);
        System.out.println(temp);
        for(int x=aSize;x>=0;x--){
            System.out.println(x);
            list.set(x,list.get(x-1));
        }
        list.set(0,temp);
    }

    public void goToIndex(int index) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
