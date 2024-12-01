package task1;

import task1.Student.StudentBuilder;

public class TryStudent {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .age(18)
                .email("john@doe.com")
                .gender("Man")
                .course("Math");
        Human human = studentBuilder.build();
        System.out.println(human);
    }
}
