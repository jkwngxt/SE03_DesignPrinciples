import java.util.ArrayList;
import java.util.List;
public class Register {
    private List<Validator> validators;

    public Register(List<Validator> validators) {
        this.validators = validators;
    }

    public boolean register(User user) {
        for (Validator validator : validators) {
            validator.isValid(user);
        }
        return true;
    }

    public void addValidator(Validator validator) {
        validators.add(validator);
    }
}
