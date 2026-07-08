import java.util.LinkedList;

public class MusicPlaylistEngine {
    private LinkedList<String> recentlyPlayed = new LinkedList<>();
    private static final int MAX_SIZE = 10;

    public void playSong(String song) {
        // If song is already in the list, remove it to bring it to the top
        recentlyPlayed.remove(song);
        recentlyPlayed.addFirst(song);
        
        System.out.println("Played: " + song);
        
        if (recentlyPlayed.size() > MAX_SIZE) {
            String removed = recentlyPlayed.removeLast();
            System.out.println("Playlist exceeded max size. Removed oldest song: " + removed);
        }
    }

    public void searchSong(String song) {
        if (recentlyPlayed.contains(song)) {
            System.out.println("'" + song + "' exists in the recently played history.");
        } else {
            System.out.println("'" + song + "' is NOT in the recently played history.");
        }
    }

    public void displayHistory() {
        System.out.println("--- Recently Played History ---");
        if (recentlyPlayed.isEmpty()) {
            System.out.println("No songs played yet.");
        } else {
            for (int i = 0; i < recentlyPlayed.size(); i++) {
                System.out.println((i + 1) + ". " + recentlyPlayed.get(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Music Playlist Recommendation Engine ===");
        MusicPlaylistEngine engine = new MusicPlaylistEngine();
        
        for (int i = 1; i <= 12; i++) {
            engine.playSong("Song " + i);
        }
        
        System.out.println();
        engine.displayHistory();
        
        System.out.println();
        engine.searchSong("Song 5");
        engine.searchSong("Song 2");
    }
}
