package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User john = new Millenials("John Smith");
        User mary = new YGeneration("Mary Sue");
        User steve = new ZGeneration("Steve Jackson");

        //When
        String johnWillShare = john.sharePost();
        System.out.println("John decided: " + johnWillShare);
        String maryWillShare = mary.sharePost();
        System.out.println("Mary decided: " + maryWillShare);
        String steveWillShare = steve.sharePost();
        System.out.println("Steve decided: " + steveWillShare);

        //Then
        assertEquals("This post will be published on Facebook", johnWillShare);
        assertEquals("This post will be published on Twitter", maryWillShare);
        assertEquals("This post will be published on Snapchat", steveWillShare);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User mary = new YGeneration("Mary Sue");

        //When
        String maryWillShare = mary.sharePost();
        System.out.println("Mary decided: " + maryWillShare);
        mary.setSocialPublisher(new FacebookPublisher());
        maryWillShare = mary.sharePost();
        System.out.println("Mary decided this time: " + maryWillShare);

        //Then
        assertEquals("This post will be published on Facebook", maryWillShare);
    }

}
