package com.example.task1.Users;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TwitterUser {
    private String UserEmail;
    private String country;
    private int lastActivateTime;

}
