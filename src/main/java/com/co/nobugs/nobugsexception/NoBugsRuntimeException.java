package com.co.nobugs.nobugsexception;

import org.springframework.http.HttpStatus;

public class NoBugsRuntimeException extends RuntimeException{

	public NoBugsRuntimeException(String message) {
		super(message);
		this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	}

	public NoBugsRuntimeException(String message, Throwable cause, HttpStatus httpStatus) {
		super(message, cause);
		this.httpStatus = httpStatus;
	}

	private final HttpStatus httpStatus;

	public NoBugsRuntimeException(String message, HttpStatus httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}