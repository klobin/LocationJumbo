package com.jumbo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Something unusual happened while searching for address specified,")
public class LocationSearchException extends RuntimeException {

	private static final long serialVersionUID = -7030828592632376970L;

	public LocationSearchException(String message) {
		super(message);
	}

}
