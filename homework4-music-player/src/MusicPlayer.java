import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;

public class MusicPlayer {
    private PlaylistNode head;
    private PlaylistNode tail;

    private HashMap<String, PlaylistNode> library = new HashMap<>();
    private HashMap<String, Integer> playCounts = new HashMap<>();

    Stack<Song> history = new Stack<>();
    ArrayDeque<Song> queue = new ArrayDeque<>();

    private Song current = null;


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

    public ArrayList<String> showPlaylist() {
        ArrayList<String> titles = new ArrayList<>();
        PlaylistNode node = head;
        while (node != null) {
            titles.add(node.song.getTitle());
            node = node.next;
        }
        return titles;
    }

    public Song play(String id) {
        PlaylistNode node = library.get(id);
        if (node == null) return null;

        if (current != null) {
            history.push(current);
        }

        makeCurrent(node.song);
        return current;
    }

    public Song nowPlaying() {
        return current;
    }

    public int playCount(String id) {
        Integer count = playCounts.get(id);
        return count == null ? 0 : count;
    }

    public Song next() {
        Song nextSong = null;

        while (!queue.isEmpty()) {
            Song song = queue.pollFirst();
            if (library.containsKey(song.getId())) {
                nextSong = song;
                break;
            }
        }

        if (nextSong == null && current != null) {
            PlaylistNode currentNode = library.get(current.getId());
            PlaylistNode check = null;
            if (currentNode != null) {
                check = currentNode.next;
            }

            while (check != null) {
                if (library.containsKey(check.song.getId())) {
                    nextSong = check.song;
                    break;
                }
                check = check.next;
            }
        }

        if (nextSong == null) return null;

        if (current != null) history.push(current);
        makeCurrent(nextSong);
        return nextSong;
    }

    public Song back() {
        Song prev = null;
        while (!history.isEmpty()) {
            Song song = history.pop();
            if (library.containsKey(song.getId())) {
                prev = song;
                break;
            }
        }
        if (prev == null) return null;

        if (current != null) queue.addFirst(current);
        makeCurrent(prev);
        return current;
    }

    public boolean queueNext(String id) {
        PlaylistNode node = library.get(id);
        if (node == null) return false;

        queue.addFirst(node.song);
        return true;
    }

    public boolean queueLater(String id) {
        PlaylistNode node = library.get(id);
        if (node == null) return false;

        queue.add(node.song);
        return true;
    }

    public ArrayList<String> showUpNext() {
        ArrayList<String> list = new ArrayList<>();

        if (!queue.isEmpty()) {
            for (Song song : queue) {
                if (library.containsKey(song.getId())) {
                    list.add(song.getTitle());
                }
            }
        }
        else if (current != null) {
            PlaylistNode currNode = library.get(current.getId());
            PlaylistNode node = null;
            if (currNode != null) {
                node = currNode.next;
            }

            while (node != null) {
                if (library.containsKey(node.song.getId())) {
                    list.add(node.song.getTitle());
                }
                node = node.next;
            }
        }

        return list;
    }

    public ArrayList<String> showHistory() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = history.size() - 1; i >= 0; i--) {
            Song song = history.get(i);
            if (library.containsKey(song.getId())) list.add(song.getTitle());
        }
        return list;
    }

    public boolean removeSong(String id) {
        if (current != null && current.getId().equals(id)) return false;


        PlaylistNode node = library.remove(id);
        if (node == null) return false;


        playCounts.remove(id);

        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;


        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;

        return true;
    }

    private void makeCurrent(Song song) {
        current = song;
        if (song != null) {
            Integer count = playCounts.get(song.getId());
            if (count == null) count = 0;
            count++;
            playCounts.put(song.getId(), count);
        }
    }
}

