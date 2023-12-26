package com.example.task1.Users;

public class MessageSender {
    public static boolean send_message(UserAdapter user, String messege){
        if (user.getLastActive() < 60){
            System.out.println("Message send");
            return true;
        }
        return false;
    }
}
