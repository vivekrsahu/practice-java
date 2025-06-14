package practice.corejava.validators.dto;

import lombok.Getter;
import lombok.Setter;
import practice.corejava.validators.constraints.Phone;

import javax.validation.constraints.Email;

@Getter
@Setter
public class ContactData {
    @Email(message = "Email address must be valid", regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")
    private String email;
    @Phone
    private String phoneNumber;
}
