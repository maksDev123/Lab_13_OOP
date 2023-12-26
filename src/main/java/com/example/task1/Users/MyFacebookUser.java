package com.example.task1.Users;

public class MyFacebookUser implements MyUser{
    public FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public int getLastActive() {
        return facebookUser.getLastActivateTime();
    }
    
}
