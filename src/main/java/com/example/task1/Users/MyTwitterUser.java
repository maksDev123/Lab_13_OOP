package com.example.task1.Users;


public class MyTwitterUser implements MyUser{
    public TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserEmail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public int getLastActive() {
        return twitterUser.getLastActivateTime();
    }
    
}
