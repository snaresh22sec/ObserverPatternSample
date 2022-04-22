package com.naresh.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private List<Subscriber> subscriberList = new ArrayList<>();
    String videoTitle;

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers(){
        for(Subscriber subscriber: subscriberList){
            subscriber.upload();
        }
    }

    public void upload(String title){
        this.videoTitle = title;
        notifySubscribers();
    }

}
