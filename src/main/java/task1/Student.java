package task1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Student extends Human {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;
}
