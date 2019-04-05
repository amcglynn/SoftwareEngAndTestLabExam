package ie.gmit.softwareeng.labexam;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlaylistTest {

    Playlist playlist;

    @Before
    public void setUp() {
        playlist = new Playlist("Test Playlist");
    }

    @Test
    public void testGetPlaylistName() {
        assertEquals("Test Playlist", playlist.getName());
    }

    @Test
    public void testContainsReturnsFalseWhenSongIsNotInPlaylist() {
        Song song = new Song("Led Zeppelin", "Good Times Bad Times");
        assertFalse(playlist.contains(song));
    }

    @Test
    public void testAddSong() {
        Song song = new Song("Led Zeppelin", "Dazed and Confused");
        playlist.addSong(song);
        assertTrue(playlist.contains(song));
    }

    @Test(expected = PlaylistException.class)
    public void testAddSongThatIsAlreadyInPlaylistThrowsException() {
        Song song = new Song("Led Zeppelin", "Communication Breakdown");
        playlist.addSong(song);
        playlist.addSong(song);
    }

    @Test
    public void testRemoveSongFromPlaylist() {
        Song song = new Song("Led Zeppelin", "How Many More Times");
        playlist.addSong(song);
        assertTrue(playlist.contains(song));
        playlist.removeSong(song);
        assertFalse(playlist.contains(song));
    }

    @Test//(expected = PlaylistException.class)
    public void testRemoveSongFromPlaylistThrowsExceptionIfItDoesNotExist() {
        Song song = new Song("Led Zeppelin", "Whole Lotta Love");
        playlist.removeSong(song);
    }

    @Test
    public void testGetNumberOfSongs() {
        Song song1 = new Song("Led Zeppelin", "Kashmir");
        Song song2 = new Song("Led Zeppelin", "Rock and Roll");
        Song song3 = new Song("Led Zeppelin", "The Lemon Song");
        Song song4 = new Song("Led Zeppelin", "Moby Dick");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        assertEquals(4, playlist.getNumberOfSongs());
    }

    @Test
    public void testClearPlaylist() {
        Song song1 = new Song("Led Zeppelin", "Immigrant Song");
        Song song2 = new Song("Led Zeppelin", "Stairway to Heaven");
        Song song3 = new Song("Led Zeppelin", "Going to California");
        Song song4 = new Song("Led Zeppelin", "When the Levee Breaks");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        assertEquals(song1, playlist.getSongAt(0));
        assertEquals(song2, playlist.getSongAt(1));
        assertEquals(song3, playlist.getSongAt(2));
        assertEquals(song4, playlist.getSongAt(3));

        playlist.clear();

        assertEquals(0, playlist.getNumberOfSongs());
    }

    @Test
    public void testReversePlaylist() {
        Song song1 = new Song("Led Zeppelin", "The Song Remains the Same");
        Song song2 = new Song("Led Zeppelin", "No Quarter");
        Song song3 = new Song("Led Zeppelin", "The Ocean");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        assertEquals(song1, playlist.getSongAt(0));
        assertEquals(song2, playlist.getSongAt(1));
        assertEquals(song3, playlist.getSongAt(2));

        playlist.reverse();

        assertEquals(song3, playlist.getSongAt(0));
        assertEquals(song2, playlist.getSongAt(1));
        assertEquals(song1, playlist.getSongAt(2));
    }

    @Test
    public void testShuffle() {
        Song song1 = new Song("Led Zeppelin", "Kashmir");
        Song song2 = new Song("Led Zeppelin", "Rock and Roll");
        Song song3 = new Song("Led Zeppelin", "Communication Breakdown");
        Song song4 = new Song("Led Zeppelin", "How Many More Times");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        Song[] songsUnshuffled = playlist.getAllSongs();

        playlist.shuffle();

        Song[] songsShuffled = playlist.getAllSongs();

        assertFalse(Arrays.equals(songsShuffled, songsUnshuffled));
    }

    @Test
    public void testGetAllSongs() {
        Song song1 = new Song("Led Zeppelin", "Trampled Under Foot");
        Song song2 = new Song("Led Zeppelin", "Achilles Last Stand");
        Song song3 = new Song("Led Zeppelin", "Nobody's Fault but Mine");
        Song song4 = new Song("Led Zeppelin", "The Rain Song");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);

        Song[] songs = playlist.getAllSongs();

        assertEquals(song1, songs[0]);
        assertEquals(song2, songs[1]);
        assertEquals(song3, songs[2]);
        assertEquals(song4, songs[3]);
    }

    @Test
    public void testGetCurrentSong() {
        Song song1 = new Song("Led Zeppelin", "Fool in the Rain");
        Song song2 = new Song("Led Zeppelin", "Rock and Roll");

        playlist.addSong(song1);
        playlist.addSong(song2);

        assertEquals(song1, playlist.getCurrentSong());
    }

    @Test
    public void testGetCurrentSongReturnsNullWhenThereIsNoSongInThePlaylist() {
        assertNull(playlist.getCurrentSong());
    }

    @Test
    public void testGetNextSong() {
        Song song1 = new Song("Led Zeppelin", "Ramble On");
        Song song2 = new Song("Led Zeppelin", "Black Dog");

        playlist.addSong(song1);
        playlist.addSong(song2);

        assertEquals(song2, playlist.getNextSong());
    }

    @Test
    public void testGetNextSongReturnsNullWhenAtEndOfThePlaylist() {
        Song song1 = new Song("Led Zeppelin", "Thank You");
        playlist.addSong(song1);
        assertNull(playlist.getNextSong());
    }

    @Test
    public void testGetPreviousSong() {
        Song song1 = new Song("Led Zeppelin", "Bring It on Home");
        Song song2 = new Song("Led Zeppelin", "Heartbreaker");

        playlist.addSong(song1);
        playlist.addSong(song2);

        playlist.nextSong();

        assertEquals(song2, playlist.getCurrentSong());
        assertEquals(song1, playlist.getPreviousSong());
    }

    @Test
    public void testGetPreviousSongReturnsNullWhenAtStartOfThePlaylist() {
        Song song1 = new Song("Led Zeppelin", "Tangerine");
        playlist.addSong(song1);
        assertNull(playlist.getPreviousSong());
    }

    @Test
    public void testMoveToNextSong() {
        Song song1 = new Song("Led Zeppelin", "Friends");
        Song song2 = new Song("Led Zeppelin", "Gallows Pole");

        playlist.addSong(song1);
        playlist.addSong(song2);

        assertEquals(song1, playlist.getCurrentSong());
        playlist.nextSong();
        assertEquals(song2, playlist.getCurrentSong());
    }

    @Test
    public void testMoveToPreviousSong() {
        Song song1 = new Song("Led Zeppelin", "Since I've Been Loving You");
        Song song2 = new Song("Led Zeppelin", "Rock and Roll");

        playlist.addSong(song1);
        playlist.addSong(song2);

        assertEquals(song1, playlist.getCurrentSong());
        playlist.nextSong();
        assertEquals(song2, playlist.getCurrentSong());
        playlist.previousSong();
        assertEquals(song1, playlist.getCurrentSong());
    }

    @Test
    public void testGoToIndex() {
        Song song1 = new Song("Led Zeppelin", "Celebration Day");
        Song song2 = new Song("Led Zeppelin", "Misty Mountain Hop");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.goToIndex(1);

        assertEquals(song2, playlist.getCurrentSong());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGoToIndexThrowsExceptionWhenGoingToANotExistentIndex() {
        Song song1 = new Song("Led Zeppelin", "Four Sticks");
        Song song2 = new Song("Led Zeppelin", "Rock and Roll");
        Song song3 = new Song("Led Zeppelin", "The Battle of Evermore");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.goToIndex(3);
    }
}
