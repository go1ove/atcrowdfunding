package com.go1ove.atcrowdfunding.exception;

/**
 * @author go1ove
 * @create 2019-04-30-13:08
 */
public class LoginFailException extends RuntimeException{

    public LoginFailException(String message){
        super(message);
    }
}
