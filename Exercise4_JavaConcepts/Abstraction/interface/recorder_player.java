public class recorder_player {
    public static void main(String[] args) {
        MediaDevice device = new MediaDevice();
        device.play();
        device.record();
    }
}

interface Player {
    void play();
}

interface Recorder {
    void record();
}

class MediaDevice implements Player, Recorder {
    public void play() {
        System.out.println("Playing audio...");
    }

    public void record() {
        System.out.println("Recording audio...");
    }
}

