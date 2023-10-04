package testit.com.example.Student_postman1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ResourceNotFoundException {

    public ResourceNotFoundException(String s) {
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class resourceNotFoundException extends RuntimeException{

        public resourceNotFoundException(String message){
            super(message);
        }
    }
}
