import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValidator implements Validator{
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private List<String> notAllowDomains;

    public EmailValidator() {
        notAllowDomains = Arrays.asList("dom1.cc", "dom2.cc", "dom3.cc");
    }

    public EmailValidator(List<String> notAllowDomains) {
        this.notAllowDomains = notAllowDomains;
    }

    @Override
    public void isValid(User user) {

        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("Email should not empty");
        }

        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(user.getEmail()).matches()) {
            throw new IllegalArgumentException("Email is wrong format");
        }

        if (notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }

    public void addNotAllowDomain(String domain) {
        notAllowDomains.add(domain);
    }
}
