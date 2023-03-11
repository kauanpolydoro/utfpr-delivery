package com.delivery.app.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.delivery.app.dto.ExceptionResponseDTO;
import com.delivery.app.exception.NotFoundException;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    
	@ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<Object> handleNotFoundException(NotFoundException ex, WebRequest request) {
        ExceptionResponseDTO exceptionResponse = new ExceptionResponseDTO();

        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionResponse.setMensagem(ex.getLocalizedMessage());

        return handleExceptionInternal(ex, exceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}

