package practice.corejava.validators.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class Subscription {
    private boolean enabled;

    @NotEmpty(message = "At least one subscription has to be enabled/disabled")
    private List<@Min(value = 5, message = "Subscription must contain at least 5 characters") String> subscription;

}
