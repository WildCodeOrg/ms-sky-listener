package org.skyhigh.msskylistener.controller.ControllerAdvices;

import org.skyhigh.msskylistener.model.DTO.exceptionDTOs.ErrorDTO;
import org.skyhigh.msskylistener.validation.exceptions.RequestException;
import org.skyhigh.msskylistener.validation.exceptions.RequiredParameterDidNotSetException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler {

    @ResponseBody
    @ExceptionHandler({RequiredParameterDidNotSetException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    protected ErrorDTO requestParameterExceptionHandler(RequestException ex) {
        return ErrorDTO.builder()
                .code(ex.getCode())
                .message(ex.getMessage())
                .build();
    }
}
