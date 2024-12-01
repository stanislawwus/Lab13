package task1;

public class TryUser {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Alice")
                .age(25)
                .gender(Gender.FEMALE)
                .hobby("Reading")
                .hobby("Traveling")
                .build();
        System.out.println(user);
    }
}
