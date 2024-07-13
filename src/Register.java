import java.util.ArrayList;
import java.util.List;
public class Register {
    private List<Validator> validators;
    public Register() {
        validators = new ArrayList<>();
        validators.add(new NameValidator());
        validators.add(new EmailValidator());
        validators.add(new AgeValidator());
    }

    public Register(List<Validator> validators) {
        this.validators = validators;
    }

    public boolean register(User user) {
        for (Validator validator : validators) {
            validator.isValid(user);
        }
        return true;
    }
}
