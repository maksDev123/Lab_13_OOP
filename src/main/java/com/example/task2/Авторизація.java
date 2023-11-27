package com.example.task2;

public class Авторизація {
    public Boolean login(Database db){
        return db.getUserEmail() == "test";
    }
}
