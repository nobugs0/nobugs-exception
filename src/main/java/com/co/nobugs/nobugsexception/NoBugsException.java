package com.co.nobugs.nobugsexception;

import org.springframework.http.HttpStatus;

public class NoBugsException extends Exception {

    public NoBugsException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    private final HttpStatus httpStatus;

    public NoBugsException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
