package com.lordsdk.exception;

/**
 * To abstract the exception to the user. Since this primarily involves GET calls,
 * all runtime exceptions of SDK (I/O, Interrupted, JSONSyntax) are handled here.
 */
public class MovieException extends RuntimeException {
    public MovieException(String message) {
        super(message);
    }
}
