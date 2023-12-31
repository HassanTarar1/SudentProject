package com.studentinfo.advice;

import com.studentinfo.exception.CourseNotFoundException;
import com.studentinfo.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> invalidArgumentHandles(MethodArgumentNotValidException ex) {
        Map<String, String> error = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(er -> {
            error.put(er.getField(), er.getDefaultMessage());
        });
        return error;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(StudentNotFoundException.class)
    public Map<String, String> handleBusinessException(StudentNotFoundException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());
        return errorMap;
    }


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(CourseNotFoundException.class)
    public Map<String, String> handleBusinessException(CourseNotFoundException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());
        return errorMap;
    }


}