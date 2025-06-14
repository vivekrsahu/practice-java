package practice.corejava.validators.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.AssertTrue;

@Getter
@Setter
public class EnablingSubscription extends Subscription {

    @AssertTrue(message = "Should be true when enabling", groups = EnablingSubscription.class)
    private boolean enabled;

}