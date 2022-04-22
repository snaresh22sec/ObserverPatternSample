package com.naresh.observerpattern;


public class Subscriber {
    private String name;
    private YoutubeChannel youtubeChannel = new YoutubeChannel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void upload(){
        System.out.println("Hey "+name+" video is uploaded for "+youtubeChannel.videoTitle);
    }

    public void subscribeChannel(YoutubeChannel channel){
        youtubeChannel = channel;
    }
}
