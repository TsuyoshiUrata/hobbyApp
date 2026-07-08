package com.example.hobby;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        // 親クラスにメッセージを渡す
        super(message); 
    }
}

