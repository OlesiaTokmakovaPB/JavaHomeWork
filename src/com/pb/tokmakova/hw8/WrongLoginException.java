package com.pb.tokmakova.hw8;

public class WrongLoginException extends Exception{
    private final String detail;

    public WrongLoginException() {
        detail = "Incorrect login";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }

    public void setStackTrace() {
    }
}
