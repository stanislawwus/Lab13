package task1;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@Builder
@ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    @Singular
    private List<String> hobbies;
}