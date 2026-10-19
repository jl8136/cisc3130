public class PlaylistNode {
    Song song;
    PlaylistNode prev;
    PlaylistNode next;

    PlaylistNode(Song song) {
        this.song = song;
        this.prev = null;
        this.next = null;
    }
}
