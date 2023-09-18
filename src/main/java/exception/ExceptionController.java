package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController
{
    @ExceptionHandler(value = {ExceptionNotFound.class})
   public ResponseEntity<Object>  handleExceptionNotFound(ExceptionNotFound exceptionNotFound)
   {
       Exception exception=new Exception(
             exceptionNotFound.getMessage(),
             exceptionNotFound.getCause(),
             HttpStatus.NOT_FOUND
       );

       return  new ResponseEntity<>(exception,HttpStatus.NOT_FOUND);
   }



}
