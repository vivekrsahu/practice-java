package practice.corejava.validators.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.AssertFalse;

@Getter
@Setter
public class DisablingSubscription extends Subscription {

    @AssertFalse(message = "Should be false when disabling", groups = DisablingSubscription.class)
    private boolean enabled;

}
