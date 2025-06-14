package practice.corejava.validators.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;
import java.util.Date;

public class BirthDateValidator implements ConstraintValidator<BirthDate, Date> {
    @Override
    public boolean isValid(Date date, ConstraintValidatorContext context) {
        Calendar dateInCalendar = Calendar.getInstance();
        dateInCalendar.setTime(date);

        return Calendar.getInstance().get(Calendar.YEAR) > dateInCalendar.get(Calendar.YEAR);
    }
}
