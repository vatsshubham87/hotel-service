package com.hotel.Hotel.Service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hotel.Hotel.Service.payloads.ApiResponse;

public class GlobalExceptionHandler {
    
      @ExceptionHandler(ResourceNotFoundException.class)
      public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException exception)
      {
          ApiResponse apiResponse = ApiResponse.builder()
         .message(exception.getMessage())
         .success(true)
         .status(HttpStatus.NOT_FOUND)
         .build();

         return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
      }
}
