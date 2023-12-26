package com.example.task1.Users;

public class UserAdapter implements MyUser{
    public MyUser user;
    
    public UserAdapter(MyUser user){
        this.user = user;
    }

    @Override
    public String getEmail() {
        return this.user.getEmail();
    }

    @Override
    public String getCountry() {
        return this.user.getCountry();

    }

    @Override
    public int getLastActive() {
         return this.user.getLastActive();
    }
    
}
