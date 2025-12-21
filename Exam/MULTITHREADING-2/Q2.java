// 2️⃣ Music Player
// Create threads for PlaySong, DisplayLyrics, and UpdateProgressBar.
// Run them concurrently.

// Play song thread
class PlaySong extends Thread {
    public void run() {
        System.out.println("Playing song...");
    }
}

// Display lyrics thread
class DisplayLyrics extends Thread {
    public void run() {
        System.out.println("Displaying lyrics...");
    }
}

// Update progress bar thread
class UpdateProgressBar extends Thread {
    public void run() {
        System.out.println("Updating progress bar...");
    }
}

public class Q2 {
    public static void main(String[] args) {

        PlaySong t1 = new PlaySong();
        DisplayLyrics t2 = new DisplayLyrics();
        UpdateProgressBar t3 = new UpdateProgressBar();

        t1.start();
        t2.start();
        t3.start();
    }
}
