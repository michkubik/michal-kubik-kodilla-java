package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "This post will be published on Facebook";
    }
}
