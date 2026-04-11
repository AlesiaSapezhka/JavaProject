package ComplexTasks.User;

public class Main {
    public static void main(String[] args) throws InvalidUserException {
        UserValidator userValidation = new UserValidator();
        userValidation.setValidationEnabled(true);
        try {
            userValidation.checkAllValues("Alex", 78, "tpgmailcom");
            System.out.println("Validation passed");
        } catch (InvalidUserException e) {
            System.out.println("Validation failed: " + e.getMessage());

        }
    }

}
