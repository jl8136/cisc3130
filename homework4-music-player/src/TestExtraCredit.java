public class TestExtraCredit {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        String[] songsToAdd = {"Night Drive", "Slow Tide", "Copper Sky", "Static Bloom", "Low Orbit", "Glass Rivers"};
        for (int i=0; i<songsToAdd.length; i++) {
            player.addSong("s" + (i+1), songsToAdd[i], "Artist" + (i+1));
        }
        System.out.println("playlist: " + player.showPlaylist());


        System.out.println("--- Extra Credit 1 Repeat mode ---");
        System.out.println("repeat mode off: ");
        System.out.println("first song: " + check(player.play("s1")));
        for (int i=0; i<songsToAdd.length; i++) {
            System.out.println("next: " + check(player.next()));
        }
        System.out.println();
        System.out.println("repeat mode on: ");
        player.setRepeat(true);
        System.out.println("first song: " + check(player.play("s1")));
        for (int i=0; i<songsToAdd.length * 2; i++) {
            System.out.println("next: " + check(player.next()));
        }

        System.out.println();
        System.out.println("--- Extra Credit 2 Top Songs ---");
        MusicPlayer newPlayer = new MusicPlayer();
        for (int i=0; i<songsToAdd.length; i++) {
            newPlayer.addSong("s" + (i+1), songsToAdd[i], "Artist" + (i+1));
        }

        for (int i=0; i<1; i++) {
            newPlayer.play("s1");
        }
        for (int i=0; i<5; i++) {
            newPlayer.play("s2");
        }
        for (int i=0; i<10; i++) {
            newPlayer.play("s3");
        }
        for (int i=0; i<15; i++) {
            newPlayer.play("s4");
        }
        for (int i=0; i<20; i++) {
            newPlayer.play("s5");
        }
        for (int i=0; i<25; i++) {
            newPlayer.play("s6");
        }

        System.out.println("top all-time plays: " + newPlayer.topSongs(newPlayer.showPlaylist().size()));
        System.out.println("top 3 plays: " + newPlayer.topSongs(3));

    }

    private static String check(Song s) {
        return s == null ? "null" : s.getTitle();
    }
}
