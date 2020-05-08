package com.example.validate.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailConstraintValidator.class)
@Target(value = {ElementType.METHOD,ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String message() default  "Email is invalid!!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
