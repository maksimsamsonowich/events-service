package eu.senla.eventsservice.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    public String runtimeExceptionsHandler(String errorMessage) {

        return "index";
    }

}
