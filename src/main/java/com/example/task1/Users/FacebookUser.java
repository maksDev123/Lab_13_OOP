package com.example.task1.Users;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FacebookUser {
    private String UserEmail;
    private String country;
    private String lastActivateTime;
}
