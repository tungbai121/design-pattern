package org.example;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("https://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("https://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.println("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars... ");
        experienceNetworkLatency();
        HashMap<String, Video> videoMap = new HashMap<>();
        videoMap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        videoMap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        videoMap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        videoMap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        videoMap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        System.out.println("Done!" + "\n");

        return videoMap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video... ");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!" + "\n");

        return video;
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
