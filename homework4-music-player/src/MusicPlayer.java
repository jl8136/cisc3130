import java.util.HashMap;

public class MusicPlayer {
    private PlaylistNode head;
    private PlaylistNode tail;

    private HashMap<String, PlaylistNode> library = new HashMap<>();


    public boolean addSong(String id, String title, String artist) {
        if (library.containsKey(id))  return false;

        Song song = new Song(id,title,artist);
        PlaylistNode node = new PlaylistNode(song);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        library.put(id,node);
        return true;
    }

    public Song findSong(String id) {
        PlaylistNode node = library.get(id);
        return node == null ? null : node.song;
    }

}

