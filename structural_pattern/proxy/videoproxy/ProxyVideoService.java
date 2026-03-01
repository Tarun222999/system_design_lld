package structural_pattern.proxy.videoproxy;

import java.util.HashMap;
import java.util.Map;

import structural_pattern.proxy.concrete.RealVideoservice;
import structural_pattern.proxy.iservice.VideoServiceInterface;

public class ProxyVideoService implements VideoServiceInterface {
    private RealVideoservice realVideoService;
    private Map<String, String> cachedVideos = new HashMap<>();
    private Map<String, Integer> requestCounts = new HashMap<>();

    public ProxyVideoService(RealVideoservice videoservice) {
        this.realVideoService = realVideoService;
    }

    public void playVideo(String userType, String videoName) {
        if (!userType.equals("premium") && videoName.startsWith("Premium")) {
            System.out.println(
                    "Access denied: Premium video requires a premium account.");
            return;
        }

        // Limit requests
        requestCounts.put(userType, requestCounts.getOrDefault(userType, 0) + 1);
        if (requestCounts.get(userType) > 5) {
            System.out.println("Access denied: Too many requests.");
            return;
        }

        if (cachedVideos.containsKey(videoName)) {
            System.out.println("Streaming cached video: " + videoName);

        } else {
            realVideoService.playVideo(userType, videoName);
            cachedVideos.put(videoName, videoName);

        }
    }
}
