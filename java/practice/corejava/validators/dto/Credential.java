package practice.corejava.validators.dto;

import lombok.Getter;
import lombok.Setter;
import practice.corejava.validators.marker.LoginChange;
import practice.corejava.validators.marker.PasswordChange;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Credential {
    @NotNull(message = "Login cannot be null", groups = LoginChange.class)
    @Size(min = 8, max = 40, message = "Login must be between 8 and 40 characters", groups = LoginChange.class)
    private String login;

    @NotNull(message = "Existing password cannot be null", groups = PasswordChange.class)
    @Size(min = 8, message = "Password cannot be shorter than 8 characters", groups = PasswordChange.class)
    private String existingPassword;

    @NotNull(message = "New password cannot be null", groups = PasswordChange.class)
    @Size(min = 8, message = "Password cannot be shorter than 8 characters", groups = PasswordChange.class)
    private String newPassword;
}
