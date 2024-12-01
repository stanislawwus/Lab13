package task1;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
}
