package com.naresh.observerpattern;

public class Youtube {

    public static void main(String[] args){

        YoutubeChannel nareshSharma = new YoutubeChannel();

        Subscriber subscriberOne = new Subscriber("Karan");
        Subscriber subscriberTwo = new Subscriber("Damru");
        Subscriber subscriberThree = new Subscriber("Divu");
        Subscriber subscriberFour = new Subscriber("Minki");
        Subscriber subscriberFive = new Subscriber("Sheru");
        Subscriber subscriberSix = new Subscriber("Vishu");
        Subscriber subscriberSeven = new Subscriber("Raju");
        Subscriber subscriberEight = new Subscriber("Kalu");

        nareshSharma.subscribe(subscriberOne);
        nareshSharma.subscribe(subscriberTwo);
        nareshSharma.subscribe(subscriberThree);
        nareshSharma.subscribe(subscriberFour);
        nareshSharma.subscribe(subscriberFive);
        nareshSharma.subscribe(subscriberSix);
        nareshSharma.subscribe(subscriberSeven);
        nareshSharma.subscribe(subscriberEight);

        subscriberOne.subscribeChannel(nareshSharma);
        subscriberTwo.subscribeChannel(nareshSharma);
        subscriberThree.subscribeChannel(nareshSharma);
        subscriberFour.subscribeChannel(nareshSharma);
        subscriberFive.subscribeChannel(nareshSharma);
        subscriberSix.subscribeChannel(nareshSharma);
        subscriberSeven.subscribeChannel(nareshSharma);
        subscriberEight.subscribeChannel(nareshSharma);

        nareshSharma.upload("Observer Design Pattern");

        nareshSharma.unSubscribe(subscriberFour);

        nareshSharma.upload("Java Basics");

    }
}
