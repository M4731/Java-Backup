package com.matei.SpringMVCDemo.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstrintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if( s == null ){
            return true;
        }
        else {
            return s.startsWith(coursePrefix);
        }

    }
}
