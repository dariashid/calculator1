package pro.sky.calculator.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDividerException extends  IllegalArgumentException{
    public ZeroDividerException(){
        super("You can't divide by zero");
    }
}
