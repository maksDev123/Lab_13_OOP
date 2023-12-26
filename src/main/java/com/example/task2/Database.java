package com.example.task2;

public class Database extends БазаДаних{
    private БазаДаних database; 
    public Database(){
        this.database = new БазаДаних();
    }
    public String getUserData(){
        return this.database.отриматиДаніКористувача();
    }
    public String getStaticData(){
        return this.database.отриматиСтатистичніДані();
    }      
}
