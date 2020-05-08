package com.example.validate.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<Email, String> {
    @Override
    public void initialize(Email annotation){

    }
    @Override
    public boolean isValid(String str, ConstraintValidatorContext ctx){
        if (str == null){
            return true;
        } else {
            return str.matches("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})");
        }
    }
}
