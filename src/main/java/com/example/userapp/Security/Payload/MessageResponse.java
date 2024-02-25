package com.example.userapp.Security.Payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageResponse {
    private String message;

    public MessageResponse(String s) {
        this.message=s;
    }
}
