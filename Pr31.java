import java.util.*;

public class pr31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song1");
        playlist.add("Song2");
        playlist.add("Song3");
        playlist.add("Song4");
        playlist.add("Song5");

        System.out.println("Full Playlist:");
        System.out.println(playlist);

        String first = playlist.removeFirst();
        System.out.println("\nPlaying: " + first);
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        String last = playlist.removeLast();
        System.out.println("\nSkipped: " + last);
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}

// Output:
// Full Playlist:
// [Song1, Song2, Song3, Song4, Song5]
//
// Playing: Song1
// Playlist after playing first song:
// [Song2, Song3, Song4, Song5]
//
// Skipped: Song5
// Playlist after skipping last song:
// [Song2, Song3, Song4]
