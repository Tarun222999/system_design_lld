package structural_pattern.proxy.concrete;

import structural_pattern.proxy.iservice.VideoServiceInterface;

public class RealVideoservice implements VideoServiceInterface {
    public void playVideo(String userType, String videoName) {
        System.out.println("Streaming video:" + videoName);
    }
}
