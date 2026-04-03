package practice3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN" + ssn);
    }
    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

}
