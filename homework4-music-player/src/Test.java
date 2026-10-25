public class Test {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // playlist: [Night Drive, Slow Tide, Copper Sky, Static Bloom, Low Orbit, Glass Rivers]
        System.out.println("--- 1. Build the playlist ---");
        String[] songsToAdd = {"Night Drive", "Slow Tide", "Copper Sky", "Static Bloom", "Low Orbit", "Glass Rivers"};
        for (int i=0; i<songsToAdd.length; i++) {
            System.out.println(musicPlayer.addSong("s" + (i+1), songsToAdd[i], "Artist" + (i+1)));
        }
        System.out.println("duplicate s3: " + musicPlayer.addSong("s3", "Copper Sky", "Artist3"));
        System.out.println("playlist: " + musicPlayer.showPlaylist());

        System.out.println("--- 2. Look up songs ---");
        System.out.println("find s4: " + check(musicPlayer.findSong("s4")));
        System.out.println("find s9: " + check(musicPlayer.findSong("s9")));

        System.out.println("--- 3. Play and move forward ---");
        System.out.println("play s1: " + check(musicPlayer.play("s1")));
        System.out.println("play s9: " + check(musicPlayer.play("s9")));
        System.out.println("next: " + check(musicPlayer.next()));
        System.out.println("next: " + check(musicPlayer.next()));
        System.out.println("history: " + musicPlayer.showHistory());

        System.out.println("--- 4. Up next ---");
        System.out.println(musicPlayer.queueNext("s1"));
        System.out.println(musicPlayer.queueLater("s5"));
        System.out.println(musicPlayer.queueLater("s6"));
        System.out.println("queue s9: " + musicPlayer.queueNext("s9"));
        System.out.println("up next: " + musicPlayer.showUpNext());
        System.out.println("next: " + check(musicPlayer.next()));
        System.out.println("now playing: " + check(musicPlayer.nowPlaying()));
        System.out.println("history: " + musicPlayer.showHistory());


        System.out.println("--- 5. Back button ---");
        System.out.println("back: " + check(musicPlayer.back()));
        System.out.println("up next: " + musicPlayer.showUpNext());
        System.out.println("history: " + musicPlayer.showHistory());

        System.out.println("--- 6. Remove songs ---");
        System.out.println("remove s5: " + musicPlayer.removeSong("s5"));
        System.out.println("remove current" + " (" + musicPlayer.nowPlaying().getId() + "): " + musicPlayer.removeSong(musicPlayer.nowPlaying().getId()));
        System.out.println("remove s9: " + musicPlayer.removeSong("s9"));
        System.out.println("playlist: "  + musicPlayer.showPlaylist());
        System.out.println("up next: " + musicPlayer.showUpNext());

        System.out.println("--- 7. Removed songs are skipped ---");
        System.out.println("next: " + check(musicPlayer.next()));
        System.out.println("next: " + check(musicPlayer.next()));
        System.out.println("next at end: " + check(musicPlayer.next()));
        System.out.println("now playing: " + check(musicPlayer.nowPlaying()));
        System.out.println("back: " + check(musicPlayer.back()));
        System.out.println("up next: " + musicPlayer.showUpNext());

        System.out.println("--- 8. Play counts ---");
        System.out.println("s1: " + musicPlayer.playCount("s1"));
        System.out.println("s3: " + musicPlayer.playCount("s3"));
        System.out.println("s6: " + musicPlayer.playCount("s6"));
        System.out.println("s5 (removed): " + musicPlayer.playCount("s5"));

        System.out.println("--- 9. Empty player ---");
        MusicPlayer empty = new MusicPlayer();
        System.out.println("next: " + check(empty.next()));
        System.out.println("back: " + check(empty.back()));
        System.out.println("now playing: " + check(empty.nowPlaying()));
        System.out.println("playlist: " + empty.showPlaylist());
    }

    private static String check(Song s) {
        return s == null ? "null" : s.getTitle();
    }
}
