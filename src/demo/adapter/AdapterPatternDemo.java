package demo.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","com-buom-xuan.mp3");
        audioPlayer.play("mp4","nhat-ky-vang-anh.mp4");
        audioPlayer.play("vlc","tram-an.vlc");
        audioPlayer.play("avi","demo.avi");
    }
}
