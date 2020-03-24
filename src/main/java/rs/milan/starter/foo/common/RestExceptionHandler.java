package rs.milan.starter.foo.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<Object> handleConflict( Exception ex, WebRequest request) {
        return ResponseEntity.notFound().build();
    }
}
