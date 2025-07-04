package userapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleUserNotFound(UserNotFoundException e) {
        return e.getMessage();
    }

    @ExceptionHandler(EmailExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleEmailExists(EmailExistsException e) {
        return e.getMessage();
    }
}
