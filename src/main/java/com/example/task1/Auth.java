package com.example.task1;

import com.example.task1.Users.FacebookUser;
import com.example.task1.Users.MyFacebookUser;
import com.example.task1.Users.MyUser;

public class Auth {
    public MyUser login(){
        return new MyFacebookUser(new FacebookUser());
    }

    public void sendMail(MyUser user){
        String email = new String();

    }
}

