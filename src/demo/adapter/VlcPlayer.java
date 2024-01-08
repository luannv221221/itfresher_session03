package demo.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file "+fileName);
    }
}
