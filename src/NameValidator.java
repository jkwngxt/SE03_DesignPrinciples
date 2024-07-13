/**
 * @author 6510405377 Jitlada Yotinta
 */
public class NameValidator implements Validator{
    private static final String NAME_PATTERN = "[a-zA-Z]+";

    @Override
    public void isValid(User user) {
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Name should not empty");
        }

        if (!user.getName().matches(NAME_PATTERN)) {
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}
