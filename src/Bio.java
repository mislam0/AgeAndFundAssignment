public class Bio {
    private int age;

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        } else if (age > 150) {
            throw new InvalidAgeException("Age cannot be greater than 150");
        }
        this.age = age;
        System.out.println("Age " + age + " is valid and set in Bio");
    }

    public int getAge() {
        return age;
    }
}