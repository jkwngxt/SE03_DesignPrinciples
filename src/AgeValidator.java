public class AgeValidator implements Validator{

    int minAge;

    public AgeValidator(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public void isValid(User user) {
        if (user.getAge() < minAge) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
