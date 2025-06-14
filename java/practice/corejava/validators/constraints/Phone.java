package practice.corejava.validators.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = PhoneValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
public @interface Phone {
    String message() default "{practice.corejava.validators.constraints.Phone.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
