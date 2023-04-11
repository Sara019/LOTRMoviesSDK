package com.lordsdk.exception;

/**
 * Custom exception to handle missing ID values for API calls
 */
public class MissingIdException extends RuntimeException {
    public MissingIdException(String message) {
        super(message);
    }
}
