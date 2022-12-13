package com.example.exanwswear;

import java.io.Serializable;

public class LoginResponse implements Serializable {
    private String id;
    private String email;
    private String nickName;
    private String token;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNickName() {
        return nickName;
    }


    public String getToken() {
        return token;
    }
}
