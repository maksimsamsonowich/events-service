package eu.senla.eventsservice.exception.event;

public class NoSuchEventException extends RuntimeException {

    public NoSuchEventException(String errorMessage) {
        super(errorMessage);
    }

}
