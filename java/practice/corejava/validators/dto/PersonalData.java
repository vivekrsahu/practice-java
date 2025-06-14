package practice.corejava.validators.dto;

import lombok.Getter;
import lombok.Setter;
import practice.corejava.validators.constraints.BirthDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Getter
@Setter
public class PersonalData {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotNull
    @Positive(message = "Age has to be greater than zero")
    private int age;

    @BirthDate(message = "Birth date has to be a date from the past")
    private LocalDate birthDate;
}
