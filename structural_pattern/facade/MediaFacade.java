package structural_pattern.facade;

import java.util.Scanner;

import structural_pattern.facade.concrete.ImageViewer;
import structural_pattern.facade.concrete.MusicPlayer;
import structural_pattern.facade.concrete.VideoPlayer;

public class MediaFacade {
    private MusicPlayer musicPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public MediaFacade() {
        this.musicPlayer = new MusicPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageViewer = new ImageViewer();
    }

    public void performAction(String action) {
        switch (action.toLowerCase()) {
            case "playmusic":
                musicPlayer.initializeAudioDrivers();
                musicPlayer.decodeAudio();
                musicPlayer.startPlayback();
                break;
            case "playvideo":
                videoPlayer.setupRenderingEngine();
                videoPlayer.loadVideoFile();
                videoPlayer.playVideo();
                break;
            case "viewimage":
                imageViewer.loadImageFile();
                imageViewer.applyScaling();
                imageViewer.displayImage();
                break;
            default:
                System.out.println("Invalid action!");
        }
    }
}
