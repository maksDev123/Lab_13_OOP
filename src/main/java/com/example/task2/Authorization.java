package com.example.task2;

public class Authorization extends Авторизація{
    private Авторизація auth;
    private Database database;
    public Authorization(){
        this.database = new Database();
        this.auth = new Авторизація();
    }
    public boolean login(){
        return this.auth.авторизуватися(database);
    }
}
